package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Grades;

import java.util.List;
/**
 *   成绩Dao接口
 */
public interface IGradesDao {
    /**
     * 查询考试信息
     * @return
     */
    List<Grades> queryExam();

    /**
     * 根据ID加载考试信息
     *
     * @param
     * @return
     */
    Grades getExam(int eId);

    /**
     * 添加考试
     *
     * @param grades
     * @return
     */
    int insertEaxm(Grades grades);

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
