package ruanku.xuelian_requirement.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.model.Position;
import ruanku.xuelian_requirement.service.EnterpriseService;;
@Controller
@RequestMapping("enterprise")
public class EnterpriseController{
    @RequestMapping("center")
    public ModelAndView enterpriseCenter(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/enterpriseCenter");
        mav.addObject("test", "hahaha");
        return mav;
    }

    @RequestMapping("positionAdd")
    public ModelAndView positionAdd(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/positionAdd");
        return mav;
    }
    
    @RequestMapping("positionEdit")
    public ModelAndView positionEdit(HttpServletRequest req){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/positionShow");
        int positionId=(int)((Map<String,Object>)req.getAttribute("position")).get("positionId");
        mav.addObject("positions", EnterpriseService.getPositions(positionId));
        return mav;
    }
    @RequestMapping("positionShow")
    public ModelAndView positionShow(HttpServletRequest req){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/positionShow");
        int enterpriseId=(int)((Map<String,Object>)req.getAttribute("enterprise")).get("enterpriseId");
        mav.addObject("positions", EnterpriseService.getPositions(enterpriseId));
        return mav;
    }

    @RequestMapping("positionManage")
    public ModelAndView positionManage(HttpSession session){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/positionEdit");
        int enterpriseId=(int)((Map<String,Object>)session.getAttribute("enterprise")).get("enterpriseId");
        mav.addObject("position", EnterpriseService.getPositions(enterpriseId));
        return mav;
    }

    @RequestMapping("doPositionAdd")
    @ResponseBody
    public String doPositionAdd(HttpSession session,Map<String,Object> map){
        Position position=BeanProcessor.newInstance(Position.class, map);
        int enterpriseId=(int)((Map<String,Object>)session.getAttribute("enterprise")).get("enterpriseId");
        String reply=EnterpriseService.addPosition(enterpriseId,position);
        return reply;
    }

    @RequestMapping("doPositionUpdate")
    @ResponseBody
    public String doPositionUpdate(HttpServletRequest req,Map<String,Object> map){
        Position position=(Position)BeanProcessor.newInstance(Position.class, map);
        String reply=EnterpriseService.updatePosition(position);
        return reply;
    }

}