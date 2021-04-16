package com.yidu.demo.ben;

import java.util.List;

/**
 * @description:
 * @auth: yidu
 * @version:1.0
 **/
public class ResponeData<T> {
    private int code;
    private String msg;
    private int count;
    private List<T> data;

    public ResponeData(int code, String msg, int count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static ResponeData getInstance(int code, String msg, int count, List<Object> data) {
        return new ResponeData(code, msg, count, data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
