package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.dao.IExaminersDao;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.service.IExaminersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service("examinersService")
public class ExaminersServiceImpl implements IExaminersService {
    @Autowired
    @Qualifier("examinersDao")
    private IExaminersDao examinersDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryExaminers() {
        return examinersDao.queryExaminers();
    }

    @Override
    public List<Map> getExaminersExId(Integer exId) {
        return examinersDao.getExaminersExId(exId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExaminers(String examiners) {
        return examinersDao.getExaminers(examiners);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertExaminers(Examiners examiners) {
        int rows=-1;
        try {
            rows=examinersDao.insertExaminers(examiners);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteExaminers(Integer exId) {
        int rows=-1;
        try {
            rows=examinersDao.deleteExaminers(exId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateExaminers(Examiners examiners) {
        int rows=-1;
        try {
            rows=examinersDao.updateExaminers(examiners);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }
}
