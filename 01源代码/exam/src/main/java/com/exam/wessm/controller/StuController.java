package com.exam.wessm.controller;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IManagerService;
import com.exam.wessm.service.IStuService;
import com.exam.wessm.util.examing.examingROM;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StuController {
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;
    @Autowired
    @Qualifier("managerService")
    private IManagerService managerService;


    /**
     * 注册账号
     *
     * @param stu
     * @return
     */
    @RequestMapping(value = "register")
    public String register(Stu stu, String Cpassword,Model model) {
        if (Cpassword.equals(stu.getsPassword())){
            int rows=stuService.registerStu(stu);
            if(rows==1){
                return "redirect:/login.jsp";
            }else {
                model.addAttribute("msg", "用户已存在");
                return  "redirect:/register.jsp";
            }
        }
        else {
            model.addAttribute("msg", "密码不一致");
            return  "redirect:/register.jsp";
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
                  return  "/stu/indexStu.jsp";
             }
           }
           else if(type==2){
               Manager manager=managerService.findManagerNoAndPass(sNo,sPassword);
               if(manager!=null){
                   session.setAttribute("managerSession",manager);
                   model.addAttribute("stu",manager);
                   return "/index.jsp";
               }
           }
          model.addAttribute("msg","账号密码错误");
           return  "redirect:/login.jsp";
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

    /**
     * 查询考生的所有信息
     * @param model
     * @return
     */
    @RequestMapping(value = "queryStu")
    public  String queryStu(Model model){
        List<Stu> stuList=stuService.queryStu();
        model.addAttribute("stuList",stuList);
        return "/member-list.jsp";
    }

    /**
     *管理员删除考生信息
     * @param sId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteStu")
    public  int deleteStu(Integer sId){
        int rows=stuService.deleteStuAll(sId);
        return rows;
    }

    /**
     * 管理员添加考生信息
     * @param stu
     * @return
     */
    @RequestMapping(value = "insertStu",method = RequestMethod.POST)
    public String insertStu(Stu stu,Model model){
        if(stu.getsBirthday()==null){
            model.addAttribute("smg","时间不可为空");
            return "redirect:/result.jsp?rows=0";
        }
        int rows=stuService.insertStu(stu);
        return "redirect:/result.jsp?rows="+rows;
    }

    /**
     * 到考生个人信息页面
     * @param model
     * @return
     */
    @RequestMapping(value ="getStuSId" )
    public  String getStuSId(Model model, HttpSession session){
        Stu stu1=(Stu) session.getAttribute("stuSession");
        Stu stu=stuService.getStuSId(stu1.getsId());
        stu.setsId(stu1.getsId());
        model.addAttribute("stu",stu);
        model.addAttribute("sId",stu1.getsId());
        if(stu.getsBirthday()==null){
            return "/stu/upstudent.jsp";
        }
        model.addAttribute("date",examingROM.DateToString(stu.getsBirthday()));

        return "/stu/stumassage.jsp";
    }


    /**
     * 考生自己跳到信息修改页面
     * @param
     * @param model
     * @return
     */
    @RequestMapping(value ="getStumy" )
    public  String getStumy(Model model,HttpSession session){
        Stu stu1=(Stu)session.getAttribute("stuSession");
        Integer sId=stu1.getsId();
        Stu stu=stuService.getStuSId(sId);
        stu.setsId(sId);
        model.addAttribute("date",examingROM.DateToString(stu.getsBirthday()));
        model.addAttribute("stu",stu);
        model.addAttribute("sId",sId);
        return "/stu/upstudent.jsp";
    }

    /**
     * 管理员到考生信息修改页面
     * @param sId
     * @param model
     * @return
     */
    @RequestMapping(value ="getStudent" )
    public  String getStudent(Integer sId,Model model){
        Stu stu=stuService.getStuSId(sId);
        stu.setsId(sId);
        model.addAttribute("date",examingROM.DateToString(stu.getsBirthday()));
        model.addAttribute("stu",stu);
        model.addAttribute("sId",sId);
        return "/member-edit.jsp";
    }
    /**
     * 管理员考生信息修改
     * @param stu
     * @return
     */
    @RequestMapping(value = "updateStu")
    public String updateStu(Stu stu,Model model,String date){
        int rows=-1;
        if(stu.getsBirthday()==null&&date!=null){
            java.util.Date date1=examingROM.StringToDate(date);
            if(date1!=null){
                stu.setsBirthday(date1);
                rows=stuService.updateStuM(stu);
            }else {
                rows=0;
                model.addAttribute("smg","日期格式输入有误,例：1970-01-01");
            }

        }else if(stu.getsBirthday()!=null){
            rows=stuService.updateStuM(stu);
        }else {
            model.addAttribute("smg","原日期与输入日期都为空");
        }
        return "redirect:/result.jsp?rows="+rows;
    }


    /**
     * 考生修改自己的信息
     * @param stu
     * @return
     */
    @RequestMapping(value = "updateStuM")
    public String updateStuM(Stu stu,String date,Model model){
        int rows=-1;
        if(stu.getsBirthday()==null&&date!=null){
            java.util.Date date1=examingROM.StringToDate(date);
            if(date1!=null){
                stu.setsBirthday(date1);
                rows=stuService.updateStuM(stu);
            }else {
                rows=0;
                model.addAttribute("smg","日期格式输入有误,例：1970-01-01");
            }

        }else if(stu.getsBirthday()!=null){
            rows=stuService.updateStuM(stu);
        }else {
            model.addAttribute("smg","原日期与输入日期都为空");
        }
        return "redirect:/result.jsp?rows="+rows;
    }



    /**
     * 根据考生编号或名字或身份证号加载考生信息
     * @param stu
     * @return
     */
    @RequestMapping(value ="getStu" )
    public  String  getStu(String stu,Model model){
        List<Stu> stuList =stuService.getStu(stu);
        model.addAttribute("stuList",stuList);
        model.addAttribute("sId",stu);
        return  "/member-list.jsp";
    }

    /**
     *考生密码修改
     * @param stu
     * @return
     */
    @RequestMapping(value = "updateStuPassword",method = RequestMethod.POST)
    public String  updateStuPassword(Stu stu,String csPassword, Model model,HttpSession session){
        Stu stu1=(Stu)session.getAttribute("stuSession");
        if (csPassword.equals(stu.getsPassword())){
            stu.setsId(stu1.getsId());
            int rows  =stuService.updateStuPassword(stu);
            return "/stu/result.jsp?rows="+rows;
        }
        else{
            model.addAttribute("smg","密码不一致");
            return "/stu/uppassword.jsp";
        }
    }

    /**
     * 考生忘记密码之验证是否是本人
     * @param sNo
     * @param sIdcard 身份证号码
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "forgetStuPassword",method = RequestMethod.POST)
    public String  forgetStuPassword(String sNo, String  sIdcard, HttpSession session, HttpServletRequest request){
        List<Stu> stus=stuService.getStu(sIdcard);
        if(stus.size()!=0){
            int rows=examingROM.eqNosIdcard(sNo,sIdcard,stus);
            if(rows==1){
                session.setAttribute("forget",sNo);
                return "/resetBySms2.jsp";
            }
        }
        request.setAttribute("smg","信息不匹配");
             return "/resetBySms.jsp";
    }

    /**
     * 考生忘记密码之修改密码
     * @param stu
     * @param csPassword
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "forgetStuPassword2",method = RequestMethod.POST)
    public String  forgetStuPassword2(Stu stu,String csPassword, Model model,HttpSession session) {
        String sNo = String.valueOf(session.getAttribute("forget"));
        List<Stu>  stus=stuService.getStu(sNo);
        if(stus.size()!=0){
            int row=examingROM.eqNo(sNo,stus);
            if(row==1&&csPassword.equals(stu.getsPassword())){
                stu.setsId(stus.get(0).getsId());
                int rows = stuService.updateStuPassword(stu);
                if(row==1){
                    return "/resetBySms3.jsp?rows=" + rows;
                }else {
                    model.addAttribute("smg", "修改发生异常");
                    return "/resetBySms2.jsp";
                }
            } else {
                model.addAttribute("smg", "两次密码不一致");
                return "/resetBySms2.jsp";
            }
        }
        model.addAttribute("smg", "非法操作");
        return "/resetBySms2.jsp";
    }
}
