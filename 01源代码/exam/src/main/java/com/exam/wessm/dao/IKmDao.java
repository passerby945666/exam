package com.exam.wessm.dao;



import com.exam.wessm.entity.Km;

import java.util.List;
/**
 *   题目Dao接口
 */
public interface IKmDao {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Km> queryKm();

    /**
     * 根据ID加载考试成员信息
     *
     * @param    kId  ID号
     * @return
     */
    Km getKm(int kId);

    /**
     * 添加考试成员
     *
     * @param km
     * @return
     */
    int insertKm(Km km);

    /**
     * 根据考试成员ID删除考试成员
     * @param    kId  ID号
     * @return
     */
    int deleteKm(int kId);

    /**
     * 修改考试成员信息
     * @param km
     * @return
     */
    int updateKm(Km km);
}
