package com.exam.wessm.test;


import com.exam.wessm.entity.Quebank;
import com.exam.wessm.service.IQuebankService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class QuebankTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        List<Map> quebank= quebankService.queryQuebank();
        if (quebank != null) {
            for (Map map : quebank) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        List<Map> quebank= quebankService.getQuebanTId(1);
        if (quebank != null) {
            for (Map map : quebank) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        List<Map> quebank= quebankService.getQuebank("11");
        if (quebank != null) {
            for (Map map : quebank) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        Quebank quebank=new Quebank();
        quebank.settId(1);
        quebank.settNo("1");
        quebank.setqId(1);
        quebank.setAnswer("1");
        quebank.setReply("203");
        quebank.settTime(Date.valueOf("2017-01-10"));
        quebank.setkId(1);
        quebank.setmId(1);
        int rows=quebankService.insertQuebank(quebank);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        int rows=quebankService.deleteQuebank(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IQuebankService quebankService = (IQuebankService) context.getBean("quebankService");
        Quebank quebank=new Quebank();
        quebank.settId(1);
        quebank.settNo("1");
        quebank.setAnswer("1");
        quebank.setReply("203");
        quebank.settTime(Date.valueOf("2017-01-10"));
        int rows=quebankService.updateQuebank(quebank);
        System.out.println(rows);
        context.close();
    }
}
