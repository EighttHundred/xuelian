package ruanku.xuelian_requirement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import net.sf.json.JSONObject;
import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.common.processors.JsonProcessor;
import ruanku.xuelian_requirement.model.User;
@Controller
@RequestMapping("BBS")
@SessionAttributes()
public class BBSController{
    @RequestMapping("content")
    public String content(Model model){
        
        return "BBS/content";
    }
    @RequestMapping("page")
    public String page(){
        return "BBS/page";
    }

    @RequestMapping("test")
    public String test(){
        return "BBS/test";
    }
    @RequestMapping("get")
    @ResponseBody
    public String get(){
        User user=new User();
        BeanProcessor.set(user, "userId", 1);
        BeanProcessor.set(user, "mailAddress", "2607577828@qq.com");
        JSONObject obj=JsonProcessor.toJson(user);
        return "["+obj.toString()+"]";
    }
}