package com.exam.wessm.mapper;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ManagerMapper {
    /**
     * 查询管理员信息
     * @return
     */
    List<Manager> queryManager();

    /**
     * 根据管理员id加载管理员信息
     * @param
     * @return
     */
    Manager getManagerMId(@Param("m_id")Integer mId);

    /**
     * 根据管理员编号或名字或身份证号加载管理员信息
     *
     * @param
     * @return
     */
    Manager getManager(Map map);

    /**
     * 添加管理员
     *
     * @param
     * @return
     */
    int insertManager(Manager manager);

    /**
     * 根据管理员Id删除管理员
     * @param
     * @return
     */
    int deleteManager(@Param("m_id")Integer mId);

    /**
     * 修改管理员信息
     * @param
     * @return
     */
    int updateManager(Manager manager);
}
