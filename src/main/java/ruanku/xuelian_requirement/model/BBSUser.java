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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}