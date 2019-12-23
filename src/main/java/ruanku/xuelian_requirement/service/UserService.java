package ruanku.xuelian_requirement.service;

import java.util.Map;

import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.User;

public class UserService {
    public static String createUser(Map<String,Object> map){
        User user=(User)BeanProcessor.newInstance(User.class, map);
        String sql=CommandProcessor.insert(user);
        if(MysqlProcessor.insert(sql)==true){
            return "true";
        }
        return "false";
    }
    public static String checkUser(Map<String,Object> map){
        String userName=(String)map.get("userName");
        String sql=null;
        if(userName.contains("@")){
            sql=CommandProcessor.select(User.class, "mailAddress", userName);
        }else{
            sql=CommandProcessor.select(User.class, "phoneNumber", userName);
        }
        
        Object user=MysqlProcessor.select(User.class, sql).get(0);
        if(user!=null){
            return BeanProcessor.getString(user,"userType");
        }
        return "null";   
    }
}