package ruanku.xuelian_requirement.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruanku.xuelian_requirement.service.UserService;
@Controller
@RequestMapping("user")
public class UserController{
    @RequestMapping("login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("regist")
    public String regist(){
        return "user/regist";
    }
    @RequestMapping("seekerRegist")
    @ResponseBody
    public String seekerRegist(@RequestParam Map<String,Object> map){
        if(UserService.createUser(map)==true){
            return "true";
        }else{
            return "false";
        }
    }
}