package com.exam.wessm.dao;



import com.exam.wessm.entity.Subject;

import java.util.List;
/**
 *   题目Dao接口
 */
public interface ISubjectDao {
    /**
     * 查询考试成员信息
     * @return
     */
    List<Subject> querySubject();

    /**
     * 根据ID加载考试成员信息
     *
     * @param    kId  ID号
     * @return
     */
    Subject getSubject(int kId);

    /**
     * 添加考试成员
     *
     * @param km
     * @return
     */
    int insertSubject(Subject subject);

    /**
     * 根据考试成员ID删除考试成员
     * @param    kId  ID号
     * @return
     */
    int deleteSubject(int kId);

    /**
     * 修改考试成员信息
     * @param km
     * @return
     */
    int updateSubject(Subject subject);
}
