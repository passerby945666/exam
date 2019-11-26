package com.exam.wessm.controller;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.entity.Quebank;
import com.exam.wessm.entity.Quetype;
import com.exam.wessm.entity.Subject;
import com.exam.wessm.service.IManagerService;
import com.exam.wessm.service.IQuebankService;
import com.exam.wessm.service.IQuetypeService;
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
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("quebank")
public class QuebankController {
    @Autowired
    @Qualifier("quebankService")
    private IQuebankService quebankService;
    @Autowired
    @Qualifier("managerService")
    private IManagerService managerService;
    @Autowired
    @Qualifier("subjectService")
    private ISubjectService subjectService;
    @Autowired
    @Qualifier("quetypeService")
    private IQuetypeService quetypeService;

    /**
     * 查询题库信息
     * @return
     */
    @RequestMapping(value = "queryQuebank")
    public String queryQuebank(Model model) {
        List<Map> quebankList = quebankService.queryQuebank();
        List<Quetype> quetypeList=quetypeService.queryQuetype();
        List<Subject> subjectList=subjectService.querySubject();
        model.addAttribute("quebankList",quebankList);
        model.addAttribute("size",quebankList.size());
        model.addAttribute("kName",subjectList);
        model.addAttribute("qType",quetypeList);
        return "/quebank-list.jsp";
    }

    /**
     *根据题库id加载题库信息
     */
    @RequestMapping(value = "getQuebankTId")
    public String getQuebankTId(Model model,Integer tId) {
        Map quebankList = quebankService.getQuebanTId(tId);
        List<Quetype> quetypeList=quetypeService.queryQuetype();
        List<Subject> subjectList=subjectService.querySubject();
        model.addAttribute("quebankList",quebankList);
        model.addAttribute("kName",subjectList);
        model.addAttribute("qType",quetypeList);
        model.addAttribute("tId",tId);
        return "/quebank-edit.jsp";
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
    public String insertQuebank(Quebank quebank, Model model, HttpSession session) {
        Manager manager=(Manager) session.getAttribute("managerSession");
        quebank.setmId(manager.getmId());
        int rows = quebankService.insertQuebank(quebank);
        return "redirect:/result.jsp?rows=" + rows;
    }

    /**
     * 加载科目和题型信息
     * @param model
     * @return
     */
    @RequestMapping(value = "getKId")
    public String getKId(Model model){
        List<Subject> subjectList=subjectService.querySubject();
        model.addAttribute("kName",subjectList);
        List<Quetype> quetypeList=quetypeService.queryQuetype();
        model.addAttribute("qType",quetypeList);
        return "/quebank-add.jsp";
    }

    /**
     * 修改题库
     *
     * @param
     * @return
     */
    @RequestMapping(value = "updateQuebank")
    public String updateQuebank(@RequestParam Map map,Model model, HttpSession session,Quebank quebank ) {
        List<Manager> list= managerService.getManager(String.valueOf(map.get("mName")));
        Manager manager=(Manager) session.getAttribute("managerSession");
        quebank.setmId(manager.getmId());
        Integer qId=Integer.valueOf(String.valueOf(map.get("qId")));
        Integer kId=Integer.valueOf(String.valueOf(map.get("kId")));
        Integer mId=Integer.valueOf(""+list.get(0).getmId());
        Quebank quebank1=new Quebank(Integer.valueOf(map.get("tId")+""),String.valueOf(map.get("tNo")),String.valueOf(map.get("content")),qId,String.valueOf(map.get("answer")),String.valueOf(map.get("reply")),null,kId,mId );
        int rows =quebankService.updateQuebank(quebank1);
        return "redirect:/result.jsp?rows="+rows;
    }
    /**
     *根据下拉框加载题库信息
     */
    @RequestMapping(value = "queryQuebankKId")
    public String queryQuebankKId(Model model,String kId,String qId,String que) {
        List<Map> quebankList = quebankService.queryQuebankKId(kId,qId);
        List<Quetype> quetypeList=quetypeService.queryQuetype();
        List<Subject> subjectList=subjectService.querySubject();
        List<Map> que1=quebankService.getQuebank(que);
        model.addAttribute("kName",subjectList);
        model.addAttribute("qType",quetypeList);
        if(que.equals("")){
            model.addAttribute("quebankList",quebankList);
        }else {
            model.addAttribute("quebankList", que1);
        }
        model.addAttribute("size",quebankList.size());
        return "/quebank-list.jsp";
    }
}
