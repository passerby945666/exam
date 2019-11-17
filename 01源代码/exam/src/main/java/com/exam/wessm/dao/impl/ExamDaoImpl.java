package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;

public class ExamDaoImpl implements IExamDao {
    @Autowired
    @Qualifier("examMapper")
    private ExamMapper examMapper;

    @Override
    public List<Exam> queryExam() {
        return examMapper.queryExam();
    }

    @Override
    public Exam getExam(Integer eId) {
        return examMapper.getExam(eId);
    }

    @Override
    public List<Map> getExam(String exam) {
        return examMapper.getExam(exam);
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
