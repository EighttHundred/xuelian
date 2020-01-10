package ruanku.xuelian_requirement.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruanku.xuelian_requirement.common.processors.BeanProcessor;
import ruanku.xuelian_requirement.model.User;
import ruanku.xuelian_requirement.service.RegistService;
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


    @RequestMapping("doSeekerRegist")
    @ResponseBody
    public String doSeekerRegist(@RequestParam Map<String,String> map){
        if(RegistService.createSeeker(map)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("doEnterpriseRegist")
    @ResponseBody
    public String doEnterpriseRegist(@RequestParam Map<String,String> map){
        if(RegistService.createEnterprise(map)) return "SUCCESS";
        else return "FAIL";
    }

    @RequestMapping("doLogin")
    @ResponseBody
    public String login(HttpSession session,@RequestParam Map<String,String> map){
        User user=BeanProcessor.newInstance(User.class, map);
        String status= RegistService.checkUser(session,user);
        return status;
    }

    @RequestMapping("doLogout")
    public String logout(HttpSession session){
        RegistService.logout(session);
        return "index";
    }
}