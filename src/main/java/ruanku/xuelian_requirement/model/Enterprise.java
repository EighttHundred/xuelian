package ruanku.xuelian_requirement.model;
import java.sql.Timestamp;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.OtherStaticType;
//show public
@BeanMark(tableName = "Enterprise",primaryKey = "id")
public class Enterprise
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int userId;
    @VarcharMark(len = 50)
    private String name;
    @VarcharMark(len = 50)
    private String mailAddress;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp establishTime;
    @VarcharMark(len = 2000)
    private String introduction;
    @VarcharMark(len = 100)
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Timestamp getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(Timestamp establishTime) {
        this.establishTime = establishTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}