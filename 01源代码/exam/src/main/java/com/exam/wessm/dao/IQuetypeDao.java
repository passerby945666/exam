package com.exam.wessm.dao;


import com.exam.wessm.entity.Manager;
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
     * 根据题型ID加载题型信息
     *
     * @param
     * @return
     */
    Quetype getQuetypeQId(Integer qId);

    /**
     * 根据题目类型加载题型信息
     *
     * @param
     * @return
     */
    Quetype getQuetypeQType(String quetype);

    /**
     * 添加题型
     *
     * @param
     * @return
     */
    int insertQuetype(Quetype quetype);

    /**
     * 根据题型ID删除题型
     * @param
     * @return
     */
    int deleteQuetype(Integer qId);

    /**
     * 修改题型信息
     * @param
     * @return
     */
    int updateQuetype(Quetype quetype);
}