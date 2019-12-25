package ruanku.xuelian_requirement.common.processors;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MysqlProcessor
{
    private static String url="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=GMT&characterEncoding=gbk&allowPublicKeyRetrieval=true";
    private static String username="root";
    private static String password="eight";
    private static Connection conn=null;
    private static Statement stmt;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,username,password);
            conn.setAutoCommit(true);
            stmt=conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static boolean createTable(String sql){
        try{
            stmt.execute(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean update(String sql){
        try{
            stmt.execute(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean insert(String sql){
        try{
            stmt.execute(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean dropTable(String sql){
        try{
            stmt.execute(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public static <T> List<T> select(Class<T> beanType,String sql){
        try{
            List<T> resList=new ArrayList<>();
            ResultSet rs=stmt.executeQuery(sql);
            T bean=beanType.getDeclaredConstructor().newInstance();
            while(rs.next()){
                Field[] fields=beanType.getDeclaredFields();
                for(Field field:fields){
                    field.setAccessible(true);
                    String name=field.getName();
                    field.set(bean,rs.getObject(name));
                }
                resList.add(bean);
            }
            return resList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}