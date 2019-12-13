package ruanku.xuelian_requirement.common.processors;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import ruanku.xuelian_requirement.common.annotations.*;
public class IOCProcessor
{
    public static Object get(Class<?> classType)
    {
        Annotation annotation=null;
        if((annotation=classType.getAnnotation(SQLServerMark.class))!=null)
        {
            //classType.getMethod("as").
        }
        return null;
    }

    Object a=new java.lang.reflect.InvocationHandler()
    {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
        {
            return null;
        }
    };
}