package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "Comment",primaryKey = "commentId")
public class Comment
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int commentId;
    @IntMark
    private int issueId;
    @IntMark
    private int userId;
    @IntMark
    private int likes;
    @VarcharMark(len = 50)
    private String publishTime;
    @VarcharMark(len = 150)
    private String content;
}