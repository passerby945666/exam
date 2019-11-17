package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository("examDao")
public class ExamDaoImpl implements IExamDao {
    @Autowired
    @Qualifier("examMapper")
    private ExamMapper examMapper;

    @Override
    public List<Exam> queryExam() {
        return examMapper.queryExam();
    }

    @Override
    public Exam getExamEId(Integer eId) {
        return examMapper.getExamEId(eId);
    }

    @Override
    public List<Map> getExamExam(String exam) {
        return examMapper.getExamExam(exam);
    }

    @Override
    public int insertEaxm(Exam exam) {
        return examMapper.insertEaxm(exam);
    }

    @Override
    public int deleteEaxm(Integer eId) {
        return examMapper.deleteEaxm(eId);
    }

    @Override
    public int updateEaxm(Exam exam) {
        return examMapper.updateEaxm(exam);
    }
}
