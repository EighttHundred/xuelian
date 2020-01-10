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
import ruanku.xuelian_requirement.model.Seeker;
import ruanku.xuelian_requirement.dao.SeekerDao;

@Controller
@RequestMapping("seeker")
public class SeekerController{

    @RequestMapping("center")
    public String center(){
        return "seeker/center";
    }

    //before update ,assure security
    @RequestMapping("edit")
    public ModelAndView edit(HttpSession session,@RequestParam int id){
        ModelAndView mav=new ModelAndView();
        Object obj=session.getAttribute("seekerId");
        assert obj!=null&&(int)obj==id;
        mav.setViewName("seeker/edit");
        mav.addObject("seeker", SeekerDao.select(id));
        return mav;
    }

    @RequestMapping("show")
    public ModelAndView show(@RequestParam int id){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("seeker/show");
        mav.addObject("seeker",SeekerDao.select(id));
        return mav;
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(HttpSession session,@RequestParam int id, @RequestParam Map<String, String> map){
        Object obj=session.getAttribute("seekerId");
        assert obj!=null&&(int)obj==id;
        Seeker seeker=BeanProcessor.newInstance(Seeker.class,map);
        assert seeker != null;
        if(SeekerDao.update(seeker)) return "SUCCESS";
        else return "FAIL";
    }

}