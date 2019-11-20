package com.exam.wessm.test;

import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.service.IHquestionService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class HquestionTest01 {
    @Test
    public void insertTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");
        Hquestion hquestion=new Hquestion(0,"12345",1,1,1,1,""+5,"不会写");

        int rows=hquestionService.insertHquestion(hquestion);

        System.out.println(rows);
//        List<Emp> emps = empService.queryEmp();
//        if (emps != null) {
//            for (Emp emp : emps) {
//                System.out.println(emp);
//            }
//        }
        context.close();
    }
    @Test
    public void queryAllTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");

        List<Hquestion> list=hquestionService.queryHquestionAll();

        if (list!= null) {
            for (Hquestion hquestion1 :list) {
               System.out.println(hquestion1.toString());
           }
       }
       context.close();
    }
    @Test
    public void queryTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");

        List<Map> list=hquestionService.queryHquestion("1223","12345","1");

        if (list!= null) {
            for (Map hquestion1 :list) {
                System.out.println(hquestion1.toString());
            }
        }
        context.close();
    }
    @Test
    public void updateTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");
        Hquestion hquestion=new Hquestion();
        hquestion.seteId(1);
        hquestion.setsId(1);
        hquestion.sethNo("2");
        hquestion.sethGrade("9");
        int rows=hquestionService.updateHquestion(hquestion);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void getTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");

        Hquestion hquestion=hquestionService.getHquestion(5);

        System.out.println(hquestion.toString());

        context.close();
    }
    @Test
    public void deleteTest() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IHquestionService hquestionService = (IHquestionService) context.getBean("hquestionService");
        Hquestion hquestion=new Hquestion();
        hquestion.seteId(1);
        hquestion.setsId(1);
        hquestion.sethNo("2");
        hquestion.sethGrade("9");
        int rows=hquestionService.deleteHquestion(5);
        System.out.println(rows);
        context.close();
    }


}
