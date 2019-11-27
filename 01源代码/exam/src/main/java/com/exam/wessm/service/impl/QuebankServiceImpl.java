package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IHquestionDao;
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
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;

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
        int rows=-1;
        try {
            rows=rows=quebankDao.insertQuebank(quebank);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteQuebank(Integer tId) {
        int rows=-1;
        try {
            rows=quebankDao.deleteQuebank(tId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateQuebank(Quebank quebank) {
        int rows=-1;
        try {
            rows=quebankDao.updateQuebank(quebank);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
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

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryQuebankKId(String kId, String qId) {
        return quebankDao.queryQuebankKId(kId, qId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteQuebankAll(Integer tId) {
        int rows=-1;
        try {
            hquestionDao.deleteHquestionTId(tId);
            rows=quebankDao.deleteQuebank(tId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    public int deleteQuebankMId(Integer mId) {
        int rows=-1;
        try {
            rows=quebankDao.deleteQuebankMId(mId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows ;
        }

    }
}
