package test;

import org.junit.Test;

import ruanku.xuelian_requirement.BBS.model.*;
import ruanku.xuelian_requirement.common.processors.*;

public class BeanTest
{
    @Test
    public void test1()
    {
        Comment comment=new Comment();
        BeanProcessor.set(comment,"commentId", 2);
        System.out.println(BeanProcessor.getInt(comment,"commentId"));
        BeanProcessor.set(comment,"content", "viva happy");
        System.out.println(BeanProcessor.getString(comment,"content"));
    }
}