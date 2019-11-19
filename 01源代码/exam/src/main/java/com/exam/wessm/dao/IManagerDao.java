package com.exam.wessm.dao;

import com.exam.wessm.entity.Manager;

import java.util.List;
import java.util.Map;

/**
 *   管理员Dao接口
 */
public interface IManagerDao {
    /**
     * 查询管理员信息
     * @return
     */
    List<Manager> queryManager();

    /**
     * 根据管理员ID加载管理员信息
     *
     * @param
     * @return
     */
    Manager getManagerMId(Integer mId);

    /**
     * 根据管理员编号或名字或身份证号加载管理员信息
     *
     * @param
     * @return
     */
    Manager getManager(String manager);

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    int insertManager(Manager manager);

    /**
     * 根据管理员ID删除管理员
     * @param
     * @return
     */
    int deleteManager(Integer mId);

    /**
     * 修改管理员
     * @param manager
     * @return
     */
    int updateManager(Manager manager);
}
