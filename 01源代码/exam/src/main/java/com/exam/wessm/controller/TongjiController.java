package com.exam.wessm.controller;

import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IStuService;
import com.exam.wessm.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("tongji")
public class TongjiController {
    @Autowired
    @Qualifier("stuService")
    private IStuService stuService;
    @Autowired
    @Qualifier("subjectService")
    private ISubjectService subjectService;

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

    @RequestMapping(value = "yearnum")
    public String yearnum(HttpServletRequest request){
        Map mapa=stuService.getYearnum(1);
        Map mapb=stuService.getYearnum(2);
        request.setAttribute("mapa",mapa);
        request.setAttribute("mapb",mapb);
        return "/yearnum";
    }
    @RequestMapping(value = "avgnum")
    public String avgnum(HttpServletRequest request){
        List<Map> listSS=new ArrayList<>();
        List<Map> listLL=new ArrayList<>();
        Map map;

        List<Subject> subList=subjectService.querySubject();
        for(int i=0;i<subList.size();i++){
             listSS=stuService.getAvgnum(subList.get(i).getkId());
            map=new HashMap();
            map.put("kName",subList.get(i).getkName());
            map.put("ListSS",listSS);
            listLL.add(map);
        }
        request.setAttribute("ListLL",listLL);

        return "/avgnum";
    }
}
