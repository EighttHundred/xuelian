package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show private
@BeanMark(tableName = "Resume",primaryKey = "resumeId")
public class Resume
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true))
    private int resumeId;
    @IntMark
    private int seekerId;
    @VarcharMark(len = 30)
    private String name;
    @IntMark
    private int age;
    @VarcharMark(len = 30)
    private String phoneNumber;
    @VarcharMark(len = 30)
    private String email;
    @VarcharMark(len = 30)
    private String intention;
    @VarcharMark(len = 200)
    private String educationExperience;
    @VarcharMark(len = 200)
    private String campusExperience;
    @VarcharMark(len = 200)
    private String workExperience;
    @VarcharMark(len = 200)
    private String projectExperience;
    @VarcharMark(len = 200)
    private String paperPublication;
    @VarcharMark(len = 200)
    private String awards;
    @VarcharMark(len = 200)
    private String skills;
    @VarcharMark(len = 200)
    private String selfEvaluation;


}