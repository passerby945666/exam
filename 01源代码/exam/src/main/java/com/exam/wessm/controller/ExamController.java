package com.exam.wessm.controller;
;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IExamService;
import com.exam.wessm.service.IManagerService;
import com.exam.wessm.service.IQuebankService;
import com.exam.wessm.service.ISubjectService;
import com.exam.wessm.util.examing.examingROM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * 部门控制器
 */
@Controller
@RequestMapping("exam")
public class ExamController {
    @Autowired
    @Qualifier("examService")
    private IExamService examService;
    @Autowired
    @Qualifier("quebankService")
    private IQuebankService quebankService;
    @Autowired
    @Qualifier("subjectService")
    private ISubjectService subjectService;
    @Autowired
    @Qualifier("managerService")
    private IManagerService managerService;

    /**
     * 查询考试所有信息
     * @return
     */
    @RequestMapping(value = "queryExam")
    public String queryExam(Model model) {
        List<Map> examList = examService.queryExam();
        List<Subject> subjectList=subjectService.querySubject();
        model.addAttribute("kName",subjectList);
        model.addAttribute("examList",examList);
        return "/exam-list.jsp";
    }

    /**
     *进入新增考试界面
     * @param
     * @return
     */
    @RequestMapping(value = "getinsertExam")
    public  String getinsertExam(Model model) {
        List<Subject> listSubject=subjectService.querySubject();
        model.addAttribute("Subject",listSubject);
        return "/exam-add.jsp";
    }


    /**
     *新增考试
     * @param exam
     * @return
     */
    @RequestMapping(value = "insertExam")
    public  String insertExam(Exam exam,String mNo,String timeBaomin,String timeTest,String timeEnd) {
       List<Map>list=examService.getExamExam(mNo);
       List<Manager> list1=managerService.getManager(mNo);
        Manager map=examingROM.eqmNo(mNo,list1);
       if(map==null){
           return "/result.jsp?rows=0";
        }
       exam.setmId(map.getmId());
       int rows =examService.insertExam(exam);

       return "/result.jsp?rows="+rows;
    }


    /**
     * 删除考试信息
     * @param eId
     * @return
     */
    @RequestMapping(value = "deleteExam")
    @ResponseBody
    public int deleteExam(Integer eId) {
        int rows =examService.deleteExam(eId);
        return rows;
    }

    /**
     *到管理员考试信息修改页面
     * @param eId
     * @return
     */
    @RequestMapping(value = "getExamEId")
    public String getExamEId(Integer eId,Model model) {
     Map map=examService.getExamEId(eId);
     List<Subject> list=subjectService.querySubject();
     model.addAttribute("map",map);
     model.addAttribute("eId",eId);
     model.addAttribute("Subject",list);
     return  "/exam-edit.jsp";
    }

    /**
     *修改考试信息
     * @param exam
     * @return
     */
    @RequestMapping(value = "updateExam")
    public  String  updateExam(Exam exam){
        int rows=examService.updateExam(exam);
        return "redirect:/result.jsp?rows="+rows;
    }

    /**
     * 根据关键字加载考试信息
     * @param exam
     * @param model
     * @return
     */
   @RequestMapping(value = "getExamExam")
   public String getExamExam(String exam,Model model,String kId){
       List<Map> examList =examService.getExamExam(exam);
       List<Map> exam1=examService.queryExamKId(kId);
       List<Subject> subjectList=subjectService.querySubject();
       model.addAttribute("kName",subjectList);
       if(exam.equals("")) {
           model.addAttribute("examList", exam1);
       }else {
           model.addAttribute("examList", examList);
       }
       return "/exam-list.jsp";
}

    /**
     *根据考生id查询考生自己的考试信息
     * @param sId
     * @return
     */
    @RequestMapping(value = "getExamSId")
    public  String getExamSId(Integer sId,Model model){
    List<Map> mapList=examService.getExamSId(sId);
    model.addAttribute("mapList",mapList);
    return "/stu/arrange.jsp";
}
}
