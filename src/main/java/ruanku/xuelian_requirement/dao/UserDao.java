package ruanku.xuelian_requirement.dao;

import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.User;

import java.util.List;

public class UserDao {

    public static User select(int id){
        List<User> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static User selectFirst(String key,Object value){
        List<User> list=selects(key,value);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static List<User> selects(String key, Object value){
        String sql= CommandProcessor.select(User.class,key,value);
        return MysqlProcessor.select(User.class,sql);
    }

    public static boolean insert(User user){
        return MysqlProcessor.insert(CommandProcessor.insert(user));
    }

    public static boolean update(User user){
        return MysqlProcessor.update(CommandProcessor.update(user));
    }

    public static boolean delete(int id){
        String sql= CommandProcessor.delete(User.class,"id",id);
        return MysqlProcessor.delete(sql);
    }
}
