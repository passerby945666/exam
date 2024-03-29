package com.exam.wessm.test;

import com.exam.wessm.entity.Exam;
import com.exam.wessm.service.IExamService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class ExamTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        List<Map> exams = examService.queryExam();
        if (exams != null) {
            for (Map map : exams) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        Map exams = examService.getExamEId(1);
        System.out.println(toString());
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        List<Map> exams = examService.getExamExam("1101");
        if (exams != null) {
            for (Map map: exams) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        Exam exam=new Exam();
        exam.seteNo("13542");
        exam.seteName("11232547869656");
        exam.setTimeBegin(Date.valueOf("2019-11-10"));
        exam.setTimeTest("120");
        exam.setTimeBaomin(Date.valueOf("2019-11-2"));
        exam.setTimeEnd(Date.valueOf("2019-11-20"));
        exam.setmId(1);
        exam.setkId(1);
        int rows=examService.insertExam(exam);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        int rows=examService.deleteExam(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        Exam exam=new Exam();
        exam.seteId(5);
        exam.seteNo("11242");
        exam.seteName("hh");
        exam.setTimeBegin(Date.valueOf("2019-11-18"));
        exam.setTimeTest("100");
        exam.setTimeBaomin(Date.valueOf("2019-11-2"));
        exam.setTimeEnd(Date.valueOf("2019-11-20"));
        int rows=examService.updateExam(exam);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void getTest07() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IExamService examService = (IExamService) context.getBean("examService");
        List<Map> exams = examService.getExamSNo("11");
        if (exams != null) {
            for (Map map: exams) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }
}
