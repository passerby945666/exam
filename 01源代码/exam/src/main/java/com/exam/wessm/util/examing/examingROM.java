package com.exam.wessm.util.examing;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 考试工具类
 */
public  class  examingROM {

    /**随机抽题
     *
     * @param uno    题库题目数量
     * @param uno1   试卷题目数量
     */
    public static List rondom(int uno, int uno1) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j <uno1; j++) {
            int t = (int) (Math.random() * uno);
            int k = 0;
            while (list.size()!=0) {
                if (k > list.size()-1) {
                    break;
                }
                if (list.get(k) == t) {
                    t = (int) (Math.random() * uno);
                    k = 0;
                }else {
                    k++;
                }
            }
            list.add(t);
        }
        return list;
    }

    /**
     * 给题目打印编号
     * @param list
     * @return
     */
    public static List setno(List<Map> list){
        for(int i=0;i<list.size();i++){
            list.get(i).put("No",i);
        }
        return list;
    }

    public static String addsIdcard(String sNo,String eName){
        return eName+sNo;
    }

    /**    核对身份证号跟账号
     *
     * @param sNo
     * @param sIdcard
     * @param stus
     * @return
     */
    public static int eqNosIdcard(String sNo, String sIdcard, List<Stu> stus){
        int rows=0;
        for(Stu stu:stus){
            if(stu.getsIdcard().equals(sIdcard)&&stu.getsNo().equals(sNo)){
                rows=1;
                break;
            }
        }
        return rows;
    }
    /**    核对身份证号跟账号
     *
     * @param sNo

     * @param stus
     * @return
     */
    public static int eqNo(String sNo, List<Stu> stus){
        int rows=0;
        for(Stu stu:stus){
            if(stu.getsNo().equals(sNo)){
                rows=1;
                break;
            }
        }
        return rows;
    }
    /**    核对管理员
     *

     * @return
     */
    public static Manager eqmNo(String mNo, List<Manager> managers){
        for(Manager manager:managers){
            if(manager.getmNo().equals(mNo)){
                return manager;
            }
        }
        return null;
    }


}
