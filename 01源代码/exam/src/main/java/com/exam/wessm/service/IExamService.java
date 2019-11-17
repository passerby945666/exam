package com.exam.wessm.service;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;

import java.util.List;
/***
 * 考试业务层接口
 */
public interface IExamService {
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
    Exam getExam(Subject subject);

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
     * 根据考试Id删除考试
     * @param
     * @return
     */
    int deleteEaxm(Integer eId);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateEaxm(Exam exam);
}
