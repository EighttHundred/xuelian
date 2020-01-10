package ruanku.xuelian_requirement.dao;

import org.springframework.stereotype.Service;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.JsonProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Delivery;

import java.util.List;

@Service
public class DeliveryDao {

    public static boolean insert(Delivery delivery){
        return MysqlProcessor.insert(CommandProcessor.insert(delivery));
    }

    public static String parse(List<Delivery> list){
        return JsonProcessor.parse(list);
    }

    public static List<Delivery> selects(String key,Object value){
        String sql=CommandProcessor.select(Delivery.class,key,value);
        return MysqlProcessor.select(Delivery.class,sql);
    }

    public static Delivery select(int id){
        List<Delivery> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }
}
