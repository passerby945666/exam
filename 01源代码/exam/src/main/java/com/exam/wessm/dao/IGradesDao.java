package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Grades;

import java.util.List;
/**
 *   成绩Dao接口
 */
public interface IGradesDao {
    /**
     * 查询成绩信息
     * @return
     */
    List<Grades> queryGrades();

    /**
     * 根据科目ID加载成绩信息
     *
     * @param
     * @return
     */
    List<Grades> getGradekId(int kId);

    /**
     * 根据考试id查询成绩
     * @param eId
     * @return
     */
    Grades getgetGradeeId(int eId);

    /**
     * 添加成绩
     *
     * @param grades
     * @return
     */
    int insertGrade(Grades grades);

    /**
     * 根据成绩id删除成绩记录
     * @param
     * @return
     */
    int deleteGrede(int gId);

    /**
     * 修改成绩信息
     * @param grades
     * @return
     */
    int updateEaxm(Grades grades);


}
