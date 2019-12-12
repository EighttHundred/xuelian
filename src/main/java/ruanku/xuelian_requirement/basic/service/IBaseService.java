package ruanku.xuelian_requirement.basic.service;

import ruanku.xuelian_requirement.basic.query.BaseQuery;
import ruanku.xuelian_requirement.common.PageList;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {

    //公共内容 CURD
    public void insert(T t);
    //修改
    public void updateByPrimaryKey(T t);
    //删除
    public void deleteByPrimaryKey(Serializable id);
    //查询
    public T selectByPrimaryKey(Serializable id);
    //查询所有
    public List<T> selectAll();
    //分页
    public PageList<T> selectByQuery(BaseQuery query);
}
