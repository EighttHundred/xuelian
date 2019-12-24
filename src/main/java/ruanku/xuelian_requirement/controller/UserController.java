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
    @RequestMapping("choose")
    public String chooseRegist(){
        return "user/chooseRegist";
    }
    @RequestMapping("seekerRegist")
    public String seeker(){
        return "user/seekerRegist";
    }
    @RequestMapping("enterpriseRegist")
    public String enterprise(){
        return "user/enterpriseRegist";
    }
    
    @RequestMapping("seekerCenter")
    public String seekerCenter(){
        return "user/seekerCenter";
    }

    @RequestMapping("BBSUserCenter")
    public String BBSUserCenter(){
        return "user/BBSUserCenter";
    }

    @RequestMapping("doSeekerRegist")
    @ResponseBody
    public String seekerRegist(@RequestParam Map<String,Object> map){
        return UserService.createSeeker(map);
    }
    @RequestMapping("doEnterpriseRegist")
    @ResponseBody
    public String enterpriseRegist(@RequestParam Map<String,Object> map){
        return UserService.createEnterprise(map);
    }

    @RequestMapping("doCheckLogin")
    @ResponseBody
    public String checkLogin(@RequestParam Map<String,Object> map){
        return UserService.checkLogin(map);
    }
}