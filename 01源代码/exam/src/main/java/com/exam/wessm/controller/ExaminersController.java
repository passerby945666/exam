package com.exam.wessm.controller;
import com.exam.wessm.service.IExaminersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("examiners")
public class ExaminersController {
    @Autowired
    @Qualifier("examinersService")
    private IExaminersService examinersService;
    @RequestMapping(value = "getExaminersExId")
   public String    getExaminers(String examiners,Model model){
        List<Map> mapList=examinersService.getExaminers(examiners);
        model.addAttribute("mapList",mapList);
        return "/stu/arrange.jsp";
    }
}
