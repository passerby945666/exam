package com.exam.wessm.controller;
import com.exam.wessm.entity.Stu;
import com.exam.wessm.service.IExamService;
import com.exam.wessm.service.IStuService;
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
     * 进入选择考次界面
     *
     * @return
     */
    @RequestMapping(value = "getsign")
    public String getsign(HttpSession session, HttpServletRequest request,int eId) {
        session.setAttribute("eId",eId);
        Stu stu=(Stu) session.getAttribute("stuSession");
        List<Stu> list=stuService.queryStu();
        request.setAttribute("List",list);
        return  "/stu/sign.jsp";
    }
}
