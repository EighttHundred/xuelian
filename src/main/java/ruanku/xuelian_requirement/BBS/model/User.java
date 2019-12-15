package ruanku.xuelian_requirement.BBS.model;
import ruanku.xuelian_requirement.common.annotations.*;
@BeanMark(tableName = "User",primaryKey = "userId")
public class User
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int userId;
    @VarcharMark(len = 50)
    private String mail;
    @VarcharMark(len = 50)
    private String passwd;
}