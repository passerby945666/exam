package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IManagerDao;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("managerDao")
public class ManagerDaoImpl implements IManagerDao {
    @Autowired
    @Qualifier("managerMapper")
    private ManagerMapper managerMapper;


    @Override
    public List<Manager> queryManager() {
        return managerMapper.queryManager();
    }

    @Override
    public Manager getManagerMId(Integer mId) {
        return managerMapper.getManagerMId(mId);
    }

    @Override
    public Manager getManager(String manager) {
        Map map=new HashMap();
        map.put("no",manager);
        map.put("name","%"+manager+"%");
        return managerMapper.getManager(map);
    }

    @Override
    public int insertManager(Manager manager) {
        return managerMapper.insertManager(manager);
    }

    @Override
    public int deleteManager(Integer mId) {
        return managerMapper.deleteManager(mId);
    }

    @Override
    public int updateManager(Manager manager) {
        return managerMapper.updateManager(manager);
    }
}
