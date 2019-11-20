package com.exam.wessm.test;

import com.exam.wessm.entity.Grades;
import com.exam.wessm.service.IGradesService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class GradeTest01 {
    @Test
    public void queryGradesTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        List<Map> list = gradesService.queryGrades();
        if (list != null) {
            for (Map map : list) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }

    @Test
    public void getGradekFindTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        List<Map> list = gradesService.getGradekFind("小");
        if (list != null) {
            for (Map map : list) {
                System.out.println(map.toString());
            }
        }
        context.close();
    }

    @Test
    public void getGradekChooseTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        List<Map> list = gradesService.getGradekChoose("1", Date.valueOf("1997-03-12"),Date.valueOf("2020-03-12"));
        if (list != null) {
            for (Map map : list) {
                System.out.println(map.get("eNo"));
            }
        }
        context.close();
    }
    @Test
    public void getGradeExamCardTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        Grades grades = gradesService.getGradeExamCard("1101s001");
                System.out.println(grades);
        context.close();
    }

    @Test
    public void getGradegIdTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        Grades grades = gradesService.getGradegId(1);

                System.out.println(grades.toString());

        context.close();
    }

    @Test
    public void insertGradeTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        Grades grades=new Grades(0,2,3,"90");
        int rows = gradesService.insertGrade(grades);

        System.out.println(rows);
        context.close();
    }

    @Test
    public void updateGradeTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        Grades grades=new Grades();
        grades.setGrade("100");
        grades.seteId(1);
        grades.setsId(1);
        int rows = gradesService.updateGrade(grades);

        System.out.println(rows);
        context.close();
    }

    @Test
    public void deleteGradeTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGradesService gradesService = (IGradesService) context.getBean("gradesService");
        Grades grades=new Grades();
        grades.setGrade("100");
        grades.seteId(1);
        grades.setsId(1);
        int rows = gradesService.deleteGrade(6);

        System.out.println(rows);
        context.close();
    }

}
