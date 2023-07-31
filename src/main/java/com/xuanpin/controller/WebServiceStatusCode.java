package com.xuanpin.controller;

public class WebServiceStatusCode {
    public static final Integer SAVE_OK = 20011;//添加数据成功
    public static final Integer DELETE_OK = 20021;//删除数据成功
    public static final Integer UPDATE_OK = 20031;//更新数据成功
    public static final Integer GET_OK = 20041;//查询数据成功



    public static final Integer SAVE_ERR = 20010;//添加数据失败
    public static final Integer DELETE_ERR = 20020;//删除数据失败
    public static final Integer UPDATE_ERR = 20030;//更新数据失败
    public static final Integer GET_ERR = 20040;//查询数据失败


    public static final Integer SYSTEM_UNKNOW_ERROR = 50001;
    public static final Integer SYSTEM_TIMEOUT_ERROR = 50002;

    public static final Integer PROJECT_VALIDATE_ERROR = 60001;
    public static final Integer PROJECT_BUSINESS_ERROR = 60002;
}
