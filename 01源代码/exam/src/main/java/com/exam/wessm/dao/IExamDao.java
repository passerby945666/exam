package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;

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
     * 根据考试编号或名字或开考时间加载考试信息
     * @param exam
     * @return
     */
    Exam getExam(Exam exam);
    /**
     * 根据科目编号或名字加载考试信息
     *
     * @param
     * @return
     */
    Exam getExam(Km km);

    /**
     * 根据管理员编号或名字加载考试信息
     * @param manager
     * @return
     */
    Exam getExam(Manager manager);

    /**
     * 添加考试
     *
     * @param exam
     * @return
     */
    int insertEaxm(Exam exam);

    /**
     * 根据考试编号或名字删除考试
     * @param
     * @return
     */
    int deleteEaxm(Exam exam);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateEaxm(Exam exam);

}
