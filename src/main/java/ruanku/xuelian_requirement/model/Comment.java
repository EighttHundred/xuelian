package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.OtherStaticType;

//show public
@BeanMark(tableName = "Comment", primaryKey = "commentId")
public class Comment {
    @IntMark(constraint = @Constraint(isPrimaryKey = true), autoIncrement = true)
    private int commentId;
    @IntMark
    private int issueId;
    @IntMark
    private int userId;
    @IntMark
    private int likes;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 150)
    private String content;
}