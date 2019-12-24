package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;

//show public
@BeanMark(tableName = "Position",primaryKey = "positionId")
public class Position
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int positionId;
    @IntMark
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
    @OtherTypeMark(type = OtherStaticType.BOOLEAN)
    private boolean show;
}