package com.exam.wessm.mapper;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ExamMapper {
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
    Exam getExamEId(@Param("e_id")Integer eId);

    /**
     * 根据关键字加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamExam(@Param("exam")String exam);

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
    int deleteEaxm(@Param("s_id")Integer eId);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateEaxm(Exam exam);
}
