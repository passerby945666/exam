package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ExamDaoImpl implements IExamDao {
    @Autowired
    @Qualifier("examDao")
    @Override
    public List<Exam> queryExam() {
        return null;
    }

    @Override
    public Exam getExam(Exam exam) {
        return null;
    }

    @Override
    public Exam getExam(Subject subject) {
        return null;
    }

    @Override
    public Exam getExam(Manager manager) {
        return null;
    }

    @Override
    public int insertEaxm(Exam exam) {
        return 0;
    }

    @Override
    public int deleteEaxm(Integer eId) {
        return 0;
    }

    @Override
    public int updateEaxm(Exam exam) {
        return 0;
    }
}
