package com.exam.wessm.test;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.service.IExamService;
import com.exam.wessm.service.IExaminersService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class ExaminersTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        List<Map> examiners = examinersService.queryExaminers();
        if (examiners != null) {
            for (Map map : examiners) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        List<Map> examiners = examinersService.getExaminersExId(1);
        if (examiners != null) {
            for (Map map : examiners) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }


    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        List<Map> examiners = examinersService.getExaminers("语文");
        if (examiners != null) {
            for (Map map : examiners) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        Examiners examiners=new Examiners();
        examiners.setExId(1);
        examiners.seteId(1);
        examiners.setsId(1);
        examiners.setExamCard("123456789012345");
        int rows=examinersService.insertExaminers(examiners);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        int rows=examinersService.deleteExaminers(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExaminersService examinersService = (IExaminersService) context.getBean("examinersService");
        Examiners examiners=new Examiners();
        examiners.setExId(1);
        examiners.setExamCard("123456789012345");
        int rows=examinersService.updateExaminers(examiners);
        System.out.println(rows);
        context.close();
    }
}
