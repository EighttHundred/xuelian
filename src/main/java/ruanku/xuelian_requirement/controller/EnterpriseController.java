package ruanku.xuelian_requirement.controller;

import java.util.Map;

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

    @RequestMapping("positionEdit")
    public String positionEdit(){
        return "enterprise/positionEdit";
    }
    @RequestMapping("positionManage")
    public String positionManage(){
        return "enterprise/positionManage";
    }
}