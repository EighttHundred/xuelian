package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "Position",primaryKey = "positionId")
public class Position
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int positionId;
    @IntMark
    private int enterpriseId;
    
}