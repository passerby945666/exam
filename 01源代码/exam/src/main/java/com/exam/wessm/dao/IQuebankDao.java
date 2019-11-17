package com.exam.wessm.dao;



import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.entity.Subject;

import java.util.List;
import java.util.Map;

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
    List<Map> getQuebank(String quebank);

    /**
     * 添加题库信息
     *
     * @param
     * @return
     */
    int insertQuebank(Quebank quebank);

    /**
     * 根据题库id删除题库信息
     * @param
     * @return
     */
    int deleteQuebank(Integer tId);

    /**
     * 修改题库信息
     * @param
     * @return
     */
    int updateQuebank(Quebank quebank);
}
