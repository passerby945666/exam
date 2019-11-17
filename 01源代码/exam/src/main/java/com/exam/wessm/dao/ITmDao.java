package com.exam.wessm.dao;



import com.exam.wessm.entity.Tm;

import java.util.List;

public interface ITmDao {
    /**
     * 查询考生信息
     * @return
     */
    List<Tm> queryTm();

    /**
     * 根据ID加载考生信息
     *
     * @param    tId  ID号
     * @return
     */
    Tm getTm(int tId);

    /**
     * 添加考生
     *
     * @param tm
     * @return
     */
    int insertTm(Tm tm);

    /**
     * 根据考生ID删除考生
     * @param    tId  ID号
     * @return
     */
    int deleteTm(int tId);

    /**
     * 修改考生信息
     * @param tm
     * @return
     */
    int updateTm(Tm tm);
}
