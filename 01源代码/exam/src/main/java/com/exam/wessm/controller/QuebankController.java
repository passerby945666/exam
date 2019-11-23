package com.exam.wessm.controller;

import com.exam.wessm.entity.Quebank;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IManagerService;
import com.exam.wessm.service.IQuebankService;
import com.exam.wessm.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("quebank")
public class QuebankController {
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
     * 查询题库信息
     * @return
     */
    @RequestMapping(value = "queryQuebank")
    public String queryQuebank(Model model) {
        List<Map> quebankList = quebankService.queryQuebank();
        model.addAttribute("quebankList",quebankList);

        return "/quebank-list.jsp";
    }

    /**
     *根据题库id加载题库信息
     */
    @RequestMapping(value = "getQuebankTId")
    public String getQuebanTId(Model model,Integer tId) {
        Map quebankList = quebankService.getQuebanTId(tId);
        model.addAttribute("quebankList",quebankList);
        return "/quebank-edit.jsp";
    }

    /**
     *根据关键字加载题库信息
     */
    @RequestMapping(value = "getQuebank")
    public String getQuebank(Model model,String quebank) {
        List<Map> quebankList = quebankService.getQuebank(quebank);
        model.addAttribute("quebankList",quebankList);
        return "/quebank-list.jsp";
    }

    /**
     * 根据题库ID删除题库
     *
     * @param tId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteQuebank")
    public String deleteQuebank(int tId) {
        int rows = quebankService.deleteQuebank(tId);
        //重定向到删除结果的页面
        return "redirect:/result.jsp?rows=" + rows;
    }

    /**
     * 添加题库
     *
     * @param
     * @return
     */
    @RequestMapping(value = "insertQuebank")
    public String insertQuebank(Quebank quebank) {
        int rows = quebankService.insertQuebank(quebank);
        return "redirect:/result.jsp?rows=" + rows;
    }

    /**
     * 修改题库
     *
     * @param
     * @return
     */
    @RequestMapping(value = "updateQuebank")
    public String updateQuebank(@RequestParam Map map ) {
        List<Map> list=(List<Map>) managerService.getManager(String.valueOf(map.get("kName")));
        if(list.size()==0){

        }
        Integer qId=Integer.valueOf(String.valueOf(map.get("qId")));
        Integer kId=Integer.valueOf(String.valueOf(map.get("kId")));
        Integer tId=Integer.valueOf(""+list.get(0).get("tId"));
        Quebank quebank=new Quebank(0,String.valueOf(map.get("tNo")),String.valueOf(map.get("content")),qId,String.valueOf(map.get("answer")),String.valueOf(map.get("reply")),null,kId,tId );
        int rows =quebankService.updateQuebank(quebank);
        return "redirect:/result.jsp?rows="+rows;
    }
}
