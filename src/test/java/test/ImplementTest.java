package test;

import java.lang.reflect.Method;

import org.junit.Test;

import net.sf.json.JSONObject;
import ruanku.xuelian_requirement.common.sqls.*;
public class ImplementTest
{
    @Test
    public void test()
    {

        Mysql mysql = new ruanku.xuelian_requirement.common.sqls.Mysql() {
            
            @Override
            public Object[] select(String args) {
                
                // TODO Auto-generated method stub
                System.out.println("test successs");
                return null;
            }
        };
        mysql.select("args");
    }
}