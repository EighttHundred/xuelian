package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.dao.ResumeDao;
import ruanku.xuelian_requirement.model.Resume;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("resume")
public class ResumeController{

    @RequestMapping("create")
    public String create(){
        return "resume/create";
    }

    @RequestMapping("get")
    @ResponseBody
    public String layuiGet(@RequestParam int seekerId){
        List<Resume> list= ResumeDao.selects("seekerId",seekerId);
        return ResumeDao.parse(list);
    }

    @RequestMapping("delete")
    @ResponseBody
    public String doResumeDelete(@RequestParam int resumeId){
        if(ResumeDao.delete(resumeId)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestParam Map<String,String> map){
        //add id and seekerId to view
        Resume resume= BeanProcessor.newInstance(Resume.class, map);
        assert resume != null;
        if(ResumeDao.update(resume)) return "TRUE";
        else return "FAIL";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestParam int seekerId,@RequestParam Map<String,String> map){
        Resume resume=BeanProcessor.newInstance(Resume.class, map);
        assert resume!=null;
        resume.setSeekerId(seekerId);
        if(ResumeDao.insert(resume)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("manage")
    public String manage(){
        return "resume/manage";
    }

    @RequestMapping("show")
    public ModelAndView show(@RequestParam int id){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("resume/show");
        mav.addObject("resume", ResumeDao.select(id));
        return mav;
    }

    //before update assure security
    @RequestMapping("edit")
    public ModelAndView edit(HttpSession session, @RequestParam int id){
        ModelAndView mav=new ModelAndView();
        Object obj=session.getAttribute("enterpriseId");
        assert obj!=null;
        List<Resume> list=ResumeDao.selects("enterpriseId",obj);
        assert !list.isEmpty();
        mav.setViewName("resume/edit");
        mav.addObject("resume", list.get(0));
        return mav;
    }
}