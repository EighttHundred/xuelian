package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("")
public class BaseController{
    @RequestMapping("")
    public String index(){
        return "index";
    }
    @RequestMapping("index")
    public String index2(){
        return "index";
    }
    @RequestMapping("jobFair")
    public String fair(){
        return "jobFair";
    }
    @RequestMapping("jobFind")
    public String find(){
        return "jobFind";
    }
}