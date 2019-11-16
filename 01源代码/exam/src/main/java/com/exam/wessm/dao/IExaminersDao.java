package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;

import java.util.List;

/**
 *   考试成员Dao接口
 */
public interface IExaminersDao {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Examiners> queryExaminers();

    /**
     * 根据ID加载考试成员信息
     *
     * @param    exId  ID号
     * @return
     */
    Examiners getExaminers(int exId);

    /**
     * 添加考试成员
     *
     * @param examiners
     * @return
     */
    int insertEaxminers(Examiners examiners);

    /**
     * 根据考试成员ID删除考试成员
     * @param    exId  ID号
     * @return
     */
    int deleteEaxminers(int exId);

    /**
     * 修改考试成员信息
     * @param examiners
     * @return
     */
    int updateEaxminers(Examiners examiners);
}
