package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
@BeanMark(tableName = "User",primaryKey = "userId")
public class User
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int userId;
    @VarcharMark(len = 50)
    private String userName;
    @VarcharMark(len = 50)
    private String mailAddress;
    @VarcharMark(len = 50)
    private String phoneNumber;
    @VarcharMark(len = 50)
    private String passWord;
    @VarcharMark(len = 50)
    private String registTime;
    // 0 enterprise 1 normal
    @IntMark
    private int userType;
}