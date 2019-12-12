package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import ruanku.xuelian_requirement.dao.DeptMapper;
import ruanku.xuelian_requirement.model.Dept;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SelectTest {
    @Test
    public void test() {
        String resource = "spring-mybatis.xml";
        SqlSession sqlSession =null;
        try {
            SqlSessionFactory sqlSessionFactory=null;
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            InputStream is = Resources.getResourceAsStream(resource);
            sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            sqlSession = sqlSessionFactory.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//            List<Dept> depts = mapper.queryAll();
//            for (Dept dept : depts) {
//                System.out.println(dept);
//            }
            List<Dept> depts2 = mapper.queryAll2();
            for (Dept dept2 : depts2) {
                System.out.println(dept2);
            }
            //BaseDomain userMapper = sqlSession.getMapper(BaseDomain.class);
//            System.out.println(baseDomain.getComName());
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
