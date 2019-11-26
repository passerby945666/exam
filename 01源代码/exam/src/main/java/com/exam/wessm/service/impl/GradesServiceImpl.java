package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.entity.Grades;
import com.exam.wessm.service.IGradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service("gradesService")
public class GradesServiceImpl implements IGradesService {
    @Autowired
    @Qualifier("gradesDao")
    private IGradesDao gradesDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryGrades() {
        return gradesDao.queryGrades();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getGradekFind(String str) {
        return gradesDao.getGradekFind(str);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> getGradekChoose(String kId, Date mintime, Date maxtime) {
        return gradesDao.getGradekChoose(kId,mintime,maxtime);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Grades getGradeExamCard(String examCard) {
        return gradesDao.getGradeExamCard(examCard);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Grades getGradegId(int gId) {
        return gradesDao.getGradegId(gId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertGrade(Grades grades) {
        int rows=-1;
        try {
            rows=gradesDao.insertGrade(grades);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteGrade(int gId) {
        int rows=-1;
        try {
            rows=gradesDao.deleteGrade(gId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateGrade(Grades grades) {
        int rows=-1;
        try {
            rows=gradesDao.updateGrade(grades);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }
}
