package com.exam.wessm.controller;

import com.exam.wessm.entity.Manager;
import com.exam.wessm.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 管理员控制器类
 */
@Controller
@RequestMapping("admin")
public class ManagerController {
    @Autowired
    @Qualifier("managerService")
    private IManagerService managerService;

    /**
     * 查询管理员信息
     * @return
     */
    @RequestMapping(value = "queryManager")
    public String queryManager(Model model) {
        List<Manager> adminList = managerService.queryManager();
        model.addAttribute("adminList",adminList);
        return "/admin-list.jsp";
    }

    /**
     * 根据管理员ID删除管理员
     *
     * @param mId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleteManager")
    public int  deleteManager(Integer mId) {
        int rows = managerService.deleteManager(mId);
        return  rows;
    }

    /**
     * 添加管理员
     *
     * @param manager
     * @return
     */
    @RequestMapping(value = "insertManager",method = RequestMethod.POST)
    public String insertManager(Manager manager,String password2) {
        if (password2.equals(manager.getmPassword())){
            int rows = managerService.insertManager(manager);
            return "/result.jsp?rows=" + rows;
        }
      else {
          return "/404.jsp";
        }
    }

    /**
     * 到管理员信息修改页面
     * @param mId
     * @param model
     * @return
     */
 @RequestMapping(value = "getManagerMId")
 public String getManagerMId(Integer mId,Model model){
     Manager admin =managerService.getManagerMId(mId);
     model.addAttribute("admin",admin);
     model.addAttribute("mId",mId);
     return  "/admin-edit.jsp";
 }


    /**
     * 修改管理员
     *
     * @param manager
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updateManager")
    public String updateManager(Manager manager) {
        int rows = managerService.updateManager(manager);
        return "redirect:/result.jsp?rows="+rows;
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
     *关键字查询
     * @param manager
     * @param model
     * @return
     */
    @RequestMapping(value = "getManager")
   public  String  getManager(String manager,Model model){
        List<Manager> adminList =managerService.getManager(manager);
        model.addAttribute("adminList",adminList);
        return  "/admin-list.jsp";
    }

}
