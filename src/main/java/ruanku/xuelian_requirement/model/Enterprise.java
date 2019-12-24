package ruanku.xuelian_requirement.model;
import java.sql.Timestamp;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.OtherStaticType;
//show public
@BeanMark(tableName = "Enterprise",primaryKey = "enterpriseId")
public class Enterprise
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int enterpriseId;
    @IntMark
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
}