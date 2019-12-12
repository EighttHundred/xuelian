package test;

import ruanku.xuelian_requirement.dao.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用途：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Dept_Test
{

    @Autowired
    DeptMapper deptDao;
    @Test
    public void test1()
    {
        System.out.println("test success");
    }
    @Test
    public void queryall() {
        System.err.println( deptDao.queryAll().size());
    }
    @Test
    public void queryall2() {
        System.out.println( deptDao.queryAll2().size());
    }
}
