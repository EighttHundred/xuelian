package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.dao.PositionDao;
import ruanku.xuelian_requirement.model.Position;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("position")
public class PositionController{

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestParam int enterpriseId,@RequestParam Map<String,String> map){
        Position position= BeanProcessor.newInstance(Position.class, map);
        if(PositionDao.insert(enterpriseId,position)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("create")
    public String create(){
        return "position/create";
    }

    @RequestMapping("manage")
    public String positionManage(){
        return "position/manage";
    }

    @RequestMapping("show")
    public ModelAndView show(@RequestParam int id){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("position/show");
        mav.addObject("position", PositionDao.select(id));
        return mav;
    }

    //before update assure security
    @RequestMapping("edit")
    public ModelAndView edit(HttpSession session, @RequestParam int id){
        ModelAndView mav=new ModelAndView();
        Object obj=session.getAttribute("enterpriseId");
        assert obj!=null;
        List<Position> list=PositionDao.selects("enterpriseId",obj);
        assert !list.isEmpty();
        mav.setViewName("position/edit");
        mav.addObject("position", list.get(0));
        return mav;
    }

    @RequestMapping("update")
    @ResponseBody
    public String doPositionUpdate(@RequestParam Map<String,String> map){
        //add id and enterpriseId to view
        Position position=BeanProcessor.newInstance(Position.class, map);
        assert position != null;
        if(PositionDao.update(position)) return "SUCCESS";
        else return "FAIL";
    }

    //search
    @RequestMapping("get")
    @ResponseBody
    public String layuiGet(@RequestParam String key,@RequestParam Object value){
        List<Position> list=PositionDao.selects(key,value);
        return PositionDao.parse(list);
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam int id){
        if(PositionDao.delete(id)) return "SUCCESS";
        return "FAIL";
    }

}