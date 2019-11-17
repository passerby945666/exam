package com.exam.wessm.dao;

import com.exam.wessm.entity.Km;
import com.exam.wessm.entity.Qt;

import java.util.List;

/**
 *   题型Dao接口
 *
 */
public interface IQtDao {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Qt> queryQt();

    /**
     * 根据ID加载考试成员信息
     *
     * @param    qId  ID号
     * @return
     */
    Qt getQt(int qId);

    /**
     * 添加考试成员
     *
     * @param qt
     * @return
     */
    int insertQt(Qt qt);

    /**
     * 根据考试成员ID删除考试成员
     * @param    qId  ID号
     * @return
     */
    int deleteQt(int qId);

    /**
     * 修改考试成员信息
     * @param qt
     * @return
     */
    int updateQt(Qt qt);
}