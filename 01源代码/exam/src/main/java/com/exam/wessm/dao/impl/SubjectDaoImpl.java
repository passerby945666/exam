package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.ISubjectDao;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("subjectDao")
public class SubjectDaoImpl implements ISubjectDao {
    @Autowired
    @Qualifier("subjectMapper")
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> querySubject() {
        return subjectMapper.querySubject();
    }

    @Override
    public Subject getSubjectKId(Integer kId) {
        return subjectMapper.getSubjectKId(kId);
    }

    @Override
    public Subject getSubject(String subject) {
        Map map=new HashMap();
        map.put("no",subject);
        map.put("name","%"+subject+"%");
        return subjectMapper.getSubject(map);
    }

    @Override
    public int insertSubject(Subject subject) {
        return subjectMapper.insertSubject(subject);
    }

    @Override
    public int deleteSubject(Integer kId) {
        return subjectMapper.deleteSubject(kId);
    }

    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateSubject(subject);
    }
}
