package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//show private
@BeanMark(tableName = "News",primaryKey = "newsId")
public class News
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int newsId;
    //1:hire information 2:expirence share 4:techic discuss
    @IntMark
    private int userId;
    @IntMark
    private int toUserId;
    @VarcharMark(len = 50)
    private String title;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 500)
    private String content;
}

