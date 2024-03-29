package com.exam.wessm.controller;
;
import com.exam.wessm.entity.*;
import com.exam.wessm.service.*;
import com.exam.wessm.util.examing.examingROM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 考试模块控制器
 */
@Controller
@RequestMapping("examing")
public class ExamingController {
    @Autowired
    @Qualifier("examService")
    private IExamService examService;
    @Autowired
    @Qualifier("examinersService")
    private IExaminersService examinersService;
    @Autowired
    @Qualifier("quebankService")
    private IQuebankService quebankService;
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;
    @Autowired
    @Qualifier("hquestionService")
    private IHquestionService hquestionService;
    @Autowired
    @Qualifier("gradesService")
    private IGradesService gradesService;
    @Autowired
    @Qualifier("subjectService")
    private ISubjectService subjectService;
    /**
     * 进入界面，选择考次
     * @return
     */
    @RequestMapping(value = "choose")
    public String chooseExam(HttpSession session, HttpServletRequest request) {
        Stu stu=(Stu)session.getAttribute("stuSession");
        String str=String.valueOf(stu.getsNo());
        List<Map> list=new ArrayList<>();
        List<Map> list1=examService.getExamSNo(str);
        java.util.Date date=null;
        for(Map map:list1){
            String string=String.valueOf(map.get("timeBegin"));
            int timeint=((Integer.parseInt(""+map.get("timeTest"))))*60*1000;
            try {
                date=new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse(string.substring(0,string.length()-2));
            }catch (Exception e){
                e.printStackTrace();
            }
            if((date.getTime()+timeint)> new Date().getTime()){
                list.add(map);
            }
        }
        request.setAttribute("List",list);
        return "/stu/examing.jsp";
    }
    /**
     * 加载考试题
     * @return
     */
    @RequestMapping(value = "examing")
    public String Examing(HttpSession session, HttpServletRequest request,int eId) {
        Map map=examService.getExamEId(eId);
        int kid=(int)map.get("kId");
        int[] arr=examingROM.examun();
        List<Map> list;
        List<Map> listAll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list=quebankService.getQuebankKId(kid,(i+1)+"");
            List<Integer> list1= examingROM.rondom(list.size(),arr[i]);
            for(int ints:list1){
                listAll.add(list.get(ints));
            }
        }
        for(int i=0;i<listAll.size();i++){
            listAll.get(i).put("No",i+1);
        }
        request.setAttribute("scr","/examing/examed");
        session.setAttribute("Exam",listAll);
        request.setAttribute("List",listAll);
        request.setAttribute("thisI",eId);
        request.setAttribute("time",map.get("timeTest"));
        return "/stu/examing2.jsp";
    }
    /**
     * 提交考试题
     * @return
     */
    @RequestMapping(value = "examed")
    public String Examed(HttpSession session, HttpServletRequest request,int eId) {
        List<Map> list=(List<Map>) session.getAttribute("Exam");
        session.removeAttribute("Exam");
        List<String> hAnswerlist=new ArrayList<>();
        String []arr;
        String s="";
        for(int i=0;i<list.size();i++){
            if(String.valueOf(list.get(i).get("qType")).equals("2")){
                arr=request.getParameterValues("hAnswer"+(i+1));
                if(arr!=null){
                    for(int j=0;j<arr.length;j++){
                        s+=arr[j];
                    }
                }
                hAnswerlist.add(s);
                s="";
            }else {
                hAnswerlist.add(request.getParameter("hAnswer"+(i+1)));
            }
        }
        Stu stu=(Stu) session.getAttribute("stuSession");
        String qValue="";
        Integer status=1;
        Integer tId;
        Hquestion hquestion;
        int grade=0;
        for(int i=0;i<list.size();i++){

            if(String.valueOf(list.get(i).get("qType")).equals("4")){
                qValue="0";
                status=1;
            }else {
                if(list.get(i).get("answer").equals(hAnswerlist.get(i))){
                    qValue=String.valueOf(list.get(i).get("qValue"));
                    grade+=Integer.valueOf(qValue);
                }else {
                    qValue="0";
                }
                status=2;
            }
            tId=Integer.valueOf(String.valueOf(list.get(i).get("tId")));
            hquestion=new Hquestion(0,String.valueOf(i+1),stu.getsId(),eId,tId,status,qValue,hAnswerlist.get(i));
            hquestionService.insertHquestion(hquestion);
        }
        Grades grades=new Grades(0,stu.getsId(),eId,String.valueOf(grade));
        gradesService.insertGrade(grades);
        session.removeAttribute("Exam");
        return "/stu/examed.jsp";
    }

    /**
     * 进入选择科目界面
     * @return
     */
    @RequestMapping(value = "simulationbef")
    public String SimulationBef(HttpSession session, HttpServletRequest request) {
        List<Subject> list=subjectService.querySubject();
        request.setAttribute("List",list);
        return "/stu/simulation.jsp";
    }





    /**
     * 进入模拟考
     * @return
     */
    @RequestMapping(value = "simulation")
    public String Simulation(HttpSession session, HttpServletRequest request,int kId) {

        int[] arr=examingROM.examun();
        List<Map> list;
        List<Map> listAll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list=quebankService.getQuebankKId(kId,(i+1)+"");
            List<Integer> list1= examingROM.rondom(list.size(),arr[i]);
            for(int ints:list1){
                listAll.add(list.get(ints));
            }
        }
        for(int i=0;i<listAll.size();i++){
            listAll.get(i).put("No",i+1);
        }
        request.setAttribute("scr","/examing/simulationed");
        session.setAttribute("Exam",listAll);
        request.setAttribute("List",listAll);
        request.setAttribute("kId",kId);
        return "/stu/examing2.jsp";
    }

    /**
     * 提交模拟考试题
     * @return
     */
    @RequestMapping(value = "simulationed")
    public String Simulationed(HttpSession session, HttpServletRequest request) {
        List<Map> list=(List<Map>) session.getAttribute("Exam");
        session.removeAttribute("Exam");
        List<String> hAnswerlist=new ArrayList<>();
        String []arr;
        String s="";
        for(int i=0;i<list.size();i++){
            if(String.valueOf(list.get(i).get("qType")).equals("2")){
                arr=request.getParameterValues("hAnswer"+(i+1));
                if(arr!=null){
                    for(int j=0;j<arr.length;j++){
                        s+=arr[j];
                    }
                }
                hAnswerlist.add(s);
                s="";
            }else {
                hAnswerlist.add(request.getParameter("hAnswer"+(i+1)));
            }
        }
        String qValue;
        int grade=0;
        for(int i=0;i<list.size();i++){
            if(String.valueOf(list.get(i).get("qType")).equals("4")){

            }else {
                if(list.get(i).get("answer").equals(hAnswerlist.get(i))){
                    qValue=String.valueOf(list.get(i).get("qValue"));
                    grade+=Integer.valueOf(qValue);
                }
            }
            list.get(i).put("hAnswer",hAnswerlist.get(i));
        }
        request.setAttribute("List",list);
        request.setAttribute("grade",grade);
        session.removeAttribute("Exam");
        return "/stu/simulationed.jsp";
    }







}
