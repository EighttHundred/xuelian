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
    @IntMark
    private int commentId;
    @IntMark
    private int userId;
    @IntMark
    private int likes;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 150)
    private String content;
}