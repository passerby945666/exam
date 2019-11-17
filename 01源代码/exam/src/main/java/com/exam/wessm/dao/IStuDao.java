package com.exam.wessm.dao;


import com.exam.wessm.entity.Stu;

import java.util.List;
/**
 *   考生Dao接口
 *
 */
public interface IStuDao {
    /**
     * 查询考生信息
     * @return
     */
    List<Stu> queryStu();

    /**
     * 根据ID加载考生信息
     *
     * @param    sId  ID号
     * @return
     */
    Stu getStu(int sId);

    /**
     * 添加考生
     *
     * @param stu
     * @return
     */
    int insertStu(Stu stu);

    /**
     * 根据考生ID删除考生
     * @param    sId  ID号
     * @return
     */
    int deleteStu(int sId);

    /**
     * 修改考生信息
     * @param stu
     * @return
     */
    int updateStu(Stu stu);
}
