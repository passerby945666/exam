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
     * 查询题型信息
     * @return
     */
    List<Qt> queryQt();

    /**
     * 根据ID加载题型信息
     *
     * @param    qId  ID号
     * @return
     */
    Qt getQt(int qId);

    /**
     * 添加题型
     *
     * @param qt
     * @return
     */
    int insertQt(Qt qt);

    /**
     * 根据题型ID删除题型
     * @param    qId  ID号
     * @return
     */
    int deleteQt(int qId);

    /**
     * 修改题型信息
     * @param qt
     * @return
     */
    int updateQt(Qt qt);
}