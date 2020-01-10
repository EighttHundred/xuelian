package ruanku.xuelian_requirement.model;
import ruanku.xuelian_requirement.common.annotations.*;
//show private
@BeanMark(tableName = "Resume",primaryKey = "id")
public class Resume
{
    @IntMark(constraint = @Constraint(isPrimaryKey = true),autoIncrement = true)
    private int id;
    @IntMark(constraint = @Constraint(isConstant = true))
    private int seekerId;
    @VarcharMark(len = 30)
    private String name;
    @IntMark
    private int age;
    @VarcharMark(len = 30)
    private String phoneNumber;
    @VarcharMark(len = 30)
    private String email;
    @VarcharMark(len = 30)
    private String intention;
    @VarcharMark(len = 200)
    private String educationExperience;
    @VarcharMark(len = 200)
    private String campusExperience;
    @VarcharMark(len = 200)
    private String workExperience;
    @VarcharMark(len = 200)
    private String projectExperience;
    @VarcharMark(len = 200)
    private String paperPublication;
    @VarcharMark(len = 200)
    private String awards;
    @VarcharMark(len = 200)
    private String skills;
    @VarcharMark(len = 200)
    private String selfEvaluation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeekerId() {
        return seekerId;
    }

    public void setSeekerId(int seekerId) {
        this.seekerId = seekerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience;
    }

    public String getCampusExperience() {
        return campusExperience;
    }

    public void setCampusExperience(String campusExperience) {
        this.campusExperience = campusExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience;
    }

    public String getPaperPublication() {
        return paperPublication;
    }

    public void setPaperPublication(String paperPublication) {
        this.paperPublication = paperPublication;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }


}