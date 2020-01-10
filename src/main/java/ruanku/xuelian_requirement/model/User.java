package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import java.util.Calendar;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//not show
//only be transfered from front-end to back-end
@BeanMark(tableName = "User",primaryKey = "id")
public class User
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    @VarcharMark(len = 50)
    private String phone="";
    @VarcharMark(len = 50)
    private String passWord="";
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp registTime=new Timestamp(Calendar.getInstance().getTimeInMillis());
    @VarcharMark(len = 50)
    private String type="";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Timestamp getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}   