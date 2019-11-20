package com.exam.wessm.mapper;

import com.exam.wessm.entity.Grades;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GradesMapper {
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
    List<Map> getGradekFind(Map map);

    /**
     * 根据筛选信息加载成绩信息
     *
     * @param
     * @return
     */
    List<Map> getGradekChoose(Map map);

    /**
     * 根据成绩id查询成绩
     * @param gId
     * @return
     */
    Grades getGradegId(@Param("g_id")int gId);

    /**
     * 根据准考证号查询成绩
     * @param examCard
     * @return
     */
    Grades getGradeExamCard(@Param("examcard")String examCard);



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
    int deleteGrade(@Param("g_id")int gId);

    /**
     * 修改成绩信息
     * @param grades
     * @return
     */
    int updateGrade(Grades grades);



}
