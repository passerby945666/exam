package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public class ExamServiceImpl implements IExamService {

    @Autowired
    @Qualifier("examDao")
    private IExamDao examDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Exam> queryExam() {
        return examDao.queryExam();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Exam getExam(Exam exam) {
        return examDao.getExam(exam);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Exam getExam(Subject subject) {
        return examDao.getExam(subject);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Exam getExam(Manager manager) {
        return examDao.getExam(manager);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertEaxm(Exam exam) {
        return examDao.insertEaxm(exam);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteEaxm(Integer eId) {
        return examDao.deleteEaxm(eId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateEaxm(Exam exam) {
        return examDao.updateEaxm(exam);
    }
}
