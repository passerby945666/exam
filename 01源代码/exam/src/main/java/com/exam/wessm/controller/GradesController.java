package com.exam.wessm.controller;
import com.exam.wessm.entity.Grades;
import com.exam.wessm.service.IGradesService;
import com.exam.wessm.util.examing.examingROM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("grade")
public class GradesController {
    @Autowired
    @Qualifier("gradesService")
    private IGradesService gradesService;

    /**
     * 查询所有成绩信息
     * @param model
     * @return
     */
   @RequestMapping(value = "queryGrades")
    public String queryGrades(Model model){
        List<Map> mapList=gradesService.queryGrades();
        model.addAttribute("mapList",mapList);
        model.addAttribute("size",mapList.size());
        return "/stu/info.jsp";
    }

    /**
     * 根据成绩ID删除成绩
     *
     * @param gId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteGrade")
    public int  deleteGrade(Integer gId) {
        int rows = gradesService.deleteGrade(gId);
        return  rows;
    }

    /**
     * 添加成绩
     *
     * @param grades
     * @return
     */
    @RequestMapping(value = "insertGrade")
    public String insertGrade(Grades grades) {
        int rows = gradesService.insertGrade(grades);
        return "redirect:/result.jsp?rows=" + rows;
    }

    /**
     * 到成绩信息修改页面
     * @param gId
     * @param model
     * @return
     */
    @RequestMapping(value = "getGradegId")
    public String getGradegId(Integer gId,Model model){
        Grades grades =gradesService.getGradegId(gId);
        model.addAttribute("grades",grades);
        model.addAttribute("gId",gId);
        return  "/read-edit.jsp";
    }


    /**
     * 修改成绩
     *
     * @param grades
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateGrades")
    public String updateGrade(Grades grades) {
        int rows = gradesService.updateGrade(grades);
        return "redirect:/result.jsp?rows="+rows;
    }


    /**
     * 考生查询自己的成绩信息
     * @param str
     * @param model
     * @return
     */
    @RequestMapping(value = "getGradekFind")
    public  String getGradekFind(String str,Model model){
        List<Map> mapList=gradesService.getGradekFind(str);
        model.addAttribute("mapList",mapList);
        return "/stu/info.jsp";
    }

    /**
     *
     * 根据个人准考证号查询成绩
     * @param examCard
     * @param model
     * @return
     */
    @RequestMapping(value = "getGradeExamCard")
    public  String  getGradeExamCard(String examCard,Model model){
    Grades   grades=gradesService.getGradeExamCard(examCard);
    model.addAttribute("grades",grades);
    model.addAttribute("examCard",examCard);
    return  "/infograderesult.jsp";
}
}
