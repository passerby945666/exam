package com.exam.wessm.mapper;

import com.exam.wessm.entity.Hquestion;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface HquestionMapper {
    /**
     * 查询历史考题信息
     * @return
     */
    List<Hquestion> queryHquestionAll();


    /**
     *显示阅卷信息

     * @return
     */
    List<Map> queryHquestion(Map map);
    /**
     * 根据考题id查询信息
     *
     * @param    hId  ID号
     * @return
     */
    Hquestion getHquestion( @Param("h_id")int hId);

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
    int deleteHquestion( @Param("h_id")int hId);

    /**
     * 阅卷改分
     * @param hq
     * @return
     */
    int updateHquestion(Hquestion hq);

    /**
     * 阅卷选择试卷界面查询
     * @param mNo
     * @return
     */
    List<Map> queryHquestionMNo(@Param("m_no")String mNo);

    /**
     * 根据历史考生ID删除记录
     * @param    sId  ID号
     * @return
     */
    int deleteHquestionSId( @Param("s_id")int sId);

    /**
     * 根据考试ID删除记录
     * @param    eId  ID号
     * @return
     */
    int deleteHquestionEId( @Param("e_id")int eId);

    /**
     * 根据考题ID删除记录
     * @param    tId  ID号
     * @return
     */
    int deleteHquestionTId(@Param("t_id") int tId);

}
