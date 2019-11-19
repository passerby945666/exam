package com.exam.wessm.service;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;

import java.util.List;

public interface ISubjectService {
    /**
     * 查询科目信息
     * @return
     */
    List<Subject> querySubject();

    /**
     * 根据科目id加载科目信息
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
     * @param
     * @return
     */
    int insertSubject(Subject subject);

    /**
     * 根据科目Id删除科目
     * @param
     * @return
     */
    int deleteSubject(Integer kId);

    /**
     * 修改科目信息
     * @param
     * @return
     */
    int updateSubject(Subject subject);
}
