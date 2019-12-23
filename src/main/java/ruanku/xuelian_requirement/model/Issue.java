package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//show public
@BeanMark(tableName = "Issue",primaryKey = "issueId")
public class Issue
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int issueId;
    //1:hire information 2:expirence share 4:techic discuss
    @IntMark
    private int userId;
    @VarcharMark(len = 50)
    private String topics;
    @VarcharMark(len = 5000)
    private String content;
    @VarcharMark(len = 50)
    private String title;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp lastModifyTime;
    @IntMark
    private int likes;
    @IntMark
    private int views;
}

