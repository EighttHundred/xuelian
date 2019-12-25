package ruanku.xuelian_requirement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.CommandProcessor;
import ruanku.xuelian_requirement.common.processors.MysqlProcessor;
import ruanku.xuelian_requirement.model.Enterprise;
import ruanku.xuelian_requirement.model.Position;
@Service
public class EnterpriseService {
    public static String getPositions(){
        return "haha";
        
    }
    public static String addPosition(int enterpriseId,Position position){
        BeanProcessor.set(position,"enterpriseId",enterpriseId);
        BeanProcessor.set(position, "show", false);
        if(MysqlProcessor.insert(CommandProcessor.insert(position))==true){
            return "SUCCESS";
        }
        return "FAIL";
    }
    public static String updatePosition(Position position){
        if(MysqlProcessor.update(CommandProcessor.update(position))==true){
            return "SUCCESS";
        }
        return "FAIL";
    }
    public static List<Map<String,Object>> getPositions(int enterpriseId){
        List<Map<String,Object>> mList=new ArrayList<>();
        String sql=CommandProcessor.select(Position.class, "enterpriseId", enterpriseId);
        List<Position> aList=MysqlProcessor.select(Position.class, sql);
        for(Position position:aList){
            mList.add(BeanProcessor.parseMap(position));
        }
        return mList;
    } 
    public static Map<String,Object> getPosition(int positionId){
        String sql=CommandProcessor.select(Position.class, "positionId", positionId);
        List<Position> positions=MysqlProcessor.select(Position.class, sql);
        Position position=null;
        if(positions.isEmpty()){
            position=new Position();
        }else{
            position=positions.get(0);
        }
        return BeanProcessor.parseMap(position);
    }
}