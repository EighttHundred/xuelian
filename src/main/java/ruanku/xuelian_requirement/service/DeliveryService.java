package ruanku.xuelian_requirement.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import ruanku.xuelian_requirement.dao.DeliveryDao;
import ruanku.xuelian_requirement.dao.EnterpriseDao;
import ruanku.xuelian_requirement.dao.PositionDao;
import ruanku.xuelian_requirement.dao.ResumeDao;
import ruanku.xuelian_requirement.model.*;

import java.util.List;

@Service
public class DeliveryService {

    public static boolean deliver(int resumeId,int positionId){
        Resume resume= ResumeDao.select(resumeId);
        Position position= PositionDao.select(positionId);
        assert resume!=null&&position!=null;
        Enterprise enterprise= EnterpriseDao.select(position.getEnterpriseId());
        assert enterprise!=null;
        Delivery delivery=new Delivery();
        delivery.setPositionName(position.getName());
        delivery.setSeekerId(resume.getSeekerId());
        delivery.setSeekerName(resume.getName());
        delivery.setEnterpriseId(enterprise.getId());
        delivery.setEnterpriseName(enterprise.getName());
        delivery.setPositionId(positionId);
        delivery.setResumeId(resumeId);
        return DeliveryDao.insert(delivery);
    }

    public static String layuiGet(int id ,int type){
        List<Delivery> list=null;
        if(type==1) list=DeliveryDao.selects("seekerId",id);
        else list=DeliveryDao.selects("enterpriseId",id);
        return DeliveryDao.parse(list);
    }

}
