package com.exam.wessm.dao.impl;


import com.exam.wessm.dao.IHquestionDao;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.mapper.HquestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository("hquestionDao")
public class HquestionDaoImpl implements IHquestionDao {

    @Autowired
    @Qualifier("hquestionMapper")
    private HquestionMapper hquestionMapper;


    @Override
    public List<Hquestion> queryHquestionAll() {
        return hquestionMapper.queryHquestionAll();
    }

    @Override
    public List<Hquestion> queryHquestion(String mNo, String eNo, String Status) {
        Map map=new HashMap();
        map.put("mNo",mNo);
        map.put("eNo",eNo);
        map.put("Status",Status);
        return hquestionMapper.queryHquestion(map);
    }

    @Override
    public Hquestion getHquestion(int hId) {
        return hquestionMapper.getHquestion(hId);
    }

    @Override
    public int insertHquestion(Hquestion hq) {
        return hquestionMapper.insertHquestion(hq);
    }

    @Override
    public int deleteHquestion(int hId) {
        return hquestionMapper.deleteHquestion(hId);
    }

    @Override
    public int updateHquestion(Hquestion hq) {
        return hquestionMapper.updateHquestion(hq);
    }
}
