package ruanku.xuelian_requirement.service;

import java.util.Map;

import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.User;

public class UserService {
    public static boolean createUser(Map<String,Object> map){
        User user=(User)BeanProcessor.newInstance(User.class, map);
        String sql=CommandProcessor.insert(user);
        if(MysqlProcessor.insert(sql)==true){
            return true;
        }else{
            return false;
        }
    }
}