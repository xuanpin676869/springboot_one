package com.xuanpin.controller;

public class ReturnFrontendInformation {
    private Integer code;
    private Object data;
    private String msg;


    public ReturnFrontendInformation() {
    }

    public ReturnFrontendInformation(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ReturnFrontendInformation(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     * @return data
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "ReturnFrontendInformation{code = " + code + ", data = " + data + ", msg = " + msg + "}";
    }
}
