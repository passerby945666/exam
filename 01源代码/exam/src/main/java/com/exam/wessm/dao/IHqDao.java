package com.exam.wessm.dao;

import com.exam.wessm.entity.Examiners;
import com.exam.wessm.entity.Hq;

import java.util.List;

public interface IHqDao {
    /**
     * 查询历史考题信息
     * @return
     */
    List<Hq> queryHq();

    /**
     *
     * @param mNo     管理员编号
     * @param eNo     考试编号
     * @param status  批改状态
     * @return
     */
    List<Hq> queryHq(String mNo,String eNo,String status);
    /**
     * 根据ID加载考试成员信息
     *
     * @param    hId  ID号
     * @return
     */
    Examiners getHq(int hId);

    /**
     * 添加考试成员
     *
     * @param hq
     * @return
     */
    int insertHq(Hq hq);

    /**
     * 根据考试成员ID删除考试成员
     * @param    hId  ID号
     * @return
     */
    int deleteHq(int hId);

    /**
     * 修改考试成员信息
     * @param hq
     * @return
     */
    int updateHq(Hq hq);
}
