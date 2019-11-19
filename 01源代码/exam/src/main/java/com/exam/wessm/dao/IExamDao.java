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
    List<Map> queryExam();

    /**
     * 根据考试id加载考试信息
     * @param
     * @return
     */
    List<Map> getExamEId(Integer eId);

    /**
     * 根据关键字加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamExam(String exam);

    /**
     * 添加考试
     *
     * @param exam
     * @return
     */
    int insertExam(Exam exam);

    /**
     * 根据考试Id删除考试
     * @param
     * @return
     */
    int deleteExam(Integer eId);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateExam(Exam exam);

}
