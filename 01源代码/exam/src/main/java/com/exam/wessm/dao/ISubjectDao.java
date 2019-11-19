package com.exam.wessm.dao;



import com.exam.wessm.entity.Subject;

import java.util.List;
import java.util.Map;

/**
 *   题目Dao接口
 */
public interface ISubjectDao {
    /**
     * 查询所有科目信息
     * @return
     */
    List<Subject> querySubject();

    /**
     * 根据ID加载科目信息
     *
     * @param
     * @return
     */
    Subject getSubjectKId(Integer kId);

    /**
     * 根据科目编号或名字加载科目信息
     *
     * @param
     * @return
     */
    Subject getSubject(String subject);

    /**
     * 添加科目
     *
     * @param subject
     * @return
     */
    int insertSubject(Subject subject);

    /**
     * 根据科目ID删除科目
     * @param    kId  ID号
     * @return
     */
    int deleteSubject(Integer kId);

    /**
     * 修改科目信息
     * @param subject
     * @return
     */
    int updateSubject(Subject subject);
}
