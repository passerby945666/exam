package com.exam.wessm.controller;
import com.exam.wessm.entity.Hquestion;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.service.IHquestionService;
import com.exam.wessm.util.examing.examingROM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 改卷控制器类
 */
@Controller
@RequestMapping("correct")
public class CorrectController {


        @Autowired
        @Qualifier("hquestionService")
        private IHquestionService hquestionService;

        /**
         * 考试选择界面
         *
         * @return
         */
        @RequestMapping(value = "choose")
                public String chooseCorrect(HttpSession session, HttpServletRequest request) {
                      Manager  manager=(Manager)session.getAttribute("managerSession");
                List<Map> list=hquestionService.queryHquestionMNo(manager.getmNo());
                request.setAttribute("List",list);
                        return "/read-correct.jsp";
                }



        /**
         * 加载需要批改的试题
         *
         * @return
         */
        @RequestMapping(value = "correcting")
        public String Correcting(HttpSession session, HttpServletRequest request,String eNo) {
                Manager  manager=(Manager)session.getAttribute("managerSession");
                List<Map> list=hquestionService.queryHquestion(manager.getmNo(),eNo,"1");
                list= examingROM.setno(list);
                request.setAttribute("List",list);
                request.setAttribute("eName",list.get(0).get("eName"));
                session.setAttribute("un",list.size());
                return "/read-correcting.jsp";
        }

        /**
         * 批改题目
         *
         * @return
         */
        @RequestMapping(value = "corrected")
        public String Corrected(HttpSession session, HttpServletRequest request) {
                List<Hquestion> list=new ArrayList<>();
                int rows;
                for(int i=0;i<Integer.valueOf(""+session.getAttribute("un"));i++){
                        Hquestion hquestion =new Hquestion();
                        hquestion.sethGrade(request.getParameter("hGrade"+i));
                        hquestion.sethId(Integer.valueOf(request.getParameter("hId"+i)));
                        list.add(hquestion);
                }
                rows=hquestionService.updateHquestions(list);
                if(rows==1){
                        return "/read-corrected.jsp";
                }else {
                        return "/404.jsp";
                }


        }
}








