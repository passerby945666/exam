package com.exam.wessm.service;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;

import java.util.List;
import java.util.Map;

public interface IManagerService {
    /**
     * 查询考试信息
     * @return
     */
    List<Manager> queryManager();

    /**
     * 根据考试id加载考试信息
     * @param
     * @return
     */
    Manager getManagerMId(Integer mId);

    /**
     * 根据关键字加载考试信息
     *
     * @param
     * @return
     */
    Manager getManager(String manager);

    /**
     * 添加考试
     *
     * @param
     * @return
     */
    int insertManager(Manager manager);

    /**
     * 根据考试Id删除考试
     * @param
     * @return
     */
    int deleteManager(Integer mId);

    /**
     * 修改考试信息
     * @param
     * @return
     */
    int updateManager(Manager manager);
}
