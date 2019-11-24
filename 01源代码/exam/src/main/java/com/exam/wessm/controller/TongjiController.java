package com.exam.wessm.controller;

import com.exam.wessm.entity.Quebank;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IManagerService;
import com.exam.wessm.service.IQuebankService;
import com.exam.wessm.service.IStuService;
import com.exam.wessm.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("tongji")
public class TongjiController {
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;

    /**
     * 查询题库信息
     * @return
     */
    @RequestMapping(value = "sexnum")
    public String sexnum(HttpServletRequest request){
        Map map=stuService.getSexnum();
        request.setAttribute("map",map);
        return "/charts-1";
    }

}
