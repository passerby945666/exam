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
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExaminers(String examiners) {
        return examinersDao.getExaminers(examiners);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertEaxminers(Examiners examiners) {
        return examinersDao.insertEaxminers(examiners);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteEaxminers(Integer exId) {
        return examinersDao.deleteEaxminers(exId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateEaxminers(Examiners examiners) {
        return examinersDao.updateEaxminers(examiners);
    }
}
