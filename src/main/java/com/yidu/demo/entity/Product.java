package com.yidu.demo.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2021-04-14 15:38:50
 */
@Component
public class Product implements Serializable {
    private static final long serialVersionUID = 446510671089049850L;
    
    private Integer pid;
    
    private String pname;
    
    private String pimg;
    
    private String sketch;
    
    private Integer ptype;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

}