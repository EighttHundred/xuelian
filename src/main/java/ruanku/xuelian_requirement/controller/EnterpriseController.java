package ruanku.xuelian_requirement.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
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
    @RequestMapping("positionManage")
    public String positionManage(){
        return "enterprise/positionManage";
    }

    @RequestMapping("doPositionAdd")
    @ResponseBody
    public String doPositionAdd(HttpSession session,Map<String,Object> map){
        return EnterpriseService.addPosition(session,map);
    }
}