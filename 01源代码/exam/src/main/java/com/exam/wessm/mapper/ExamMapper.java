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
    List<Map> queryExam();

    /**
     * 根据考试id加载考试信息
     * @param
     * @return
     */
  Map getExamEId(@Param("e_id")Integer eId);

    /**
     * 根据关键字加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamExam(Map map);

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
    int deleteExam(@Param("e_id")Integer eId);

    /**
     * 修改考试信息
     * @param exam
     * @return
     */
    int updateExam(Exam exam);

    /**
     * 根据考生编号加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamSNo(@Param("s_no") String sNo);

    /**
     * 根据考生ID加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamSId(@Param("s_id") Integer sId);

    /**
     * 根据考生ID加载考试信息
     *
     * @param
     * @return
     */
    List<Map> getExamBaoming(@Param("s_id") Integer sId);

    /**
     *根据下拉框加载考试
     *
     * @param
     * @return
     */
    List<Map> queryExamKId(@Param("k_id") String kId);

  /**
   *用管理员差考试id
   *
   * @param
   * @return
   */
    List<Integer> queryExamMId (@Param("m_id") int mId);
}
