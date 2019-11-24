package com.exam.wessm.test;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;


public class StuTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        List<Stu> stus=stuService.queryStu();
        if (stus != null) {
            for (Stu stu : stus) {
                System.out.println(stu.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=stuService.getStuSId(1);
        System.out.println(stu.toString());
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");

        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=new Stu();
        stu.setsNo("s0077");
        stu.setsPassword("12345");
        stu.setsName("说得好");
        stu.setsIdcard("123456743245678907");
        stu.setsSex(1);
        stu.setsBirthday(Date.valueOf("2010-02-11"));
        int rows=stuService.insertStu(stu);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        int rows=stuService.deleteStu(6);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=new Stu();
        stu.setsId(1);
        stu.setsNo("11");
        stu.setsName("说得好");
        stu.setsIdcard("123456743245678907");
        stu.setsSex(1);
        stu.setsBirthday(Date.valueOf("2010-02-11"));
        int rows=stuService.updateStu(stu);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateManagerPasswordTest07() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=new Stu();
        stu.setsId(1);
        stu.setsPassword("12345");
        int rows=stuService.updateStuPassword(stu);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void registerTest08() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=new Stu();
        stu.setsNo("10088");
        stu.setsPassword("123456");
        int rows=stuService.registerStu(stu);
        System.out.println(rows);
    }
    @Test
    public void findNoAndPassTest09() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStuService stuService = (IStuService) context.getBean("stuService");
        Stu stu=stuService.findNoAndPass("10088","123456");
        System.out.println(stu.toString());
    }
}
