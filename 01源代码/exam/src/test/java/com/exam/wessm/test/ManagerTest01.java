package com.exam.wessm.test;


import com.exam.wessm.entity.Manager;
import com.exam.wessm.service.IManagerService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;


public class ManagerTest01 {
    @Test
    public void queryTest01() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        List<Manager> managers = managerService.queryManager();
        if (managers != null) {
            for (Manager manager : managers) {
                System.out.println(manager.toString());
            }
        }
        context.close();
    }
    @Test
    public void getTest02() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager managers = managerService.getManagerMId(1);
        System.out.println(managers.toString());
        context.close();
    }
    @Test
    public void getTest03() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        List<Manager> managers = managerService.getManager("234");
        if (managers != null) {
            for (Manager manager : managers) {
                System.out.println(manager.toString());
            }
        }
        context.close();
    }
    @Test
    public void insertTest04() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager manager=new Manager();
        manager.setmNo("1111");
        manager.setmPassword("12345");
        manager.setmName("说得好");
        manager.setmIdcard("123456743245678907");
        manager.setmSex(1);
        manager.setmBirthday(Date.valueOf("2010-02-11"));
        int rows=managerService.insertManager(manager);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void deleteTest05() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        int rows=managerService.deleteManager(1);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateTest06() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager manager=new Manager();
        manager.setmId(1);
        manager.setmNo("111");
        manager.setmName("说得好");
        manager.setmIdcard("123456743245678007");
        manager.setmSex(2);
        manager.setmBirthday(Date.valueOf("2010-02-11"));
        int rows=managerService.updateManager(manager);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void updateManagerPasswordTest07() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager manager=new Manager();
        manager.setmId(5);
        manager.setmPassword("12345");
        int rows=managerService.updateManagerPassword(manager);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void registerTest08() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager manager=new Manager();
        manager.setmNo("11");
        manager.setmPassword("12345");
        int rows=managerService.registerManager(manager);
        System.out.println(rows);
        context.close();
    }
    @Test
    public void findManagerNoAndPassTest09() {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IManagerService managerService = (IManagerService) context.getBean("managerService");
        Manager managers = managerService.findManagerNoAndPass("11","12345");
        System.out.println(managers.toString());
        context.close();
    }
}
