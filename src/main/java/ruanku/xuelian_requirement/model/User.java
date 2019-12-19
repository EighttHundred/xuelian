package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//not show
//only be transfered from front-end to back-end
@BeanMark(tableName = "User",primaryKey = "userId")
public class User
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int userId;
    @VarcharMark(len = 50)
    private String mailAddress;
    @VarcharMark(len = 50)
    private String phoneNumber;
    @VarcharMark(len = 50)
    private String passWord;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp registTime;
    // 0 enterprise 1 normal
    @IntMark
    private UserType userType;
}