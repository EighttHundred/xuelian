package ruanku.xuelian_requirement.BBS.model;
import ruanku.xuelian_requirement.common.annotations.*;

@BeanMark(tableName = "BBSIssueReply",primaryKey = "issueId")
public class IssueReply
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int issueId;
    @IntMark
    private int replyId;
}