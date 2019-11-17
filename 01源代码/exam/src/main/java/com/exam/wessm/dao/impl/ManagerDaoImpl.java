package com.exam.wessm.dao.impl;

import com.exam.wessm.dao.IManagerDao;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("managerDao")
public class ManagerDaoImpl implements IManagerDao {
        @Autowired
        @Qualifier("managerMapper")
        private ManagerMapper managerMapper;

    @Override
    public List<Manager> queryManager() {
        return null;
    }

    @Override
    public Manager getManager(int mId) {
        return null;
    }

    @Override
    public int insertManager(Manager manager) {
        return 0;
    }

    @Override
    public int deleteManager(int mId) {
        return 0;
    }

    @Override
    public int updateManager(Manager manager) {
        return 0;
    }
}
