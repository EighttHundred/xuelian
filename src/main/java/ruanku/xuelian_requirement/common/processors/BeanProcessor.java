package ruanku.xuelian_requirement.common.processors;

import java.lang.reflect.Field;
import java.util.Map;

import ruanku.xuelian_requirement.common.annotations.BeanMark;

public class BeanProcessor {
    public static Object get(Object bean,String key,Class<?> type){
        try {
            Class<?> beanClass = bean.getClass();
            Field field=beanClass.getDeclaredField(key);
            if(field!=null&&field.getType()==type){
                field.setAccessible(true);
                return field.get(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void set(Object bean,String key,Object value)
    {
        try {
            Class<?> beanClass=bean.getClass();
            Field field=beanClass.getDeclaredField(key);
            if(field!=null){
                field.setAccessible(true);
                field.set(bean, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object newInstance(Class<?> beanType,Map<String,Object> map){
        BeanMark beanMark=beanType.getAnnotation(BeanMark.class);
        if(beanMark!=null){
            try{
                Object bean=beanType.getDeclaredConstructor().newInstance();
                Field[] fields=beanType.getDeclaredFields();
                for(Field field:fields){
                    field.setAccessible(true);
                    String name=field.getName();
                    Object value=map.get(name);
                    if(value!=null){
                        field.set(bean,map.get(name));
                    }
                }
                return bean;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static int getInt(Object bean, String key) {
        Object obj=get(bean,key,int.class);
        if(obj!=null)
            return (int)obj;
        return 0;
    }
    public static float getFloat(Object bean, String key){
        Object obj=get(bean,key,float.class);
        if(obj!=null)
            return (float)obj;
        return 0;
    }
    public static String getString(Object bean, String key){
        Object obj=get(bean,key,String.class);
        if(obj!=null)
            return (String)obj;
        return null;
    }
}