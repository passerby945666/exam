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
        return hquestionDao.insertHquestion(hq);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestion(int hId) {
        return hquestionDao.deleteHquestion(hId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateHquestion(Hquestion hq) {
        return hquestionDao.updateHquestion(hq);
    }
}
