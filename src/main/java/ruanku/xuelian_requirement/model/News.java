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
    @IntMark(constraint = @Constraint(isConstant = true))
    private int userId;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int toUserId;
    @VarcharMark(len = 50)
    private String title;
    @OtherTypeMark(type = OtherStaticType.TIMESTAMP)
    private Timestamp publishTime;
    @VarcharMark(len = 500)
    private String content;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

