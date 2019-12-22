package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/select")
public class SelectController{
    @RequestMapping("/a")
    public String a(){
        return "select/a";
    }
    @RequestMapping("/selects")
    public String selects(){
        return "select/selects";
    }
}