package ruanku.xuelian_requirement.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.model.Enterprise;
import ruanku.xuelian_requirement.dao.EnterpriseDao;

@Controller
@RequestMapping("enterprise")
public class EnterpriseController{

    @RequestMapping("center")
    public String enterprise(){
        return "enterprise/enterpriseCenter";
    }

    //before update ,assure security
    @RequestMapping("edit")
    public ModelAndView edit(HttpSession session, @RequestParam int id){
        ModelAndView mav=new ModelAndView();
        Object obj=session.getAttribute("enterpriseId");
        assert obj!=null&&(int)obj==id;
        mav.setViewName("enterprise/edit");
        mav.addObject("seeker", EnterpriseDao.select(id));
        return mav;
    }

    @RequestMapping("show")
    public ModelAndView show(@RequestParam int id){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("enterprise/show");
        mav.addObject("enterprise",EnterpriseDao.select(id));
        return mav;
    }

    @RequestMapping("update")
    @ResponseBody
    public String doEnterpriseUpdate(HttpSession session,@RequestParam int id,@RequestParam int userId,@RequestParam Map<String,String> map){
        Enterprise enterprise=BeanProcessor.newInstance(Enterprise.class,map);
        assert enterprise != null;
        enterprise.setUserId(userId);
        if(EnterpriseDao.update(enterprise)){
            session.setAttribute("enterprise",enterprise);
            return "SUCCESS";
        }else return "FAIL";
    }

}