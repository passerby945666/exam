package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IHquestionDao;
import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.service.IHquestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("hquestionService")
public class HquestionServiceImpl implements IHquestionService {
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;

    @Override
    public List<Hquestion> queryHquestion() {
        return hquestionDao.queryHquestion();
    }

    @Override
    public List<Hquestion> queryHquestion(String mNo, String eNo, String status) {
        return hquestionDao.queryHquestion(mNo, eNo, status);
    }

    @Override
    public Hquestion getHquestion(int hId) {
        return hquestionDao.getHquestion(hId);
    }

    @Override
    public int insertHquestion(Hquestion hq) {
        return hquestionDao.insertHquestion(hq);
    }

    @Override
    public int deleteHquestion(int hId) {
        return hquestionDao.deleteHquestion(hId);
    }

    @Override
    public int updateHquestion(Hquestion hq) {
        return hquestionDao.updateHquestion(hq);
    }
}
