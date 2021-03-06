package com.shsxt.crm.model;

/**
 * Created by xlf on 2018/10/13.
 */
public class ResultInfo {

    private Integer code = 200;
    private String msg = "操作成功";
    private Object result; // 返回结果

    public ResultInfo() {
    }

    public ResultInfo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultInfo(String msg) {
        this.msg = msg;
    }

    public ResultInfo(Integer code) {
        this.code = code;
    }


    public ResultInfo(Integer code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public ResultInfo(Object result) {
        this.result = result;
    }
    public ResultInfo(String msg, Object result) {
        this.msg = msg;
        this.result = result;
    }

    public ResultInfo(Integer code, Object result) {
        this.code = code;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
