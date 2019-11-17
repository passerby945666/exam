package com.exam.wessm.mapper;

import com.exam.wessm.entity.Quebank;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QuebankMapper {
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
    List<Map> getQuebank(@Param("quebank") String quebank);

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
    int deleteQuebank(@Param("t_id") Integer tId);

    /**
     * 修改题库信息
     * @param
     * @return
     */
    int updateQuebank(Quebank quebank);
}
