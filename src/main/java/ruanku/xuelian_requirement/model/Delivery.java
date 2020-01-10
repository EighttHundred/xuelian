package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show public
@BeanMark(tableName = "Delivery",primaryKey = "id")
public class Delivery
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int seekerId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int enterpriseId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int resumeId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int positionId;
    @VarcharMark(len = 50)
    private String enterpriseName;
    @VarcharMark(len = 50)
    private String seekerName;
    @VarcharMark(len = 50)
    private String positionName;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getSeekerName() {
        return seekerName;
    }

    public void setSeekerName(String seekerName) {
        this.seekerName = seekerName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getSeekerId() {
        return seekerId;
    }

    public void setSeekerId(int seekerId) {
        this.seekerId = seekerId;
    }
}