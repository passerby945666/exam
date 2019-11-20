package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Grades;
import com.exam.wessm.mapper.GradesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("gradesDao")
public class GradesDaoImpl implements IGradesDao {
        @Autowired
        @Qualifier("gradesMapper")
        private GradesMapper gradesMapper;

    @Override
    public List<Map> queryGrades() {
        return gradesMapper.queryGrades();
    }

    @Override
    public List<Map> getGradekFind(String str) {
        Map map=new HashMap();
        map.put("no",str);
        map.put("name","%"+str+"%");
        return gradesMapper.getGradekFind(map);
    }

    @Override
    public List<Map> getGradekChoose(String kId, Date mintime,Date maxtime) {
        Map map=new HashMap();
        map.put("kId",kId);
        map.put("mintime",mintime);
        map.put("maxtime",maxtime);
        return gradesMapper.getGradekChoose(map);
    }

    @Override
    public Grades getGradeExamCard(String examCard) {
        return gradesMapper.getGradeExamCard(examCard);
    }

    @Override
    public Grades getGradegId(int gId) {
        return gradesMapper.getGradegId(gId);
    }

    @Override
    public int insertGrade(Grades grades) {
        return gradesMapper.insertGrade(grades);
    }

    @Override
    public int deleteGrade(int gId) {
        return gradesMapper.deleteGrade(gId);
    }

    @Override
    public int updateGrade(Grades grades) {
        return gradesMapper.updateGrade(grades);
    }
}
