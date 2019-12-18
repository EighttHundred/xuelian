package test;

import org.junit.Test;

import net.sf.json.JSONObject;
import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;

public class JsonTest {
    @Test
    public void test() {
        Issue issue = new Issue();
        JSONObject json = JSONObject.fromObject(issue);
        json.put("content", "wtf?");
        Issue issue1 = (Issue) JSONObject.toBean(json, Issue.class);
        JSONObject json1 = JSONObject.fromObject(issue1);
        System.out.println(json.toString());
        System.out.println(json1.toString());

        String jsonData=json.toString();
        jsonData=jsonData.substring(1,jsonData.length()-1);
        String[] pairs=jsonData.split(",");
        for(String pair:pairs)
        {
            String[] str=pair.split(":");
            str[0]=str[0].trim().replace("\"", "");
            str[1]=str[1].trim().replace("\"", "");
            System.out.println(str[0]+" "+"\""+str[1]+"\"");
        }

    }
    @Test
    public void test2() 
    {
        Comment comment=new Comment();
        try {
            JSONObject json=JsonProcessor.toJson(comment);
            System.out.println(json.toString());
            json.put("content","hahaha");
            Comment comment1=(Comment)JsonProcessor.toBean(json,Comment.class);
            JSONObject json1=JsonProcessor.toJson(comment1);
            System.out.println(json1.toString());
        } catch (Exception e) {
            System.out.println("error test");
        }
    }
}
