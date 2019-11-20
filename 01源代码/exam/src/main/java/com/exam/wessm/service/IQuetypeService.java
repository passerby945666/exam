package com.exam.wessm.service;

import com.exam.wessm.entity.Quetype;

import java.util.List;

public interface IQuetypeService{
    /**
     * 查询题目类型信息
     * @return
     */
    List<Quetype> queryQuetype();

    /**
     * 根据题目类型id加载题目类型信息
     * @param
     * @return
     */
    Quetype getQuetypeQId(Integer qId);

    /**
     * 根据关键字加载题目类型信息
     *
     * @param
     * @return
     */
    Quetype getQuetypeQType(String quetype);

    /**
     * 添加题目类型
     *
     * @param
     * @return
     */
    int insertQuetype(Quetype quetype);

    /**
     * 根据题目类型Id删除题目类型
     * @param
     * @return
     */
    int deleteQuetype(Integer qId);

    /**
     * 修改题目类型信息
     * @param
     * @return
     */
    int updateQuetype(Quetype quetype);
}
