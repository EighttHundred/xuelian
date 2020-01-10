package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ruanku.xuelian_requirement.dao.DeliveryDao;
import ruanku.xuelian_requirement.model.Delivery;
import ruanku.xuelian_requirement.service.DeliveryService;

@Controller
@RequestMapping("delivery")
public class DeliveryController {

    @RequestMapping("get")
    @ResponseBody
    public String layuiGet(@RequestParam int id,@RequestParam int type){
        return DeliveryService.layuiGet(id,type);
    }

    @RequestMapping("manage")
    public String deliveryManage(){
        return "delivery/manage";
    }

    @RequestMapping("show")
    public ModelAndView show(@RequestParam int id){
        ModelAndView mv=new ModelAndView();
        Delivery delivery= DeliveryDao.select(id);
        mv.setViewName("delivery/show");
        mv.addObject(delivery);
        return mv;
    }

    @RequestMapping("deliver")
    @ResponseBody
    public String deliver(@RequestParam int resumeId,@RequestParam int positionId){
        if(DeliveryService.deliver(resumeId,positionId)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("prepare")
    public ModelAndView prepare(@RequestParam int positionId){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("delivery/prepare");
        mav.addObject("positionId",positionId);
        return mav;
    }


}
