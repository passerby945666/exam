package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;

import java.util.List;

/**
 *   考试Dao接口
 */
public interface IExamDao {
    /**
     * 查询考试信息
     * @return
     */
    List<Exam> queryExam();

    /**
     * 根据ID加载考试信息
     *
     * @param
     * @return
     */
    Exam getExam(int eId);

    /**
     * 添加考试
     *
     * @param exam
     * @return
     */
    int insertEaxm(Exam exam);

    /**
     * 根据考试ID删除考试
     * @param
     * @return
     */
    int deleteEaxm(int eId);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateEaxm(Exam exam);

}
