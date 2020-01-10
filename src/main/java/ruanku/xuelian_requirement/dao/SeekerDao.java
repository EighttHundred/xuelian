package ruanku.xuelian_requirement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Seeker;
import ruanku.xuelian_requirement.model.Resume;

@Service
public class SeekerDao {

    public static Seeker select(int id){
        List<Seeker> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static List<Seeker> selects(String key,Object value){
        String sql=CommandProcessor.select(Seeker.class,key,value);
        return MysqlProcessor.select(Seeker.class,sql);
    }

    public static boolean update(Seeker seeker){
        return MysqlProcessor.update(CommandProcessor.update(seeker));
    }

    public static boolean insert(Seeker seeker,int userId){
        seeker.setUserId(userId);
        return MysqlProcessor.insert(CommandProcessor.insert(seeker));
    }
}