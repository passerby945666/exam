package com.exam.wessm.dao;



import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Qt;
import com.exam.wessm.entity.Quebank;

import java.util.List;

public interface IQuebankDao {
    /**
     * 查询所有题库信息
     * @return
     */
    List<Quebank> queryQuebank();

    /**
     * 根据关键字加载题库信息
     *
     * @param
     * @return
     */
    Quebank getQuebank(Quebank tm);

    /**
     * 根据类型加载题库信息
     *
     * @param
     * @return
     */
    Quebank getTm(Quebank qt);

    /**
     * 根据科目编号或名称加载题库信息
     *
     * @param
     * @return
     */
    Quebank getQuebank(Quebank km);

    /**
     * 根据负责人编号或名字加载题库信息
     *
     * @param
     * @return
     */
    Quebank getQuebank(Manager manager);

    /**
     * 添加题库信息
     *
     * @param tm
     * @return
     */
    int insertQuebank(Quebank tm);

    /**
     * 根据题库id删除题库信息
     * @param
     * @return
     */
    int deleteQuebank(Integer tId);

    /**
     * 修改题库信息
     * @param tm
     * @return
     */
    int updateQuebank(Quebank tm);
}
