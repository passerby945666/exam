package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IQuebankDao;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.service.IQuebankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("quebankService")
public class QuebankServiceImpl implements IQuebankService {


    @Autowired
    @Qualifier("quebankDao")
    private IQuebankDao quebankDao;

    @Override
    public List<Quebank> queryQuebank() {
        return quebankDao.queryQuebank();
    }

    @Override
    public List<Map> getQuebank(String quebank) {
        return quebankDao.getQuebank(quebank);
    }

    @Override
    public int insertQuebank(Quebank quebank) {
        return quebankDao.insertQuebank(quebank);
    }

    @Override
    public int deleteQuebank(Integer tId) {
        return quebankDao.deleteQuebank(tId);
    }

    @Override
    public int updateQuebank(Quebank quebank) {
        return quebankDao.updateQuebank(quebank);
    }
}
