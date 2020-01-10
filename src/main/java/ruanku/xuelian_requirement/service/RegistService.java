package ruanku.xuelian_requirement.service;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import ruanku.xuelian_requirement.common.enums.UserType;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.dao.EnterpriseDao;
import ruanku.xuelian_requirement.dao.SeekerDao;
import ruanku.xuelian_requirement.dao.UserDao;
import ruanku.xuelian_requirement.model.Enterprise;
import ruanku.xuelian_requirement.model.Seeker;
import ruanku.xuelian_requirement.model.User;

@Service
public class RegistService {

    private static boolean createUser(Map<String,String> map,String type){
        User user=BeanProcessor.newInstance(User.class, map);
        assert user != null;
        user.setType(type);
        if(UserDao.selectFirst("phone",user.getPhone())!=null) return false;
        UserDao.insert(user);
        return true;
    }


    public static boolean createSeeker(Map<String,String> map){
        if(!createUser(map, "SEEKER")) return false;
        String phone=map.get("phone");
        assert phone!=null;
        User user=UserDao.selectFirst("phone",phone);
        Seeker seeker=new Seeker();
        seeker.setName(map.get("name"));
        SeekerDao.insert(seeker,user.getId());
        return true;
    }

    public static boolean createEnterprise(Map<String,String> map){
        if(!createUser(map, "ENTERPRISE")) return false;
        String phone=map.get("phone");
        assert phone!=null;
        User user=UserDao.selectFirst("phone",phone);
        Enterprise enterprise=new Enterprise();
        enterprise.setName(map.get("name"));
        EnterpriseDao.insert(enterprise,user.getId());
        return true;
    }

    public static String checkUser(HttpSession session,User user){
        String phone=BeanProcessor.get(user,"phone",String.class);
        String passWord=BeanProcessor.get(user,"passWord",String.class);
        List<?> userList=MysqlProcessor.select(User.class, CommandProcessor.select(User.class, "phone", phone));
        if(!userList.isEmpty()){
            User dUser=(User)userList.get(0);
            if(passWord.equals(BeanProcessor.getString(dUser, "passWord"))){
                String type=BeanProcessor.get(dUser, "type", String.class);
                int id=BeanProcessor.get(dUser, "id", Integer.class);
                session.setAttribute("user", dUser);
                String sql=null;
                if(type.equals(UserType.SEEKER.name())){
                    sql=CommandProcessor.select(Seeker.class, "userId", id);
                    Seeker seeker=MysqlProcessor.select(Seeker.class, sql).get(0);
                    session.setAttribute("seeker", seeker);
                }else if(type.equals(UserType.ENTERPRISE.name())){
                    sql=CommandProcessor.select(Enterprise.class, "userId", id);
                    Enterprise enterprise=MysqlProcessor.select(Enterprise.class, sql).get(0);
                    session.setAttribute("enterprise", enterprise);
                }else if(type.equals(UserType.ROOT.name())){
                    //unsolved
                }
                return "SUCCESS";
            }else{
                return "WRONG";
            }
        }
        return "NONE";
    }

    public static void logout(HttpSession session){
        if(session.getAttribute("user")!=null){
            session.removeAttribute("user");
        }
        if(session.getAttribute("seeker")!=null){
            session.removeAttribute("seeker");
        }
        if(session.getAttribute("enterprise")!=null){
            session.removeAttribute("enterprise");
        }
    }

}