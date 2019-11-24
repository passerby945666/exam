package com.exam.wessm.controller;
;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.service.IExamService;
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

    /**
     * 查询考试所有信息
     * @return
     */
    @RequestMapping(value = "queryExam")
    public String queryExam(Model model) {
        List<Map> examList = examService.queryExam();
        model.addAttribute("examList",examList);
        return "/exam-list.jsp";
    }

    /**
     *新增考试
     * @param exam
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "insertExam")
    public  String insertExam(Exam exam) {
       int rows =examService.insertExam(exam);
        return "redirect:/result.jsp?rows="+rows;
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
     *
     * @param eId
     * @return
     */
    @RequestMapping(value = "getExamEId")
    public String getExamEId(Integer eId,Model model) {
     Map map=examService.getExamEId(eId);
     model.addAttribute("map",map);
     model.addAttribute("eId",eId);
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
   public String getExamExam(String exam,Model model){
        List<Map> examList =examService.getExamExam(exam);
       model.addAttribute("examList",examList);
       return "/exam-list.jsp";
}

    /**
     *
     * @param sNo
     * @return
     */
    @RequestMapping(value = "getExamSNo")
    public  String getExamSNo(String sNo,Model model){
    List<Map> mapList=examService.getExamSNo(sNo);
    model.addAttribute("mapList",mapList);
    model.addAttribute("sNo",sNo);
    return "/stu/arrange.jsp";
}
}
