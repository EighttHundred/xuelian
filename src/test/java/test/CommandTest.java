package test;

import org.junit.Test;

import ruanku.xuelian_requirement.BBS.model.*;
import ruanku.xuelian_requirement.common.processors.*;

public class CommandTest
{
    @Test
    public void test1()
    {
        Issue issue=new Issue();
        BeanProcessor.set(issue,"content", "vivivivivi");
        BeanProcessor.set(issue,"issueId", 5);
        BeanProcessor.set(issue,"likes", 123);
        System.out.println(CommandProcessor.createTable(Issue.class));
        System.out.println(CommandProcessor.insert(issue));
        System.out.println(CommandProcessor.update(issue));
        System.out.println(CommandProcessor.select(Issue.class,"userId",111));

    }
}