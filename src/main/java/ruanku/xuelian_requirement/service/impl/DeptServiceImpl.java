package ruanku.xuelian_requirement.service.impl;

import ruanku.xuelian_requirement.dao.DeptMapper;
import ruanku.xuelian_requirement.model.Dept;
import ruanku.xuelian_requirement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptDao;
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
