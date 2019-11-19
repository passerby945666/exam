package com.exam.wessm.service;

import com.exam.wessm.entity.Examiners;

import java.util.List;
import java.util.Map;

/**
 * 考试成员业务层接口
 */
public interface IExaminersService {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Map> queryExaminers();

    /**
     * 根据考试成员id加载考试信息
     * @param
     * @return
     */
    List<Map> getExaminersExId(Integer exId);

    /**
     * 根据考试编号或姓名加载考试成员信息
     *
     * @param
     * @return
     */
    List<Map> getExaminers(String examiners);

    /**
     * 添加考试成员
     *
     * @param examiners
     * @return
     */
    int insertExaminers(Examiners examiners);

    /**
     * 根据考试成员id删除考试成员
     * @param
     * @return
     */
    int deleteExaminers(Integer exId);

    /**
     * 修改考试成员信息
     * @param examiners
     * @return
     */
    int updateExaminers(Examiners examiners);
}
