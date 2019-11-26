package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IManagerDao;
import com.exam.wessm.dao.ISubjectDao;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("subjectService")
public class SubjectServiceImpl implements ISubjectService {
    @Autowired
    @Qualifier("subjectDao")
    private ISubjectDao subjectDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Subject> querySubject() {
        return subjectDao.querySubject();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Subject getSubjectKId(Integer kId) {
        return subjectDao.getSubjectKId(kId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Subject getSubject(String subject) {
        return subjectDao.getSubject(subject);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertSubject(Subject subject) {
        int rows=-1;
        try {
            rows=subjectDao.insertSubject(subject);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteSubject(Integer kId) {
        int rows=-1;
        try {
            rows=subjectDao.deleteSubject(kId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateSubject(Subject subject) {
        int rows=-1;
        try {
            rows=subjectDao.updateSubject(subject);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }
}
