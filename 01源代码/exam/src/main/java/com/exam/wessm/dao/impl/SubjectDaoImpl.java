package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.ISubjectDao;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("subjectDao")
public class SubjectDaoImpl implements ISubjectDao {
        @Autowired
        @Qualifier("subjectMapper")
        private SubjectMapper subjectMapper;

    @Override
    public List<Subject> querySubject() {
        return null;
    }

    @Override
    public Subject getSubject(int kId) {
        return null;
    }

    @Override
    public int insertSubject(Subject subject) {
        return 0;
    }

    @Override
    public int deleteSubject(int kId) {
        return 0;
    }

    @Override
    public int updateSubject(Subject subject) {
        return 0;
    }
}
