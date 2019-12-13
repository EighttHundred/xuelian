package ruanku.xuelian_requirement.BBS.model;
import ruanku.xuelian_requirement.common.annotations.*;
@BeanMark(tableName = "BBSIssue",primaryKey = "issueId")
public class Issue
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int issueId;
    //1:hire information 2:expirence share 4:techic discuss
    @IntMark
    private int userId;
    @IntMark
    private int topics;
    @VarcharMark(len = 50)
    private String publishTime;
    @VarcharMark(len = 50)
    private String lastModifyTime;
    @IntMark
    private int likes;
    @IntMark
    private int views;
    @VarcharMark(len = 5000)
    private String content;
    @VarcharMark(len = 50)
    private String title;
    public int getIssueId()
    {
        return this.issueId;
    }
    public void setIssueId(int issueId)
    {
        this.issueId=issueId;
    }
    public int getUserId()
    {
        return this.userId;
    }
    public void setUserId(int userId)
    {
        this.userId=userId;
    }
    public int getTopics()
    {
        return this.topics;
    }
    public void setTopics(int topics)
    {
        this.topics=topics;
    }
    public String getPublishTime()
    {
        return this.publishTime;
    }
    public void setPublishTime(String publishTime)
    {
        this.publishTime=publishTime;
    }
    public String getLastModifyTime()
    {
        return this.lastModifyTime;
    }
    public void setLastModifyTime(String lastModifyTime)
    {
        this.lastModifyTime=lastModifyTime;
    }
    public int getLikes()
    {
        return this.likes;
    }
    public void setLikes(int likes)
    {
        this.likes=likes;
    }
    public int getViews()
    {
        return this.views;
    }
    public void setViews(int views)
    {
        this.views=views;
    }
    public String getContent()
    {
        return this.content;
    }
    public void setContent(String content)
    {
        this.content=content;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }

}