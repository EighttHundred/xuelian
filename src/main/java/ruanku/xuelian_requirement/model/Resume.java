package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show private
@BeanMark(tableName = "Resume",primaryKey = "resumeId")
public class Resume
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true))
    private int resumeId;
}