package ruanku.xuelian_requirement.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ruanku.xuelian_requirement.service.UserService;
@Controller
@RequestMapping("seeker")
public class SeekerController{
    @RequestMapping("seekerCenter")
    public String enterpriseCenter(){
        return "seeker/enterpriseCenter";
    }
}