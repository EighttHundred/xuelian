package ruanku.xuelian_requirement.common.processors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import ruanku.xuelian_requirement.common.annotations.*;
public class QueryProcessor
{
    public boolean createTable(Class<?> beanClass)
    {
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            List<String> columns=new ArrayList<String>();
            Field[] fields=beanClass.getFields();
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

            //return sqlCommand;
        }
        return true;
    }
    public String insert(Object bean) throws IllegalArgumentException, IllegalAccessException
    {
        Class<?> beanClass=bean.getClass();
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            String sqlCommand="INSERT INTO "+tableName+" SET";
            Field[] fields=beanClass.getFields();
            for(Field field:fields)
            {
                sqlCommand+=" "+field.getName()+" = ";
                sqlCommand+="'"+field.getType().cast(field.get(bean))+"',";
            }
            sqlCommand=sqlCommand.substring(0,sqlCommand.length()-1);
            return sqlCommand;
        }
        return null;
    }
    public String update(Object bean) throws IllegalArgumentException, IllegalAccessException
    {
        Class<?> beanClass=bean.getClass();
        BeanMark beanMark=beanClass.getAnnotation(BeanMark.class);
        if(beanMark!=null)
        {
            String tableName=beanMark.tableName();
            String primaryKey=beanMark.primaryKey();
            String keyValue="";
            String sqlCommand="UPDATE "+tableName+" SET";
            Field[] fields=beanClass.getFields();
            for(Field field:fields)
            {
                if(field.getName()==primaryKey)
                {
                    keyValue=field.getType().cast(field.get(bean)).toString();
                }
                else
                {
                    sqlCommand+=" "+field.getName()+" = ";
                    sqlCommand+="'"+field.getType().cast(field.get(bean))+"',";
                }
            }
            sqlCommand=sqlCommand.substring(0,sqlCommand.length()-1);
            sqlCommand+=" WHERE "+primaryKey+" = '"+keyValue+"'";
            return sqlCommand;
        }
        return null;
    }
    public String select(Class<?> beanClass)
    {
        return null;
    }
}