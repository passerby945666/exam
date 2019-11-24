package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IStuDao;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("stuService")
public class StuServiceImpl implements IStuService {
    @Autowired
    @Qualifier("stuDao")
    private IStuDao stuDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int registerStu(Stu stu) {
        return stuDao.registerStu(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Stu findNoAndPass(String sNo, String sPassword) {
        return stuDao.findNoAndPass(sNo,sPassword);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Stu> queryStu() {
        return stuDao.queryStu();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Stu getStuSId(Integer sId) {
        return stuDao.getStuSId(sId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Stu getStu(String stu) {
        return stuDao.getStu(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertStu(Stu stu) {
        return stuDao.insertStu(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteStu(Integer sId) {
        return stuDao.deleteStu(sId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateStu(Stu stu) {
        return stuDao.updateStu(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateStuPassword(Stu stu) {
        return stuDao.updateStuPassword(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Map getSexnum() {
        return stuDao.getSexnum();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getYearnum(Integer sSex) {
        return stuDao.getYearnum(sSex);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getAvgnum(Integer kId) {
        return stuDao.getAvgnum( kId);
    }
}
