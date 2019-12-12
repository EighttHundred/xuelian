package ruanku.xuelian_requirement.common;

public class AjaxResult {
    //是否返回成功 默认成功
    private boolean success = true;
    //提示信息
    private String message;
    //错误码
    private int errorCode;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    //成功返回信息
    public AjaxResult(){

    }
    //如果调用这个方法,则创建的是成功时的错误信息
    public AjaxResult(String message){
        this.message = message;
    }

    public AjaxResult(boolean success,String message){
        this.success = success;
        this.message = message;
    }
    //失败的封装
    public AjaxResult(String message,int errorCode){
        this.success = false;
        this.message = message;
        this.errorCode = errorCode;
    }
}
