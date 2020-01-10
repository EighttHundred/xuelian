package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;

//show public
@BeanMark(tableName = "Position",primaryKey = "id")
public class Position
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int enterpriseId;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp releaseTime;
    @VarcharMark(len = 50)
    private String name;
    @VarcharMark(len = 1000)
    private String introduction;
    @VarcharMark(len = 1000)
    private String duty;
    @VarcharMark(len = 1000)
    private String requirement;
    @VarcharMark(len = 1000)
    private String welfare;
    @IntMark
    private int salary;
    @VarcharMark(len = 50)
    private String city;
    @IntMark
    private int demands;
    @IntMark
    private int onShow;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDemands() {
        return demands;
    }

    public void setDemands(int demands) {
        this.demands = demands;
    }

    public int getOnShow() {
        return onShow;
    }

    public void setOnShow(int onShow) {
        this.onShow = onShow;
    }
}