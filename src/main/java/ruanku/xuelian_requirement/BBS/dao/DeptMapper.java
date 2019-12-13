package ruanku.xuelian_requirement.BBS.dao;

import ruanku.xuelian_requirement.model.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {

    // 查询所有
    @Select("select * from selects")
    public List<Dept> queryAll();


    // 查询所有
    public List<Dept> queryAll2();

}
