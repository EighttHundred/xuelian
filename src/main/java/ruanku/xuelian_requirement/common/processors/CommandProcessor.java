package ruanku.xuelian_requirement.common.processors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import ruanku.xuelian_requirement.common.annotations.*;
public class CommandProcessor
{
    public static String createTable(Class<?> beanClass)
    {
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            List<String> columns=new ArrayList<String>();
            Field[] fields=beanClass.getDeclaredFields();
            for(Field field:fields)
            {   
                Annotation mark=field.getDeclaredAnnotations()[0];
                if(mark instanceof IntMark)
                {
                    String column="";
                    IntMark intMark=(IntMark)mark;
                    column+=field.getName();
                    column+=" INT";
                    if(intMark.constraint().notNull())
                    {
                        column+=" NOT NULL";
                    }
                    if(intMark.autoIncrement())
                    {
                        column+=" AUTO_INCREMENT";
                    }
                    if(intMark.constraint().isPrimaryKey())
                    {
                        column+=" PRIMARY KEY";
                    }
                    columns.add(column);
                }
                else if(mark instanceof VarcharMark)
                {
                    String column="";
                    VarcharMark varcharMark=(VarcharMark)mark;
                    column+=field.getName();
                    column+=" VARCHAR("+varcharMark.len()+")";
                    if(varcharMark.constraint().notNull())
                    {
                        column+=" NOT NULL";
                    }
                    if(varcharMark.constraint().isPrimaryKey())
                    {
                        column+=" PRIMARY KEY";
                    }
                    columns.add(column);
                }
            }
            String sqlCommand="CREATE TABLE "+tableName+"(";
            for(String column:columns)
            {
                sqlCommand+=column+",";
            }
            sqlCommand=sqlCommand.substring(0,sqlCommand.length()-1)+")";
            return sqlCommand;
        }
        return null;
    }
    public static String insert(Object bean)
    {
        Class<?> beanClass=bean.getClass();
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            String sqlCommand="INSERT INTO "+tableName+" SET";
            Field[] fields=beanClass.getDeclaredFields();
            for(Field field:fields)
            {
                try {
                    field.setAccessible(true);
                    sqlCommand+=" "+field.getName()+" = ";
                    Object obj=field.get(bean);
                    if(obj==null){
                        sqlCommand+="\'\',";
                    }else{
                        sqlCommand+="\'"+obj.toString()+"\',";
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            sqlCommand=sqlCommand.substring(0,sqlCommand.length()-1);
            return sqlCommand;
        }
        return null;
    }
    public static String update(Object bean)
    {
        Class<?> beanClass=bean.getClass();
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            String primaryKey=beanMark.primaryKey();
            String keyValue="";
            String sqlCommand="UPDATE "+tableName+" SET";
            Field[] fields=beanClass.getDeclaredFields();
            for(Field field:fields)
            {
                try {
                    field.setAccessible(true);
                    String name=field.getName();
                    Object obj=field.get(bean);
                    if(name.equals(primaryKey)){
                        if(obj==null){
                            return null;
                        }else{
                            keyValue=obj.toString();
                        }
                    }else{
                        sqlCommand+=" "+name+" = ";
                        if(obj==null){
                            sqlCommand+="\'\',";
                        }else{
                            sqlCommand+="\'"+obj.toString()+"\',";
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
            sqlCommand=sqlCommand.substring(0,sqlCommand.length()-1);
            sqlCommand+=" WHERE "+primaryKey+" = '"+keyValue+"'";
            return sqlCommand;
        }
        return null;
    }
    public static String select(Class<?> beanClass,String key,Object value)
    {
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null){
            String tableName=beanMark.tableName();
            String sqlCommand="SELECT * FROM "+tableName+" WHERE "+key+" = \'"+value.toString()+"\'";
            return sqlCommand;
        }
        return null;
    }
}