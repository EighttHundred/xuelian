package test;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.processors.*;


public class TimeTest {
    @Test
    public void datetest(){
        System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
        
    }
    @Test
    public void timeStampTest(){
        Timestamp timeStamp=new Timestamp(Calendar.getInstance().getTimeInMillis());
        System.out.println(timeStamp.getDate());
    }
}
