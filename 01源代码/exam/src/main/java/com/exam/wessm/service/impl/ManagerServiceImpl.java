package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.dao.IManagerDao;
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

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int registerManager(Manager manager) {
        return managerDao.registerManager(manager);
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
        return managerDao.insertManager(manager);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteManager(Integer mId) {
        return managerDao.deleteManager(mId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateManager(Manager manager) {
        return managerDao.updateManager(manager);
    }

    @Override
    public int updateManagerPassword(Manager manager) {
        return managerDao.updateManagerPassword(manager);
    }
}
