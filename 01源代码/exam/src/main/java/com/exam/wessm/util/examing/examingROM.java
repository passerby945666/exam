package com.exam.wessm.util.examing;

import java.util.ArrayList;
import java.util.List;

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
}
