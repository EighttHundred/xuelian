package ruanku.xuelian_requirement.common.processors;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import net.sf.json.JSONObject;

public class JsonProcessor {
    private static int nextQuote(String data, int pos, int len) {
        if (data != null) {
            while (pos < len && data.charAt(pos) != '"')
                ++pos;
            if (pos != len)
                return pos;
        }
        return -1;
    }

    public static Object toBean(JSONObject jsonObj, Class<?> classType)
    {
        String jsonData=jsonObj.toString();
        if(jsonData.length()>2)
        {
            try {
                jsonData=jsonData.substring(1,jsonData.length()-1);
                Object obj=classType.getDeclaredConstructor().newInstance();
                String[] pairs=jsonData.split(",");
                for(String pair:pairs)
                {
                    String[] str=pair.split(":");
                    str[0]=str[0].trim().replace("\"", "");
                    str[1]=str[1].trim().replace("\"", "");
                    Field field=classType.getDeclaredField(str[0]);
                    field.setAccessible(true);
                    String type=field.getType().getSimpleName();
                    switch (type) {
                        case "String":
                            field.set(obj,str[1]);
                            break;
                        case "int":
                            field.set(obj,Integer.parseInt(str[1]));
                            break;
                        default:
                            break;
                    }
                }
                return obj;
            } catch (Exception e) {
                System.out.println("to bean error");
            }

        }
        return null;
    }

    public static JSONObject toJson(Object obj)
    {
        JSONObject jsonObject=new JSONObject();
        Class<?> classType=obj.getClass();
        Field[] fields=classType.getDeclaredFields();
        classType.getDeclaredClasses();
        try {
            for(Field field:fields)
            {
                field.setAccessible(true);
                String type=field.getType().getSimpleName();
                Object object=field.get(obj);
                if(object==null)
                    jsonObject.put(field.getName(),"");
                else
                    jsonObject.put(field.getName(),object);
            }
        } catch (Exception e) {
            System.out.println("to json error");
        }
        return jsonObject;
    }
}