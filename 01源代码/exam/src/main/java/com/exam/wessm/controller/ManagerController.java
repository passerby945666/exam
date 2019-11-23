package com.exam.wessm.controller;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员控制器类
 */
@Controller
@RequestMapping("manager")
public class ManagerController {
    @Autowired
    @Qualifier("managerService")
    private IManagerService managerService;

    /**
     * 注册账号
     *
     * @param manager
     * @return
     */
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(Manager manager, String Cpassword) {
        if (Cpassword.equals(manager.getmPassword())){
            managerService.registerManager(manager);
            return "/login.jsp";
        }
        else {
            return  "/404.jsp";
        }
    }

    /**
     * 登录
     * @param type
     * @param mNo
     * @param mPassword
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST )
    public String login(Integer type, String mNo, String mPassword  , HttpSession session, Model model) {
        if (type==1){
            Manager manager=managerService.findManagerNoAndPass(mNo,mPassword);
            if(manager!=null){
                session.setAttribute("managerSession",manager);
                model.addAttribute("manager",manager);
                return  "/stu/indexStu.jsp";
            }
        }
        else{
            return "/index.jsp";
        }
        return  "/404.jsp";
    }

    /**
     * 查询管理员信息
     * @return
     */
    @RequestMapping(value = "queryManager",method = RequestMethod.POST)
    public String queryManager(Model model) {
        List<Manager> managerList = managerService.queryManager();
        model.addAttribute("managerList",managerList);
        return "/admin-list.jsp";
    }

    /**
     * 根据管理员ID删除管理员
     *
     * @param mId
     * @return
     */
    @RequestMapping(value = "deleteManager",method = RequestMethod.POST)
    public String deleteManager(@RequestParam("m_id") int mId) {
        int rows = managerService.deleteManager(mId);
        //重定向到删除结果的页面
        return "redirect:/result?rows=" + rows;
    }

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    @RequestMapping(value = "insertManager",method = RequestMethod.POST)
    public String insertManager(Manager manager) {
        int rows = managerService.insertManager(manager);
        return "redirect:/result?rows=" + rows;
    }

    /**
     * 修改管理员
     *
     * @param manager
     * @return
     */
    @RequestMapping(value = "updateManager",method = RequestMethod.POST)
    public String updateManager(Manager manager) {
        int rows = managerService.updateManager(manager);
        return "redirect:/result?rows="+rows;
    }

    /**
     * 修改管理员密码
     *
     * @param manager
     * @return
     */
    @RequestMapping(value = "updateManagerPassword",method = RequestMethod.POST)
    public String updateManagerPassword(Manager manager) {
        int rows = managerService.updateManagerPassword(manager);
        return "redirect:/result.jsp?rows="+rows;
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout.action",method = RequestMethod.POST)
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向
        return "redirect:/login.jsp";
    }

}
