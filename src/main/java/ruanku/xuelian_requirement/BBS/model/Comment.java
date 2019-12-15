package ruanku.xuelian_requirement.BBS.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "BBSComment",primaryKey = "commentId")
public class Comment
{
    private int commentId;
    private String publishTime;
    private String content;
}