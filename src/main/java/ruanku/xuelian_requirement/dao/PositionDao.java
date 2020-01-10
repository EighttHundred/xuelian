package ruanku.xuelian_requirement.dao;

import org.springframework.stereotype.Service;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.JsonProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Position;
import java.util.List;

@Service
public class PositionDao {

    public static boolean insert(int enterpriseId,Position position){
        BeanProcessor.set(position,"enterpriseId",enterpriseId);
        BeanProcessor.set(position, "onShow", 0);
        return MysqlProcessor.insert(CommandProcessor.insert(position));
    }

    public static boolean update(Position position){
        return MysqlProcessor.update(CommandProcessor.update(position));
    }

    public static boolean delete(int id){
        String sql= CommandProcessor.delete(Position.class,"id",id);
        return MysqlProcessor.delete(sql);
    }

    public static Position select(int id){
        List<Position> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static List<Position> selects(String key,Object value){
        String sql=CommandProcessor.select(Position.class,key,value);
        return MysqlProcessor.select(Position.class,sql);
    }

    public static List<Position> selectAll(){
        String sql=CommandProcessor.selectAll(Position.class);
        return MysqlProcessor.select(Position.class,sql);
    }

    public static String parse(List<Position> list){
        return JsonProcessor.parse(list);
    }
}
