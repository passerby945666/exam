package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.entity.Grades;
import com.exam.wessm.service.IGradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service("hquestionService")
public class GradesServiceImpl implements IGradesService {
    @Autowired
    @Qualifier("gradesDao")
    private IGradesDao gradesDao;

    @Override
    public List<Map> queryGrades() {
        return gradesDao.queryGrades();
    }

    @Override
    public List<Map> getGradekFind(String str) {
        return gradesDao.getGradekFind(str);
    }

    @Override
    public List<Map> getGradekChoose(String kId, Date mintime, Date maxtime) {
        return gradesDao.getGradekChoose(kId,mintime,maxtime);
    }

    @Override
    public Grades getGradegId(int gId) {
        return gradesDao.getGradegId(gId);
    }

    @Override
    public int insertGrade(Grades grades) {
        return gradesDao.insertGrade(grades);
    }

    @Override
    public int deleteGrade(int gId) {
        return gradesDao.deleteGrade(gId);
    }

    @Override
    public int updateGrade(Grades grades) {
        return gradesDao.updateGrade(grades);
    }
}
