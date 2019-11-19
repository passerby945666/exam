package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExaminersDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.mapper.ExaminersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository("examinersDao")
public class ExaminersDaoImpl implements IExaminersDao {
    @Autowired
    @Qualifier("examinersMapper")
    private ExaminersMapper examinersMapper;


    @Override
    public List<Map> queryExaminers() {
        return examinersMapper.queryExaminers();
    }

    @Override
    public List<Map> getExaminersExId(Integer exId) {
        return examinersMapper.getExaminersExId(exId);
    }

    @Override
    public List<Map> getExaminers(String examiners) {
        Map map=new HashMap();
        map.put("no",examiners);
        map.put("name","%"+examiners+"%");
        return examinersMapper.getExaminers(map);
    }

    @Override
    public int insertExaminers(Examiners examiners) {
        return examinersMapper.insertExaminers(examiners);
    }

    @Override
    public int deleteExaminers(Integer exId) {
        return examinersMapper.deleteExaminers(exId);
    }

    @Override
    public int updateExaminers(Examiners examiners) {
        return examinersMapper.updateExaminers(examiners);
    }
}
