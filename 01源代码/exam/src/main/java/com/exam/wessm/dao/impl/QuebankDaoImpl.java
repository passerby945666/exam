package com.exam.wessm.dao.impl;


import com.exam.wessm.dao.IQuebankDao;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.mapper.QuebankMapper;
import com.exam.wessm.service.IQuebankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository("quebankDao")
public class QuebankDaoImpl implements IQuebankDao {
    @Autowired
    @Qualifier("quebankMapper")
    private QuebankMapper quebankMapper;

    @Override
    public List<Map> queryQuebank() {
        return quebankMapper.queryQuebank();
    }

    @Override
    public Map getQuebankTId(Integer tId) {
        return quebankMapper.getQuebankTId(tId);
    }

    @Override
    public List<Map> getQuebank(String quebank) {
        Map map=new HashMap();
        map.put("no",quebank);
        map.put("name","%"+quebank+"%");
        return quebankMapper.getQuebank(map);
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

    @Override
    public List<Map> getQuebankKId(Integer kId,String qType) {
        Map map=new HashMap();
        map.put("no",kId);
        map.put("name",qType);
        return quebankMapper.getQuebankKId(map);
    }

    @Override
    public List<Map> getQuebankKIdAndQType(String kId,String qType) {
        Map map=new HashMap();
        map.put("no",kId);
        map.put("name",qType);
        return quebankMapper.getQuebankKIdAndQType(map);
    }

    @Override
    public List<Map> queryQuebankKId(String kId, String qId) {
        Map map=new HashMap();
        map.put("kId",kId);
        map.put("qId",qId);
        return quebankMapper.queryQuebankKId(map);
    }
}
