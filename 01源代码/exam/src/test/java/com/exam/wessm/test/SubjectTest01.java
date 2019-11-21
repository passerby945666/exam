package com.exam.wessm.test;


import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.ISubjectService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SubjectTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        List<Subject> subjects = subjectService.querySubject();
        if (subjects != null) {
            for (Subject subject : subjects) {
                System.out.println(subject.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        Subject subject=subjectService.getSubjectKId(1);
        System.out.println(subject.toString());
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        Subject subject=subjectService.getSubject("1");
        System.out.println(subject.toString());
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        Subject subject=new Subject();
        subject.setkNo("11");
        subject.setkName("上课");
        int rows=subjectService.insertSubject(subject);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        int rows=subjectService.deleteSubject(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISubjectService subjectService = (ISubjectService) context.getBean("subjectService");
        Subject subject=new Subject();
        subject.setkId(1);
        subject.setkNo("12");
        subject.setkName("上课");
        int rows=subjectService.updateSubject(subject);
        System.out.println(rows);
        context.close();
    }
}
