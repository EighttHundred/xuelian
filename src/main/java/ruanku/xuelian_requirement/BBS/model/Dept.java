package ruanku.xuelian_requirement.BBS.model;

/**
 * 创建dept部门实体类
 */
public class Dept {

    private Integer id;
    private String name;
    private String mark;

    public Dept() {
    }

    public Dept(Integer id, String name, String mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
