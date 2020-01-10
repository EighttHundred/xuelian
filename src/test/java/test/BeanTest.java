package test;

import java.util.Map;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;

public class BeanTest
{
    @Test
    public void searchWithoutCreate()
    {
        //insert failed
        // User user=new User();
        // String sql=CommandProcessor.insert(User.class);
        // if(MysqlProcessor.insert(sql)){
        //     System.out.println("success");
        // }else{
        //     System.out.println("failed");
        // }
    }
    @Test
    public void getTest()
    {
        User user=new User();
        BeanProcessor.set(user, "userId", 1121);
        System.out.println(BeanProcessor.get(user, "userId", Integer.class) );  
    }
    @Test
    public void commandTest(){

//        Seeker seeker=new Seeker();
//        String sql=CommandProcessor.insert(seeker);
//        System.out.println(sql);
//        System.out.println(MysqlProcessor.insert(sql));
    }
    @Test
    public void mapParser()
    {
        // User user=new User();
        // BeanProcessor.set(user, "userId", 1);
        // BeanProcessor.set(user, "passWord", "aaa");
        // Map<String,Object> map=BeanProcessor.parseMap(user);
        // System.out.println(map.get("userId"));
        // System.out.println(map.get("passWord"));
        // System.out.println(map.get("phoneNumber"));
        // User user2=(User)BeanProcessor.newInstance(User.class, map);
        // System.out.println(BeanProcessor.getInt(user2, "userId"));
        // System.out.println(BeanProcessor.getString(user2, "passWord"));
        // System.out.println(BeanProcessor.getString(user2, "phoneNumber"));
        
    }
    @Test
    public void createBean()
    {
//         MysqlProcessor.createTable(CommandProcessor.createTable(User.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Seeker.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Resume.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Reply.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Poster.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Delivery.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Position.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(News.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Issue.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Enterprise.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(Comment.class));
//         MysqlProcessor.createTable(CommandProcessor.createTable(BBSUser.class));
    }
    @Test
    public void dropBean()
    {
//         MysqlProcessor.dropTable("drop table User");
//         MysqlProcessor.dropTable("drop table Seeker");
//         MysqlProcessor.dropTable("drop table Resume");
//         MysqlProcessor.dropTable("drop table Reply");
//         MysqlProcessor.dropTable("drop table Poster");
//         MysqlProcessor.dropTable("drop table Delivery");
//         MysqlProcessor.dropTable("drop table Position");
//         MysqlProcessor.dropTable("drop table News");
//         MysqlProcessor.dropTable("drop table Issue");
//         MysqlProcessor.dropTable("drop table Enterprise");
//         MysqlProcessor.dropTable("drop table Comment");
//         MysqlProcessor.dropTable("drop table BBSUser");
    }
}