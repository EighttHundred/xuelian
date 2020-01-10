package ruanku.xuelian_requirement.model;

import java.sql.Timestamp;
import ruanku.xuelian_requirement.common.annotations.*;
import ruanku.xuelian_requirement.common.enums.*;
//show public
@BeanMark(tableName = "Issue",primaryKey = "id")
public class Issue
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    //1:hire information 2:expirence share 4:techic discuss
    @IntMark(constraint = @Constraint(isConstant = true))
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Timestamp getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Timestamp lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}

