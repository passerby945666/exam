package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExaminersDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.mapper.ExaminersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository("examinersDao")
public class ExaminersDaoImpl implements IExaminersDao {
    @Autowired
    @Qualifier("examinersMapper")
    private ExaminersMapper examinersMapper;


    @Override
    public List<Map> queryExaminers() {
        return null;
    }

    @Override
    public List<Map> getExaminers(String examiners) {
        return null;
    }

    @Override
    public int insertEaxminers(Examiners examiners) {
        return 0;
    }

    @Override
    public int deleteEaxminers(Integer exId) {
        return 0;
    }

    @Override
    public int updateEaxminers(Examiners examiners) {
        return 0;
    }
}
