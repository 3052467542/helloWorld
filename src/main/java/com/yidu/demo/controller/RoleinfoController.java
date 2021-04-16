package com.yidu.demo.controller;

import com.yidu.demo.entity.Roleinfo;
import com.yidu.demo.service.RoleinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Roleinfo)表控制层
 *
 * @author makejava
 * @since 2021-04-15 08:51:57
 */
@Controller
public class RoleinfoController {
    /**
     * 服务对象
     */
    @Resource
    private RoleinfoService roleinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param roleid 主键
     * @return 单条数据
     */
    @RequestMapping("selectbyid")
    @ResponseBody
    public Object selectOne(Integer roleid) {
        Roleinfo roleinfo=roleinfoService.queryById(roleid);
        if(roleinfo!=null){
            return roleinfo;
        }
        return "没有这个角色";
        }
}