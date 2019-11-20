package com.exam.wessm.mapper;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Quetype;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QuetypeMapper {
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
    Quetype getQuetypeQId(@Param("q_id")Integer qId);

    /**
     * 根据题目类型加载题目类型信息
     *
     * @param
     * @return
     */
    Quetype getQuetypeQType(@Param("q_type") String qType);

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
    int deleteQuetype(@Param("q_id")Integer qId);

    /**
     * 修改题目类型信息
     * @param
     * @return
     */
    int updateQuetype(Quetype quetype);
}
