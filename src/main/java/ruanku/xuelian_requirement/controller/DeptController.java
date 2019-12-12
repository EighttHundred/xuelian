package ruanku.xuelian_requirement.controller;
import ruanku.xuelian_requirement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用途：
 */
@Controller
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    DeptService deptService;

    @RequestMapping("/index")
    @ResponseBody
    public String  index(){
        return "xxx";
    }

    @RequestMapping("/list")
    public String  list(){
        return "dept/list";
    }
    @RequestMapping("/save")
    public String  save(){
        return "dept/save";
    }

    @RequestMapping("/ajaxList")
    @ResponseBody
    public Object  ajaxList(){
        Map<String,Object>map=new HashMap<>();
        map.put("code",0);
        map.put("count",1);
        map.put("msg","数据加载完毕");
        map.put("data",deptService.queryAll());
        return map;
    }
}
