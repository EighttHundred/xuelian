package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("")
public class UserController{
    @RequestMapping("/common")
    public String common(){
        //System.out.println("test it");
        return "common";
    }
    @RequestMapping("")
    public String index(){
        //System.out.println("test it");
        return "page";
    }
}