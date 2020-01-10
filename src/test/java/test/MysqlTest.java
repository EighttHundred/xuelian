package test;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;
import java.util.List;
public class MysqlTest {
    @Test
    public void createIssue(){
        // String sql=CommandProcessor.createTable(Issue.class);
        // System.out.println(sql);
        // boolean ret=MysqlProcessor.createTable(sql);
        // System.out.println(ret);
    }
    @Test
    public void insertIssue() {
        // Issue issue=new Issue();
        // BeanProcessor.set(issue, "content", "vivaviva");
        // String sql=CommandProcessor.insert(issue);
        // boolean rec=MysqlProcessor.insert(sql);
        // System.out.println(rec);
    }
    @Test
    public void test2(){
        // String sql=CommandProcessor.select(Issue.class,"issueId",2);
        // List<?> issues=MysqlProcessor.select(Issue.class,sql );
        // for(Issue issue:(List<Issue>)issues){
        //     System.out.println(BeanProcessor.getString(issue, "content"));
        // }
    }
}
