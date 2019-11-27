package com.exam.wessm.dao;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.entity.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IQuebankDao {
    /**
     * 查询所有题库信息
     * @return
     */
    List<Map> queryQuebank();

    /**
     * 根据题库id加载题库信息
     * @param
     * @return
     */
    Map getQuebankTId(Integer tId);

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

    /**
     * 根据科目id加载题库信息
     *
     * @param
     * @return
     */
    List<Map> getQuebankKId(Integer kId,String qType);

    /**
     * 根据科目id和题目类型加载题库信息
     *
     * @param
     * @return
     */
    List<Map> getQuebankKIdAndQType(String kId,String qType);

    /**
     * 根据下拉框加载题库信息
     *
     * @param
     * @return
     */
    List<Map> queryQuebankKId(String kId,String qId);


    /**
     * 根据题库id删除题库信息
     * @param
     * @return
     */
    int deleteQuebankMId( Integer mId);

    /**
     * 根据管理员id查题库id信息
     * @param
     * @return
     */
    List<Integer> queryQuebankMId(Integer mId);
}
