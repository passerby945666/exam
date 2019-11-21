package com.exam.wessm.controller;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 考生控制器类
 */

import javax.servlet.http.HttpSession;

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
    @RequestMapping(value = "register")
    public String register(Stu stu, String Cpassword) {

        if (Cpassword.equals(stu.getsPassword())){
        int rows = stuService.registerStu(stu);
        return "/login.jsp";
        }
        else {
            return  "/404.jsp";
        }
    }

    @RequestMapping(value = "login",method = RequestMethod.POST )
    public String login(Integer type,String sNo, String sPassword  , HttpSession session) {
           if (type==1){
             Stu stu=stuService.findNoAndPass(sNo,sPassword);
             if(stu!=null){
                  session.setAttribute("stu_session",stu);
                  return  "/stu/indexStu.jsp";
             }
           }
           else{
            return "/index.jsp";
           }
           return  "/404.jsp";
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向
        return "redirect:/login.jsp";
    }
}
