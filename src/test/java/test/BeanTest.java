package test;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;

public class BeanTest
{
    @Test
    public void searchWithoutCreate()
    {
        //insert failed
        User user=new User();
        String sql=CommandProcessor.insert(User.class);
        if(MysqlProcessor.insert(sql)){
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }
    @Test
    public void createBean()
    {
        // MysqlProcessor.createTable(CommandProcessor.createTable(User.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Seeker.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Resume.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Reply.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Poster.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Position.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(News.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Issue.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Enterprise.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(Comment.class));
        // MysqlProcessor.createTable(CommandProcessor.createTable(BBSUser.class));
    }
    @Test
    public void dropBean()
    {
        // MysqlProcessor.dropTable("drop table User");
        // MysqlProcessor.dropTable("drop table Seeker");
        // MysqlProcessor.dropTable("drop table Resume");
        // MysqlProcessor.dropTable("drop table Reply");
        // MysqlProcessor.dropTable("drop table Poster");
        // MysqlProcessor.dropTable("drop table Position");
        // MysqlProcessor.dropTable("drop table News");
        // MysqlProcessor.dropTable("drop table Issue");
        // MysqlProcessor.dropTable("drop table Enterprise");
        // MysqlProcessor.dropTable("drop table Comment");
        // MysqlProcessor.dropTable("drop table BBSUser");
    }
}