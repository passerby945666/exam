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
        return null;
    }

    @Override
    public Quetype getQuetype(int qId) {
        return null;
    }

    @Override
    public int insertQt(Quetype quetype) {
        return 0;
    }

    @Override
    public int deleteQuetype(int qId) {
        return 0;
    }

    @Override
    public int updateQuetype(Quetype qt) {
        return 0;
    }
}
