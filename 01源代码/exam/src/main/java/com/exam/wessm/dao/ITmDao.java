package com.exam.wessm.dao;



import com.exam.wessm.entity.Km;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Qt;
import com.exam.wessm.entity.Tm;

import java.util.List;

public interface ITmDao {
    /**
     * 查询所有题库信息
     * @return
     */
    List<Tm> queryTm();

    /**
     * 根据关键字加载题库信息
     *
     * @param
     * @return
     */
    Tm getTm(Tm tm);

    /**
     * 根据类型加载题库信息
     *
     * @param
     * @return
     */
    Tm getTm(Qt qt);

    /**
     * 根据科目编号或名称加载题库信息
     *
     * @param
     * @return
     */
    Tm getTm(Km km);

    /**
     * 根据负责人编号或名字加载题库信息
     *
     * @param
     * @return
     */
    Tm getTm(Manager manager);

    /**
     * 添加题库信息
     *
     * @param tm
     * @return
     */
    int insertTm(Tm tm);

    /**
     * 根据题库id删除题库信息
     * @param
     * @return
     */
    int deleteTm(Integer tId);

    /**
     * 修改题库信息
     * @param tm
     * @return
     */
    int updateTm(Tm tm);
}
