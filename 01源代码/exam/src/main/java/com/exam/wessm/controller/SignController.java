package com.exam.wessm.controller;
import com.exam.wessm.entity.Examiners;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IExamService;
import com.exam.wessm.service.IExaminersService;
import com.exam.wessm.service.IStuService;
import com.exam.wessm.util.examing.examingROM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sign")
public class SignController {
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;
    @Autowired
    @Qualifier("examService")
    private IExamService examService;
    @Autowired
    @Qualifier("examinersService")
    private IExaminersService examinersService;
    /**
     * 进入选择考次界面
     *
     * @return
     */
    @RequestMapping(value = "choose")
    public String signchoose(HttpSession session, HttpServletRequest request) {
        Stu stu=(Stu) session.getAttribute("stuSession");
        List<Map> list=examService.getExamBaoming(stu.getsId());
        request.setAttribute("List",list);
        return  "/stu/sign.jsp";
    }

    /**
     * 确认信息
     *
     * @return
     */
    @RequestMapping(value = "getsign")
    public String getsign(HttpSession session, HttpServletRequest request,int eId) {
        session.setAttribute("eId",eId);
        Stu stu=(Stu) session.getAttribute("stuSession");
        Stu list=stuService.getStuSId(stu.getsId());
        Map list1=examService.getExamEId(eId);
        list.setsId(stu.getsId());
        list1.put("eId",eId);
        request.setAttribute("List",list);
        request.setAttribute("exam",list1);
        return  "/stu/signing.jsp";
    }

    /**
     * 提交报名信息
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "signed")
    public String signed(HttpSession session, HttpServletRequest request) {
        int eId=Integer.valueOf(session.getAttribute("eId")+"");
        Stu stu=(Stu) session.getAttribute("stuSession");
        Map list=examService.getExamEId(eId);
        Examiners examiners=new Examiners(0 ,examingROM.addsIdcard(stu.getsNo(),String.valueOf(list.get("eNo"))),stu.getsId(),eId);
       int rows=examinersService.insertExaminers(examiners);
        return  "/stu/result.jsp?rows="+rows;
    }
}
