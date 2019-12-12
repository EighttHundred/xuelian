package ruanku.xuelian_requirement.basic.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import ruanku.xuelian_requirement.basic.query.BaseQuery;
import ruanku.xuelian_requirement.basic.service.IBaseService;
import tk.mybatis.mapper.common.BaseMapper;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //由于core层没有集成spring，所以无法实现依赖注入
    protected abstract BaseMapper<T> getMapper();

    @Override
    public void insert(T t) {
        getMapper().insert(t);
    }

    @Override
    public void updateByPrimaryKey(T t) {
        getMapper().updateByPrimaryKey(t);
    }

    @Override
    public void deleteByPrimaryKey(Serializable id) {
        getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public T selectByPrimaryKey(Serializable id) {

        return  getMapper().selectByPrimaryKey(id);
    }

//    @Override
//    public List<T> selectAll() {
//        return getMapper().selectAll();
//    }
//
//    @Override
//    public PageList<T> selectByQuery(BaseQuery query) {
//        //创建封装数据的PageList对象
//        PageList<T> pageList = new PageList<T>();
//        //设置分页条件
//        Page page = PageHelper.startPage(query.getPage(),query.getLimit());
//        //查询当前页的数据
//        List<T> rows = getMapper().selectByQuery(query);
//        //获取总条目数
//        long total = page.getTotal();
//        //将数据封装到PageList对象中返回
//        pageList.setRows(rows);
//        pageList.setTotal(total);
//        return pageList;
//    }
}
