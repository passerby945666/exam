package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Grades;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 *   成绩Dao接口
 */
public interface IGradesDao {
    /**
     * 查询成绩信息
     * @return
     */
    List<Map> queryGrades();

    /**
     * 根据检索信息加载成绩信息
     *
     * @param
     * @return
     */
    List<Map> getGradekFind(String str);

    /**
     * 根据筛选信息加载成绩信息
     *
     * @param
     * @return
     */
    List<Map> getGradekChoose(String kId, Date mintime, Date maxtime);

    /**
     * 根据成绩id查询成绩
     * @param gId
     * @return
     */
    Grades getGradegId(int gId);
    /**
     * 根据准考证号查询成绩
     * @param examCard
     * @return
     */
    Grades getGradeExamCard(String examCard);

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
    int deleteGrade(int gId);

    /**
     * 修改成绩信息
     * @param grades
     * @return
     */
    int updateGrade(Grades grades);


}
