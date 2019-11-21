package com.exam.wessm.mapper;

import com.exam.wessm.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 考生Mapper接口
 */
public interface StuMapper {
    /**
     * 考生注册
     *
     * @param stu
     * @return
     */
    int registerStu(Stu stu);

    /**
     * 考生通过账号和密码登录
     * @param stu
     * @return
     */
    Stu findNoAndPass(Stu stu);

    /**
     * 查询考生信息
     * @return
     */
    List<Stu> queryStu();

    /**
     * 根据考生ID加载考生信息
     *
     * @param    sId
     * @return
     */
    Stu getStuSId(@Param("s_id")Integer sId);

    /**
     * 根据考生编号或名字或身份证号加载考生信息
     *
     * @param
     * @return
     */
    Stu getStu(Map map);

    /**
     * 添加考生
     *
     * @param
     * @return
     */
    int insertStu(Stu stu);

    /**
     * 根据考生ID删除考生
     * @param    sId  ID号
     * @return
     */
    int deleteStu(@Param("s_id")Integer sId);

    /**
     * 修改考生信息
     * @param stu
     * @return
     */
    int updateStu(Stu stu);

    /**
     * 修改考生密码
     * @param
     * @return
     */
    int updateStuPassword(Stu stu);
}
