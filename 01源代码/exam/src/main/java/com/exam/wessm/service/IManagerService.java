package com.exam.wessm.service;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;

import java.util.List;
import java.util.Map;

public interface IManagerService {
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
    Manager getManagerMId(Integer mId);

    /**
     * 根据关键字加载管理员信息
     *
     * @param
     * @return
     */
    Manager getManager(String manager);

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
    int deleteManager(Integer mId);

    /**
     * 修改管理员信息
     * @param
     * @return
     */
    int updateManager(Manager manager);
}
