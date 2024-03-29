package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository("examDao")
public class ExamDaoImpl implements IExamDao {
    @Autowired
    @Qualifier("examMapper")
    private ExamMapper examMapper;

    @Override
    public List<Map> queryExam() {
        return examMapper.queryExam();
    }

    @Override
    public Map getExamEId(Integer eId) {

        return examMapper.getExamEId(eId);
    }

    @Override
    public List<Map> getExamExam(String exam) {
        Map map=new HashMap();
        map.put("no",exam);
        map.put("name","%"+exam+"%");
        return examMapper.getExamExam(map);
    }

    @Override
    public int insertExam(Exam exam) {
        return examMapper.insertExam(exam);
    }

    @Override
    public int deleteExam(Integer eId) {
        return examMapper.deleteExam(eId);
    }

    @Override
    public int updateExam(Exam exam) {
        return examMapper.updateExam(exam);
    }

    @Override
    public List<Map> getExamSNo(String sNo) {
        return examMapper.getExamSNo(sNo);
    }

    @Override
    public List<Map> getExamSId(Integer sId) {
        return examMapper.getExamSId(sId);
    }

    @Override
    public List<Map> getExamBaoming(Integer sId) {
        return examMapper.getExamBaoming(sId);
    }

    @Override
    public List<Map> queryExamKId(String kId) {
        return examMapper.queryExamKId(kId);
    }

    @Override
    public List<Integer> queryExamMId(int mId) {
        return examMapper.queryExamMId(mId);
    }
}
