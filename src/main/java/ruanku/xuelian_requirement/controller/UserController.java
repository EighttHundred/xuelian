package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
@Controller
@RequestMapping("/user")
public class UserController{
    @RequestMapping("/center")
    public String center(){
        return "user/center";
    }
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("regist")
    public String regist(){
        return "user/regist";
    }
    @RequestMapping("show")
    @ResponseBody
    public String show(JSONObject data){
        return data.toString();
    }
}