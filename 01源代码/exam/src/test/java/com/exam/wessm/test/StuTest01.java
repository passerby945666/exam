package com.exam.wessm.test;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StuTest01 {
    @Test
    public void insertTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=new Stu();
        stu.setsNo("10086");
        stu.setsPassword("123456");
        int rows=stuService.registerStu(stu);
        System.out.println(rows);
//        List<Emp> emps = empService.queryEmp();
//        if (emps != null) {
//            for (Emp emp : emps) {
//                System.out.println(emp);
//            }
//        }
//        context.close();
    }
    @Test
    public void testQueryEmp() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=stuService.findNoAndPass("10086","123456");
        System.out.println(stu.toString());
//        List<Emp> emps = empService.queryEmp();
//        if (emps != null) {
//            for (Emp emp : emps) {
//                System.out.println(emp);
//            }
//        }
//        context.close();

    }
}
