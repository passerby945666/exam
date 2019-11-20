package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IQuetypeDao;
import com.exam.wessm.entity.Quetype;
import com.exam.wessm.mapper.QuetypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("quetypeDao")
public class QuetypeDaoImpl implements IQuetypeDao {
    @Autowired
    @Qualifier("quetypeMapper")
    private QuetypeMapper quetypeMapper;

    @Override
    public List<Quetype> queryQuetype() {
        return quetypeMapper.queryQuetype();
    }

    @Override
    public Quetype getQuetypeQId(Integer qId) {
        return quetypeMapper.getQuetypeQId(qId);
    }

    @Override
    public Quetype getQuetypeQType(String quetype) {
        return quetypeMapper.getQuetypeQType(quetype);
    }

    @Override
    public int insertQuetype(Quetype quetype) {
        return quetypeMapper.insertQuetype(quetype);
    }

    @Override
    public int deleteQuetype(Integer qId) {
        return quetypeMapper.deleteQuetype(qId);
    }

    @Override
    public int updateQuetype(Quetype quetype) {
        return quetypeMapper.updateQuetype(quetype);
    }
}
