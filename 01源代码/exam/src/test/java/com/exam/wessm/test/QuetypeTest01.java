package com.exam.wessm.test;

import com.exam.wessm.entity.Quetype;
import com.exam.wessm.service.IQuetypeService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class QuetypeTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        List<Quetype> quetypes =quetypeService.queryQuetype();
        if (quetypes != null) {
            for (Quetype quetype : quetypes) {
                System.out.println(quetype.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        Quetype quetype=quetypeService.getQuetypeQId(1);
        System.out.println(quetype.toString());
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        Quetype quetype=quetypeService.getQuetypeQType("1");
        System.out.println(quetype.toString());
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        Quetype quetype=new Quetype();
        quetype.setqType(1);
        quetype.setqValue("4");
        int rows=quetypeService.insertQuetype(quetype);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        int rows=quetypeService.deleteQuetype(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuetypeService quetypeService= (IQuetypeService) context.getBean("quetypeService");
        Quetype quetype=new Quetype();
        quetype.setqId(1);
        quetype.setqType(1);
        quetype.setqValue("4");
        int rows=quetypeService.insertQuetype(quetype);
        System.out.println(rows);
        context.close();
    }
}
