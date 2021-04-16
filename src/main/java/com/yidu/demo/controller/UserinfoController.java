package com.yidu.demo.controller;

import com.yidu.demo.entity.Userinfo;
import com.yidu.demo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLOutput;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2021-04-12 14:28:54
 */
@Controller
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;

    @RequestMapping("selectone")
    public Userinfo selectOne(Integer id) {
        return this.userinfoService.queryById(id);
    }

    @RequestMapping("login")
    @ResponseBody
    public Userinfo login(String userName,String userPass){

        System.out.println(userName);
        return userinfoService.login(userName,userPass);
    }
    @ResponseBody
    @RequestMapping("userinfo_register")
    public String insertUserinfo(Userinfo userinfo) {
        Userinfo inset = userinfoService.insert(userinfo);
        System.out.println(userinfo);
        if (inset != null) {
            return "新增成功";
        }
        return "新增失败";
    }

}