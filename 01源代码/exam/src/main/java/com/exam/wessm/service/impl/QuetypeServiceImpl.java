package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IQuetypeDao;
import com.exam.wessm.entity.Quetype;
import com.exam.wessm.service.IQuetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("quetypeService")
public class QuetypeServiceImpl implements IQuetypeService {
    @Autowired
    @Qualifier("quetypeDao")
    private IQuetypeDao quetypeDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Quetype> queryQuetype() {
        return quetypeDao.queryQuetype();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Quetype getQuetypeQId(Integer qId) {
        return quetypeDao.getQuetypeQId(qId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Quetype getQuetypeQType(String quetype) {
        return quetypeDao.getQuetypeQType(quetype);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertQuetype(Quetype quetype) {
        return quetypeDao.insertQuetype(quetype);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteQuetype(Integer qId) {
        return quetypeDao.deleteQuetype(qId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateQuetype(Quetype quetype) {
        return quetypeDao.updateQuetype(quetype);
    }
}
