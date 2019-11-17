package com.exam.wessm.dao.impl;


import com.exam.wessm.dao.IHquestionDao;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.entity.Hquestion;

import java.util.List;

public class HquestionDaoImpl implements IHquestionDao {
    @Override
    public List<Hquestion> queryHquestion() {
        return null;
    }

    @Override
    public List<Hquestion> queryHq(String mNo, String eNo, String status) {
        return null;
    }

    @Override
    public Examiners getHquestion(int hId) {
        return null;
    }

    @Override
    public int insertHquestion(Hquestion hq) {
        return 0;
    }

    @Override
    public int deleteHquestion(int hId) {
        return 0;
    }

    @Override
    public int updateHquestion(Hquestion hq) {
        return 0;
    }
}
