package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;

//show public
@BeanMark(tableName = "Poster", primaryKey = "posterId")
public class Poster {
    @IntMark(constraint = @Constraint(isPrimaryKey = true), autoIncrement = true)
    private int commentId;
    @IntMark
    private int enterpriseId;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 5000)
    private String content;
    @OtherTypeMark(type = OtherStaticType.BOOLEAN)
    private boolean isShow;
}
