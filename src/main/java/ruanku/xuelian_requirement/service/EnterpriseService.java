package ruanku.xuelian_requirement.service;

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
    public static String addPosition(HttpSession session,Map<String,Object> map){
        Enterprise enterprise=(Enterprise)session.getAttribute("enterprise");
        int enterpriseId=BeanProcessor.getInt(enterprise, "enterpriseId");
        Position position=(Position)BeanProcessor.newInstance(Position.class, map);
        BeanProcessor.set(position,"enterpriseId",enterpriseId);
        BeanProcessor.set(position, "show", false);
        if(MysqlProcessor.insert(CommandProcessor.insert(position))==true){
            return "SUCCESS";
        }
        return "FAIL";
    }
}