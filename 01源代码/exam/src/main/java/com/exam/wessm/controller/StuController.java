package com.exam.wessm.controller;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 考生控制器类
 */

import javax.servlet.http.HttpSession;
import java.util.List;

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
            stuService.registerStu(stu);
            return "/login.jsp";
        }
        else {
            return  "/404.jsp";
        }
    }

    /**
     * 登录
     * @param type
     * @param sNo
     * @param sPassword
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST )
    public String login(Integer type, String sNo, String sPassword  , HttpSession session, Model model) {
           if (type==1){
             Stu stu1=stuService.findNoAndPass(sNo,sPassword);
             if(stu1!=null){
                  session.setAttribute("stuSession",stu1);
                  model.addAttribute("stu",stu1);
                  return  "/stu/indexStu";
             }
           }
           else{
            return "/index";
           }
           return  "/404";
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
        return "redirect:/login";
    }

    /**
     * 查询考生的所有信息
     * @param model
     * @return
     */
    @RequestMapping(value = "queryStu")
    public  String queryStu(Model model){
        List<Stu> stuList=stuService.queryStu();
        model.addAttribute("stuList",stuList);
        return "/member-list";
    }

    /**
     *管理员删除考生信息
     * @param sId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteStu")
    public  int deleteStu(Integer sId){
        int rows=stuService.deleteStu(sId);
        return rows;
    }

    /**
     * 管理员添加考生信息
     * @param stu
     * @return
     */
    @RequestMapping(value = "insertStu",method = RequestMethod.POST)
    public int insertStu(Stu stu){
        int rows=stuService.insertStu(stu);
        return  rows;
    }

    /**
     * 到管理员考生信息修改页面
     * @param sId
     * @param model
     * @return
     */
    @RequestMapping(value ="getStuSId" )
    public  String getStuSId(Integer sId,Model model){
        Stu stu=stuService.getStuSId(sId);
        model.addAttribute("stu",stu);
        return "/member-edit";
    }

    /**
     * 考生信息修改
     * @param stu
     * @return
     */
    @RequestMapping(value = "updateStu")
    public int updateStu(Stu stu){
        int rows=stuService.updateStu(stu);
        return  rows;
    }

    /**
     * 根据考生编号或名字或身份证号加载考生信息
     * @param stu
     * @return
     */
    @RequestMapping(value ="getStu" )
    public  String  getStu(String stu,Model model){
        Stu stuList=stuService.getStu(stu);
        model.addAttribute("stuList",stuList);
        return  "/member-list";
    }

    /**
     *考生密码修改
     * @param stu
     * @return
     */
    @RequestMapping(value = "updateStuPassword",method = RequestMethod.POST)
    public int  updateStuPassword(Stu stu,String csPassword, Model model){
        if (csPassword.equals(stu.getsPassword())){
            int rows  =stuService.updateStuPassword(stu);
            return rows;
        }
        else{
            model.addAttribute("msg","密码不一致");
        }
        return 1111;
    }
}
