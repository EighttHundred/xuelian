package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show public
@BeanMark(tableName = "Seeker",primaryKey = "seekerId")
public class Seeker
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int seekerId;
    @IntMark
    private int userId;
    @VarcharMark(len = 50)
    private String userName;
    @VarcharMark(len = 200)
    private String profile;
}