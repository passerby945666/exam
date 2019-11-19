package com.exam.wessm.mapper;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SubjectMapper {
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
    Subject getSubjectKId(@Param("k_id")Integer kId);

    /**
     * 根据科目编号或名字加载科目信息
     *
     * @param
     * @return
     */
    Subject getSubject(Map map);

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
    int deleteSubject(@Param("k_id")Integer kId);

    /**
     * 修改科目信息
     * @param
     * @return
     */
    int updateSubject(Subject subject);
}
