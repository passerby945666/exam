package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IQuebankDao;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.service.IQuebankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service("quebankService")
public class QuebankServiceImpl implements IQuebankService {


    @Autowired
    @Qualifier("quebankDao")
    private IQuebankDao quebankDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryQuebank() {
        return quebankDao.queryQuebank();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Map getQuebanTId(Integer tId) {
        return quebankDao.getQuebankTId(tId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getQuebank(String quebank) {
        return quebankDao.getQuebank(quebank);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertQuebank(Quebank quebank) {
        return quebankDao.insertQuebank(quebank);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteQuebank(Integer tId) {
        return quebankDao.deleteQuebank(tId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateQuebank(Quebank quebank) {
        return quebankDao.updateQuebank(quebank);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getQuebankKId(Integer kId,String qType) {
        return quebankDao.getQuebankKId(kId, qType);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getQuebankKIdAndQType(String kId,String qType) {
        return quebankDao.getQuebankKIdAndQType(kId, qType);
    }
}
