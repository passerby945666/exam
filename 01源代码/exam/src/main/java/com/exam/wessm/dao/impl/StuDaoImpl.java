package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IStuDao;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("stuDao")
public class StuDaoImpl implements IStuDao {
    @Autowired
    @Qualifier("StuMapper")

    private StuMapper stuMapper;
    @Override
    public int registerStu(Stu stu) {

        return stuMapper.registerStu(stu);
    }

    @Override
    public Stu findNoAndPass(String sNo, String sPassword) {

        return stuMapper.findNoAndPass(sNo,sPassword);
    }

    @Override
    public int deleteStu(int sId) {
        return stuMapper.deleteStu(sId);
    }

    @Override
    public List<Stu> queryStu() {
        return stuMapper.queryStu();
    }

    @Override
    public Stu getStu(int sId) {
        return stuMapper.getStu(sId);
    }

    @Override
    public int updateStu(Stu stu) {
        return stuMapper.updateStu(stu);
    }
}
