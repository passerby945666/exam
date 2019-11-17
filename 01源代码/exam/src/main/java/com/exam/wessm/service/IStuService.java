package com.exam.wessm.service;

import com.exam.wessm.entity.Stu;

import java.util.List;

/**
 * 考生服务类接口
 */
public interface IStuService {
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

   Stu findNoAndPass(String sNo,String sPassword );

    /**
     * 根据考生ID删除考生
     * @param    sId  ID号
     * @return
     */
    int deleteStu(int sId);

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
    Stu getStu(int sId);


    /**
     * 修改考生信息
     * @param stu
     * @return
     */
    int updateStu(Stu stu);
}
