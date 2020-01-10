package ruanku.xuelian_requirement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.JsonProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Enterprise;
@Service
public class EnterpriseDao {

    public static Enterprise select(int id){
        List<Enterprise> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static List<Enterprise> selects(String key,Object value){
        String sql=CommandProcessor.select(Enterprise.class,key,value);
        return MysqlProcessor.select(Enterprise.class,sql);
    }
    public static boolean insert(Enterprise enterprise,int userId){
        enterprise.setUserId(userId);
        return MysqlProcessor.insert(CommandProcessor.insert(enterprise));
    }

    public static boolean update(Enterprise enterprise){
        return MysqlProcessor.update(CommandProcessor.update(enterprise));
    }

    public static boolean delete(int id){
        String sql= CommandProcessor.delete(Enterprise.class,"id",id);
        return MysqlProcessor.delete(sql);
    }

    public static String parse(List<Enterprise> list){
        return JsonProcessor.parse(list);
    }

}