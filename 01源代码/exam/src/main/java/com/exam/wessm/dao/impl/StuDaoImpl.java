package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IStuDao;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("stuDao")
public class StuDaoImpl implements IStuDao {
    @Autowired
    @Qualifier("stuMapper")
    private StuMapper stuMapper;
    @Override
    public int registerStu(Stu stu) {
        return stuMapper.registerStu(stu);
    }

    @Override
    public Stu findNoAndPass(String sNo, String sPassword) {
        Stu stu=new Stu();
        stu.setsNo(sNo);
        stu.setsPassword(sPassword);
        return stuMapper.findNoAndPass(stu);
    }

    @Override
    public List<Stu> queryStu() {
        return stuMapper.queryStu();
    }

    @Override
    public Stu getStuSId(Integer sId) {
        return stuMapper.getStuSId(sId);
    }

    @Override
    public  List<Stu>getStu(String stu) {
        Map map=new HashMap();
        map.put("no",stu);
        map.put("name","%"+stu+"%");
        return stuMapper.getStu(map);
    }

    @Override
    public int insertStu(Stu stu) {
        return stuMapper.insertStu(stu);
    }

    @Override
    public int deleteStu(Integer sId) {
        return stuMapper.deleteStu(sId);
    }

    @Override
    public int updateStu(Stu stu) {
        return stuMapper.updateStu(stu);
    }

    @Override
    public int updateStuPassword(Stu stu) {
        return stuMapper.updateStuPassword(stu);
    }

    @Override
    public Map getSexnum() {
        return stuMapper.getSexnum();
    }

    @Override
    public List<Map> getYearnum(Integer sSex) {
        return stuMapper.getYearnum( sSex);
    }

    @Override
    public List<Map> getAvgnum(Integer kId) {
        return stuMapper.getAvgnum(kId);
    }
}
