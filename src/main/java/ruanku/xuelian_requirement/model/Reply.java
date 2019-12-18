package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "Reply",primaryKey = "replyId")
public class Reply
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int replyId;
    @IntMark
    private int commentId;
    @IntMark
    private int userId;
    @IntMark
    private int likes;
    @VarcharMark(len = 50)
    private String publishTime;
    @VarcharMark(len = 150)
    private String content;
}