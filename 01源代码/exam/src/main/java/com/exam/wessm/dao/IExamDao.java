package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;

import java.util.List;
import java.util.Map;

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
     * 根据考试id加载考试信息
     * @param
     * @return
     */
    Exam getExam(Integer eId);

    /**
     * 根据关键字加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExam(String exam);

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
