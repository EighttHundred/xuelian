package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;

import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//show public
@BeanMark(tableName = "Reply",primaryKey = "replyId")
public class Reply
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int replyId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int commentId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int userId;
    @IntMark
    private int likes;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 150)
    private String content;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}