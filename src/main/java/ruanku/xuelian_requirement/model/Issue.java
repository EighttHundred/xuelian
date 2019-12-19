package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show public
@BeanMark(tableName = "Issue",primaryKey = "issueId")
public class Issue
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int issueId;
    //1:hire information 2:expirence share 4:techic discuss
    @IntMark
    private int userId;
    @IntMark
    private int topics;
    @VarcharMark(len = 50)
    private String publishTime;
    @VarcharMark(len = 50)
    private String lastModifyTime;
    @IntMark
    private int likes;
    @IntMark
    private int views;
    @VarcharMark(len = 5000)
    private String content;
    @VarcharMark(len = 50)
    private String title;
}

