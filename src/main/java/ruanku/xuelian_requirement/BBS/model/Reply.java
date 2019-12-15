package ruanku.xuelian_requirement.BBS.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "BBSReply",primaryKey = "replyId")
public class Reply
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int replyId;
    @IntMark
    private int userId;
    @IntMark
    private int likes;
    @IntMark
    private int views;
    @VarcharMark(len = 50)
    private String publishTime;
    @VarcharMark(len = 150)
    private String content;
}