package ruanku.xuelian_requirement.common.processors;

import java.lang.reflect.Field;

import net.sf.json.JSONObject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
public class JsonProcessor {
    /*
    private static int nextQuote(String data, int pos, int len) {
        if (data != null) {
            while (pos < len && data.charAt(pos) != '\"')
                ++pos;
            if (pos != len)
                return pos;
        }
        return -1;
    }
    */
    public static Object toBean(JSONObject jsonObj, Class<?> beanType)
    {
        String jsonData=jsonObj.toString();
        if(jsonData.length()>2)
        {
            try {
                jsonData=jsonData.substring(1,jsonData.length()-1);
                Object obj=beanType.getDeclaredConstructor().newInstance();
                String[] pairs=jsonData.split(",");
                for(String pair:pairs)
                {
                    String[] str=pair.split(":");
                    str[0]=str[0].trim().replace("\"", "");
                    str[1]=str[1].trim().replace("\"", "");
                    Field field=beanType.getDeclaredField(str[0]);
                    field.setAccessible(true);
                    String type=field.getType().getSimpleName();
                    switch (type) {
                        case "String":
                            field.set(obj,str[1]);
                            break;
                        case "int":
                            field.set(obj,Integer.parseInt(str[1]));
                            break;
                        case "float":
                            field.set(obj,Float.parseFloat(str[1]));
                            break;
                        case "double":
                            field.set(obj,Double.parseDouble(str[1]));
                            break;
                        case "boolean":
                            field.set(obj,Boolean.parseBoolean(str[1]));
                            break;
                        case "Timestamp":
                            field.set(obj,Timestamp.valueOf(str[1]));
                            break;
                        default:
                            break;
                    }
                }
                return obj;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public static JSONObject toJson(Object obj)
    {
        JSONObject jsonObject=new JSONObject();
        Class<?> beanType=obj.getClass();
        Field[] fields=beanType.getDeclaredFields();
        try {
            for(Field field:fields)
            {
                field.setAccessible(true);
                Object object=field.get(obj);
                if(object==null)
                    jsonObject.put(field.getName(),"");
                else
                    jsonObject.put(field.getName(),object);
            }
        } catch (Exception e) {
            e.printStackTrace();        
        }
        return jsonObject;
    }

    public static String layuiParse(List<JSONObject> jsons){
        if(jsons.size()==0) return "[]";
        String data="[";
        for(JSONObject json:jsons){
            data+=json.toString()+",";
        }
        return data.substring(0, data.length()-1)+"]";
    }

    public static <T> String parse(List<T> list){
        List<JSONObject> jsons=new ArrayList<>();
        for(T t:list)
            jsons.add(JsonProcessor.toJson(t));
        return JsonProcessor.layuiParse(jsons);
    }
}