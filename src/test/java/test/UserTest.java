package test;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;


public class UserTest {
    @Test
    public void create(){

        //建表
        // System.out.println(CommandProcessor.createTable(User.class));
        // if(MysqlProcessor.createTable(CommandProcessor.createTable(User.class))==true){
        //     System.out.println("create success");
        // }
    }
    @Test
    public void insert(){
        //插入
        // Map<String,Object> map=new HashMap<String,Object>();
        // map.put("passWord", "123");
        // map.put("mailAddress", "111");
        // map.put("phoneNumber", "123");
        // User user=(User)BeanProcessor.newInstance(User.class, map);
        // if(MysqlProcessor.insert(CommandProcessor.insert(user))==true){
        //     System.out.println("insert success");
        // }
    }
}
