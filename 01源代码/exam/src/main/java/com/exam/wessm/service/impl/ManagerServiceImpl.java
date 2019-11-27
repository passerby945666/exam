package com.exam.wessm.service.impl;

import com.exam.wessm.dao.*;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("managerService")
public class ManagerServiceImpl implements IManagerService {
    @Autowired
    @Qualifier("managerDao")
    private IManagerDao managerDao;
    @Autowired
    @Qualifier("examDao")
    private IExamDao examDao;
    @Autowired
    @Qualifier("gradesDao")
    private IGradesDao gradesDao;
    @Autowired
    @Qualifier("examinersDao")
    private IExaminersDao examinersDao;
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;
    @Autowired
    @Qualifier("quebankDao")
    private IQuebankDao quebankDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int registerManager(Manager manager) {
        int rows=-1;
        try {
            rows=managerDao.registerManager(manager);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Manager findManagerNoAndPass(String mNo, String mPassword) {
        return managerDao.findManagerNoAndPass(mNo,mPassword);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Manager> queryManager() {
        return managerDao.queryManager();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Manager getManagerMId(Integer mId) {
        return managerDao.getManagerMId(mId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Manager> getManager(String manager) {
        return managerDao.getManager(manager);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertManager(Manager manager) {
        int rows=-1;
        try {
            rows=managerDao.insertManager(manager);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteManager(Integer mId) {
        int rows=-1;
        try {
            rows=managerDao.deleteManager(mId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateManager(Manager manager) {
        int rows=-1;
        try {
            rows=managerDao.updateManager(manager);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    public int updateManagerPassword(Manager manager) {
        int rows=-1;
        try {
            rows=managerDao.updateManagerPassword(manager);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteManagerAll(Integer mId) {
        int rows=-1;
        try {
            List<Integer> listExam=examDao.queryExamMId(mId);
            List<Integer> listQuebank=quebankDao.queryQuebankMId(mId);
            if(listExam!=null){
                for(Integer eId:listExam){
                    gradesDao.deleteGradeEId(eId);
                    hquestionDao.deleteHquestionEId(eId);
                    examinersDao.deleteExaminersEId(eId);
                    examDao.deleteExam(eId);
                }
            }else {
                return 0;
            }
            if(listQuebank!=null){
                for(Integer tId:listQuebank){
                    hquestionDao.deleteHquestionTId(tId);
                    quebankDao.deleteQuebank(tId);
                }
            }else {
                return 0;
            }
            rows=managerDao.deleteManager(mId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }
        return rows;
    }
}
