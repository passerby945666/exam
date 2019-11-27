package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IGradesDao;
import com.exam.wessm.dao.IHquestionDao;
import com.exam.wessm.entity.Grades;
import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.service.IHquestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("hquestionService")
public class HquestionServiceImpl implements IHquestionService {
    @Autowired
    @Qualifier("hquestionDao")
    private IHquestionDao hquestionDao;
    @Autowired
    @Qualifier("gradesDao")
    private IGradesDao gradesDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Hquestion> queryHquestionAll() {
        return hquestionDao.queryHquestionAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryHquestion(String mNo, String eNo, String status) {
        return hquestionDao.queryHquestion(mNo, eNo, status);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Hquestion getHquestion(int hId) {
        return hquestionDao.getHquestion(hId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insertHquestion(Hquestion hq) {
        int rows=-1;
        try {
            hquestionDao.insertHquestion(hq);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestion(int hId) {
        int rows=-1;
        try {
            hquestionDao.deleteHquestion(hId);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateHquestion(Hquestion hq) {
        int rows=-1;
        try {
            rows=hquestionDao.updateHquestion(hq);
        }catch (Exception e){
            e.printStackTrace();
            rows=0;
        }finally {
            return rows;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map> queryHquestionMNo(String mNo) {
        return hquestionDao.queryHquestionMNo(mNo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updateHquestions(List<Hquestion> list) {
        int rows=-1;
        int gId=0;
        int grade;
        int add;
        for(Hquestion hquestion:list){
            try{

                Hquestion hquestion1=hquestionDao.getHquestion(hquestion.gethId());
                gId=gradesDao.getGradeGId2(hquestion1.getsId(),hquestion1.geteId());
                Grades grades=gradesDao.getGradegId(gId);
                grade=Integer.valueOf(grades.getGrade());
                add=Integer.valueOf(hquestion.gethGrade());
                Grades grades1=new Grades(0,hquestion1.getsId(),hquestion1.geteId(),String.valueOf(grade+add));
                rows=hquestionDao.updateHquestion(hquestion);
                gradesDao.updateGrade(grades1);
                if(rows!=1){
                    return 0;
                }
            }catch (Exception e){
                e.printStackTrace();
                return 0;
            }
           }
        return 1;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestionSId(int sId) {
        int rows=-1;
        try {
            rows=hquestionDao.deleteHquestionSId(sId);
        }catch (Exception e){
            rows=0;
        }
        return rows;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestionEId(int eId) {
        int rows=-1;
        try {
            rows=hquestionDao.deleteHquestionEId(eId);
        }catch (Exception e){
            rows=0;
        }
        return rows;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int deleteHquestionTId(int tId) {
        int rows=-1;
        try {
            rows=hquestionDao.deleteHquestionTId(tId);
        }catch (Exception e){
            rows=0;
        }
        return rows;
    }
}
