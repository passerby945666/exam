package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IExamDao;
import com.exam.wessm.dao.IExaminersDao;
import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.dao.IHquestionDao;
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
import java.util.Map;
@Service("examService")
public class ExamServiceImpl implements IExamService {

    @Autowired
    @Qualifier("examDao")
    private IExamDao examDao;
    @Autowired
    @Qualifier("gradesDao")
    private IGradesDao gradesDao;
    @Autowired
    @Qualifier("examinersDao")
    private IExaminersDao examinersDao;
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryExam() {
        return examDao.queryExam();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Map getExamEId(Integer eId) {

        return examDao.getExamEId(eId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExamExam(String exam) {
        return examDao.getExamExam(exam);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertExam(Exam exam) {
        int rows=-1;
        try {
            rows=rows=examDao.insertExam(exam);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteExam(Integer eId) {
        int rows=-1;
        try {
            rows=examDao.deleteExam(eId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateExam(Exam exam) {
        int rows=-1;
        try {
            rows=examDao.updateExam(exam);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExamSNo(String sNo) {
        return examDao.getExamSNo(sNo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExamSId(Integer sId) {
        return examDao.getExamSId(sId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getExamBaoming(Integer sId) {
        return examDao.getExamBaoming(sId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryExamKId(String kId) {
        return examDao.queryExamKId(kId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteExamAll(Integer eId) {
        int rows=-1;
        try {
           gradesDao.deleteGradeEId(eId);
           hquestionDao.deleteHquestionEId(eId);
           examinersDao.deleteExaminersEId(eId);
           rows=examDao.deleteExam(eId);

        }catch (Exception e){
              rows=0;
              e.printStackTrace();
        }finally {
            return rows;
        }
    }
}
