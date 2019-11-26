package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IHquestionDao;
import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.service.IHquestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("hquestionService")
public class HquestionServiceImpl implements IHquestionService {
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Hquestion> queryHquestionAll() {
        return hquestionDao.queryHquestionAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryHquestion(String mNo, String eNo, String status) {
        return hquestionDao.queryHquestion(mNo, eNo, status);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Hquestion getHquestion(int hId) {
        return hquestionDao.getHquestion(hId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertHquestion(Hquestion hq) {
        int rows=-1;
        try {
            hquestionDao.insertHquestion(hq);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestion(int hId) {
        int rows=-1;
        try {
            hquestionDao.deleteHquestion(hId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateHquestion(Hquestion hq) {
        int rows=-1;
        try {
            rows=hquestionDao.updateHquestion(hq);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryHquestionMNo(String mNo) {
        return hquestionDao.queryHquestionMNo(mNo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateHquestions(List<Hquestion> list) {
        int rows=-1;
        for(Hquestion hquestion:list){
               rows=hquestionDao.updateHquestion(hquestion);
               if(rows!=1){
                   return 0;
               }
           }
        return 1;
    }
}
