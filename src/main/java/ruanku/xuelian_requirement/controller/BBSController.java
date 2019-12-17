package ruanku.xuelian_requirement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BBSController{
    @RequestMapping("/BBS")
    public String test(){

        //System.out.println("test it");
        return "foward:/index.jsp";
    }
}