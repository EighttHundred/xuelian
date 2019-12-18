package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "Enterprise",primaryKey = "enterpriseId")
public class Enterprise
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int enterpriseId;
    @IntMark
    private int userId;
    
    @VarcharMark(len = 50)
    private String registTime;
}