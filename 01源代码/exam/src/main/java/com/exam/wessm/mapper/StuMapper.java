package com.exam.wessm.mapper;

import com.exam.wessm.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * @param sNo
     * @param sPassword
     * @return
     */

    Stu findNoAndPass(@Param("s_no")String sNo, @Param("s_password")String sPassword );

    /**
     * 根据考生ID删除考生
     * @param    sId  ID号
     * @return
     */
    int deleteStu(@Param("s_id")int sId);

    /**
     * 查询考生信息
     * @return
     */
    List<Stu> queryStu();

    /**
     * 根据ID加载考生信息
     *
     * @param    sId
     * @return
     */
    Stu getStu(@Param("s_id")int sId);


    /**
     * 修改考生信息
     * @param stu
     * @return
     */
    int updateStu(Stu stu);
}
