package com.exam.wessm.dao;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.entity.Stu;

import java.util.List;

/**
 *   考试成员Dao接口
 */
public interface IExaminersDao {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Examiners> queryExaminers();

    /**
     * 根据考试编号或姓名加载考试成员信息
     *
     * @param
     * @return
     */
    Examiners getExaminers(Exam exam);

    /**
     * 添加考试成员
     *
     * @param examiners
     * @return
     */
    int insertEaxminers(Examiners examiners);

    /**
     * 根据成员准考证号删除考试成员
     * @param
     * @return
     */
    int deleteEaxminers(Examiners examiners);

    /**
     * 根据考生编号或名字删除考试成员
     * @param
     * @return
     */
    int deleteEaxminers(Stu stu);

    /**
     * 修改考试成员信息
     * @param examiners
     * @return
     */
    int updateEaxminers(Examiners examiners);
}
