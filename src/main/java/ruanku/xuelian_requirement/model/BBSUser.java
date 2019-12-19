package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show public
@BeanMark(tableName = "BBSUser",primaryKey = "userId")
public class BBSUser
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true))
    private int userId;
    @VarcharMark(len = 50)
    private String nickName;
    @IntMark
    private int level;
    @IntMark
    private int experience;
}