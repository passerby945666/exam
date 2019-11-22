package com.exam.wessm.controller;
;
import com.exam.wessm.entity.Exam;
import com.exam.wessm.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
     * 删除考试信息
     * @param eId
     * @return
     */
    @RequestMapping(value = "deleteExam")
    public String deleteExam(Integer eId) {
        int rows =examService.deleteExam(eId);
        if(rows > 0){
            return  "11";
        }else{
            return "222";
        }
    }


}
