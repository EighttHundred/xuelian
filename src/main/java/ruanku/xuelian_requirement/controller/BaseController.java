package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("")
public class BaseController{
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/view/jobfairs")
    public String page(){
        return "view/JobFairs";
    }
}