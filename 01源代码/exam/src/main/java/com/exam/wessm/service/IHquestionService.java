package com.exam.wessm.service;

import com.exam.wessm.entity.Hquestion;

import java.util.List;
import java.util.Map;

/**
 * 历史考题业务层接口
 * @return
 */
public interface IHquestionService {
    /**
     * 查询历史考题信息
     * @return
     */
    List<Hquestion> queryHquestionAll();

    /**
     *显示阅卷信息
     * @param mNo     管理员编号
     * @param eNo     考试编号
     * @param status  批改状态
     * @return
     */
    List<Map> queryHquestion(String mNo, String eNo, String status);
    /**
     * 根据考题id查询信息
     *
     * @param    hId  ID号
     * @return
     */
    Hquestion getHquestion(int hId);

    /**
     * 提交试卷(一道题)
     *
     * @param hq
     * @return
     */
    int insertHquestion(Hquestion hq);

    /**
     * 根据历史考题ID删除记录
     * @param    hId  ID号
     * @return
     */
    int deleteHquestion(int hId);

    /**
     * 阅卷改分(分数是一个字符串，注意实体类对象的输入)
     * @param hq
     * @return
     */
    int updateHquestion(Hquestion hq);

    /**
     * 阅卷选择试卷界面查询
     * @param mNo
     * @return
     */
    List<Map> queryHquestionMNo(String mNo);


    /**
     * 阅卷改分[多条数据](分数是一个字符串，注意实体类对象的输入)
     * @param list
     * @return
     */
    int updateHquestions(List<Hquestion> list);


}
