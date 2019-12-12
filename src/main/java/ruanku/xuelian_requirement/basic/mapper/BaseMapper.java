package ruanku.xuelian_requirement.basic.mapper;

import ruanku.xuelian_requirement.basic.query.BaseQuery;
import java.io.Serializable;
import java.util.List;

public interface BaseMapper <T> {
       //公共内容 CURD
        public int insert(T t);
        //修改
        public int updateByPrimaryKey(T t);
        //删除
        public int deleteByPrimaryKey(Serializable id);
        //查询
        public T selectByPrimaryKey(Serializable id);
        //查询所有
        public List<T> selectAll();
        //分页
        public List<T> selectByQuery(BaseQuery query);


}
