package ruanku.xuelian_requirement.common.utils;

import org.apache.poi.ss.formula.functions.T;

/**
 * 用途：
 */
public class JsonResult {

    private  Integer code;
    private  String msg;
    private  T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
