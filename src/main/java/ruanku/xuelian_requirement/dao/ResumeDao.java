package ruanku.xuelian_requirement.dao;

import org.springframework.stereotype.Service;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.JsonProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Resume;
import java.util.List;

@Service
public class ResumeDao {

    public static boolean insert(Resume resume){
        return MysqlProcessor.insert(CommandProcessor.insert(resume));
    }

    public static boolean update(Resume resume){
        return MysqlProcessor.update(CommandProcessor.update(resume));
    }

    public static boolean delete(int id){
        String sql= CommandProcessor.delete(Resume.class,"id",id);
        return MysqlProcessor.delete(sql);
    }

    public static Resume select(int id){
        List<Resume> list=selects("id",id);
        if(!list.isEmpty()) return list.get(0);
        else return null;
    }

    public static List<Resume> selects(String key,Object value){
        String sql=CommandProcessor.select(Resume.class,key,value);
        return MysqlProcessor.select(Resume.class,sql);
    }

    public static String parse(List<Resume> list){
        return JsonProcessor.parse(list);
    }
}
