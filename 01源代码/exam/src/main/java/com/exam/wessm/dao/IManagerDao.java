package com.exam.wessm.dao;

import com.exam.wessm.entity.Km;
import com.exam.wessm.entity.Manager;

import java.util.List;
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
     * 根据ID加载管理员信息
     *
     * @param    mId  ID号
     * @return
     */
    Manager getManager(int mId);

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    int insertManager(Manager manager);

    /**
     * 根据管理员ID删除管理员
     * @param   mId  ID号
     * @return
     */
    int deleteManager(int mId);

    /**
     * 修改管理员
     * @param manager
     * @return
     */
    int updateManager(Manager manager);
}
