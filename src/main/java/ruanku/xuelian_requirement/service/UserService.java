package ruanku.xuelian_requirement.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ruanku.xuelian_requirement.common.enums.UserType;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.BBSUser;
import ruanku.xuelian_requirement.model.Enterprise;
import ruanku.xuelian_requirement.model.Seeker;
import ruanku.xuelian_requirement.model.User;
@Service
public class UserService {
    private static boolean createBBSUser(int userId,String userName){
        BBSUser buser=new BBSUser();
        BeanProcessor.set(buser, "userId", userId);
        BeanProcessor.set(buser, "nickName", userName);
        BeanProcessor.set(buser, "level", 0);
        BeanProcessor.set(buser, "experience", 0);
        MysqlProcessor.insert(CommandProcessor.insert(buser));
        return true;
    }
    private static int createUser(Map<String,Object> map,String type){
        User user=(User)BeanProcessor.newInstance(User.class, map);
        BeanProcessor.set(user, "userType",type);
        if(MysqlProcessor.select(User.class,CommandProcessor.select(User.class, "phoneNumber", BeanProcessor.getString(user, "phoneNumber"))).isEmpty()==false){
            return 0;
        }
        MysqlProcessor.insert(CommandProcessor.insert(user));
        return 1;
    }
    public static String createSeeker(Map<String,Object> map){
        if(createUser(map,UserType.SEEKER.name())==0){
            return "EXIST";
        }
        Seeker seeker=new Seeker();
        String userName=(String)map.get("userName");
        User user=(User)MysqlProcessor.select(User.class,CommandProcessor.select(User.class, "phoneNumber", map.get("phoneNumber"))).get(0);
        int userId=BeanProcessor.getInt(user, "userId");
        BeanProcessor.set(seeker, "userName", userName);
        BeanProcessor.set(seeker, "userId", userId);
        MysqlProcessor.insert(CommandProcessor.insert(seeker));
        createBBSUser(userId, userName);
        return "TRUE";
    }

    public static String createEnterprise(Map<String,Object> map){
        if(createUser(map,UserType.ENTERPRISE.name())==0){
            return "EXIST";
        }
        Enterprise enterprise=new Enterprise();
        String name=(String)map.get("name");
        User user=(User)MysqlProcessor.select(User.class,CommandProcessor.select(User.class, "phoneNumber", map.get("phoneNumber"))).get(0);
        int userId=BeanProcessor.getInt(user, "userId");
        BeanProcessor.set(enterprise, "name", name);
        BeanProcessor.set(enterprise, "userId", userId);
        MysqlProcessor.insert(CommandProcessor.insert(enterprise));
        createBBSUser(userId, name);
        return "TRUE";
    }

    public static String checkLogin(Map<String,Object> map){
        String phoneNumber=(String)map.get("phoneNumber");
        List<?> userList=MysqlProcessor.select(User.class, CommandProcessor.select(User.class, "phoneNumber", phoneNumber));
        if(userList.isEmpty()==false){
            User user=(User)userList.get(0);
            if(map.get("passWord").equals(BeanProcessor.getString(user, "passWord"))){
                return BeanProcessor.getString(user,"userType");
            }else{
                return "WRONG";
            }
        }
        return "NO";   
    }
}