package com.exam.wessm.controller;
import com.exam.wessm.service.IGradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "/stu/info";
    }
    @RequestMapping(value = "getGradekFind")
    public  String getGradekFind(String str,Model model){
        List<Map> mapList=gradesService.getGradekFind(str);
        model.addAttribute("mapList",mapList);
        return "/stu/info";
    }
}
