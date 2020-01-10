package ruanku.xuelian_requirement.common.processors;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import ruanku.xuelian_requirement.common.annotations.BeanMark;

public class BeanProcessor {
    public static <T> T get(Object bean,String key,Class<T> type){
        try {
            Class<?> beanClass = bean.getClass();
            Field field=beanClass.getDeclaredField(key);
            if(field!=null){
                field.setAccessible(true);
                return type.cast(field.get(bean));
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
    public static <T> T newInstance(Class<T> beanType,Map<String,String> map){
        BeanMark beanMark=beanType.getAnnotation(BeanMark.class);
        if(beanMark!=null){
            try{
                T bean=beanType.getDeclaredConstructor().newInstance();
                Field[] fields=beanType.getDeclaredFields();
                for(Field field:fields){
                    field.setAccessible(true);
                    String name=field.getName();
                    String value=map.get(name);
                    if(value!=null){
                        Class<?> fieldType=field.getType();
                        if(fieldType==String.class){
                            field.set(bean,value);
                        }else if(value.equals("")){
                            field.set(bean, 0);
                        }else{
                            if(fieldType==Float.class){
                                field.set(bean, Float.parseFloat(value));
                            }else if(fieldType==Double.class){
                                field.set(bean, Double.parseDouble(value));
                            }else if(fieldType==int.class){
                                field.set(bean,Integer.parseInt(value));
                            }
                        }
                    }
                }
                return bean;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Map<String,Object> parseMap(Object bean){
        Map<String,Object> map=new HashMap<>();
        Class<?> beanType=bean.getClass();
        Field[] fields=beanType.getDeclaredFields();
        try {
            for(Field field:fields)
            {
                field.setAccessible(true);
                Object value=field.get(bean);
                // if(value==null){
                //     value=field.getType().getDeclaredConstructor().newInstance();
                // }
                map.put(field.getName(), value);
            }
        } catch (Exception e) {
            e.printStackTrace();        
        }
        return map;
        
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