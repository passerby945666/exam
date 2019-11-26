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
        int rows=-1;
        try {
            rows=stuDao.registerStu(stu);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
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
    public   List<Stu> getStu(String stu) {
        return stuDao.getStu(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertStu(Stu stu) {
        int rows=-1;
        try {
            rows=stuDao.insertStu(stu);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteStu(Integer sId) {
        int rows=-1;
        try {
            rows=stuDao.deleteStu(sId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateStu(Stu stu) {
        int rows=-1;
        try {
            rows=stuDao.updateStu(stu);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateStuM(Stu stu) {
        int rows=-1;
        try {
            rows=stuDao.updateStuM(stu);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateStuPassword(Stu stu) {
        int rows=-1;
        try {
            rows=stuDao.updateStuPassword(stu);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Map getSexnum() {
        return stuDao.getSexnum();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Map getYearnum(Integer sSex) {
        return stuDao.getYearnum(sSex);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getAvgnum(Integer kId) {
        return stuDao.getAvgnum( kId);
    }
}
