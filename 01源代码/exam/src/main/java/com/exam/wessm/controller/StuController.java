package com.exam.wessm.controller;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("stu")
public class StuController {
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;

    /**
     * 注册账号
     *
     * @param stu
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(Stu stu) {
        int rows = stuService.registerStu(stu);
        return "?rows="+rows;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String login(String sNo,String sPassword) {
        Stu stu=null;
        stu = stuService.findNoAndPass(sNo,sPassword);
        if(stu!=null){
            return " ";     //登录成功
        }else {
            return "";      //登陆失败
        }

    }
}
