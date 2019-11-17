package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Grades;

import java.util.List;

public class GradesDaoImpl implements IGradesDao {
    @Override
    public List<Grades> queryExam() {
        return null;
    }

    @Override
    public Grades getExam(int eId) {
        return null;
    }

    @Override
    public int insertEaxm(Grades grades) {
        return 0;
    }

    @Override
    public int deleteEaxm(int eId) {
        return 0;
    }

    @Override
    public int updateEaxm(Exam exam) {
        return 0;
    }
}
