package com.exam.wessm.dao.impl;


import com.exam.wessm.dao.IQuebankDao;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.mapper.QuebankMapper;
import com.exam.wessm.service.IQuebankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;
@Repository("quebankDao")
public class QuebankDaoImpl implements IQuebankDao {
    @Autowired
    @Qualifier("quebankMapper")
    private QuebankMapper quebankMapper;

    @Override
    public List<Quebank> queryQuebank() {
        return quebankMapper.queryQuebank();
    }

    @Override
    public List<Map> getQuebank(String quebank) {
        return quebankMapper.getQuebank(quebank);
    }

    @Override
    public int insertQuebank(Quebank quebank) {
        return quebankMapper.insertQuebank(quebank);
    }

    @Override
    public int deleteQuebank(Integer tId) {
        return quebankMapper.deleteQuebank(tId);
    }

    @Override
    public int updateQuebank(Quebank quebank) {
        return quebankMapper.updateQuebank(quebank);
    }

}
