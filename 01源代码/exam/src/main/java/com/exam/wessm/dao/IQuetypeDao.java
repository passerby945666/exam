package com.exam.wessm.dao;

import com.exam.wessm.entity.Qt;
import com.exam.wessm.entity.Quetype;

import java.util.List;

/**
 *   题型Dao接口
 *
 */
public interface IQuetypeDao {
    /**
     * 查询题型信息
     * @return
     */
    List<Quetype> queryQuetype();

    /**
     * 根据ID加载题型信息
     *
     * @param    qId  ID号
     * @return
     */
    Quetype getQuetype(int qId);

    /**
     * 添加题型
     *
     * @param qt
     * @return
     */
    int insertQt(Quetype quetype);

    /**
     * 根据题型ID删除题型
     * @param    qId  ID号
     * @return
     */
    int deleteQuetype(int qId);

    /**
     * 修改题型信息
     * @param qt
     * @return
     */
    int updateQuetype(Quetype qt);
}