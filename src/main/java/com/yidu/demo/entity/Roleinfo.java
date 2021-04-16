package com.yidu.demo.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Roleinfo)实体类
 *
 * @author makejava
 * @since 2021-04-15 08:51:57
 */
@Component
public class Roleinfo implements Serializable {
    private static final long serialVersionUID = 519639580941709024L;
    
    private Integer roleid;
    
    private String rolename;
    
    private String depict;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

}