package com.exam.wessm.service.impl;

import com.exam.wessm.dao.IStuDao;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("stuService")
public class StuServiceImpl implements IStuService {
    @Autowired
    @Qualifier("stuDao")
    private IStuDao stuDao;
    @Override
    public int registerStu(Stu stu) {
        return stuDao.registerStu(stu);
    }

    @Override
    public Stu findNoAndPass(String sNo, String sPassword) {
        return stuDao.findNoAndPass(sNo,sPassword);
    }

    @Override
    public int deleteStu(int sId) {
        return stuDao.deleteStu(sId);
    }

    @Override
    public List<Stu> queryStu() {
        return stuDao.queryStu();
    }

    @Override
    public Stu getStu(int sId) {
        return stuDao.getStu(sId);
    }

    @Override
    public int updateStu(Stu stu) {
        return stuDao.updateStu(stu);
    }
}
