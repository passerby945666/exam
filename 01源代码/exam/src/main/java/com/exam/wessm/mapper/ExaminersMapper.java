package com.exam.wessm.mapper;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ExaminersMapper {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Map> queryExaminers();

    /**
     * 根据考试编号或姓名加载考试成员信息
     *
     * @param
     * @return
     */
    List<Map> getExaminers(@Param("examiners")String examiners);

    /**
     * 添加考试成员
     *
     * @param
     * @return
     */
    int insertExaminers(Examiners examiners);

    /**
     * 根据考试成员Id删除考试成员
     * @param
     * @return
     */
    int deleteExaminers(@Param("ex_id")Integer exId);

    /**
     * 修改考试成员信息
     * @param
     * @return
     */
    int updateExaminers(Examiners examiners);

}
