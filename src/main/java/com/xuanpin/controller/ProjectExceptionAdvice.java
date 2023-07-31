package com.xuanpin.controller;

import com.xuanpin.exception.BusinessException;
import com.xuanpin.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(BusinessException.class)
    public ReturnFrontendInformation doBusinessException(BusinessException ex){
        return new ReturnFrontendInformation(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public ReturnFrontendInformation doSystemException(SystemException ex){
        /*
        记录日志
        发送邮件给开发，ex对象给开发
        发送邮件给运维
         */
        return new ReturnFrontendInformation(ex.getCode(),null,ex.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ReturnFrontendInformation doException(Exception ex){
        /*
        记录日志
        发送邮件给开发，ex对象给开发
        发送邮件给运维
         */
        return new ReturnFrontendInformation(WebServiceStatusCode.SYSTEM_UNKNOW_ERROR,null,"系统繁忙，请自行处理！");
    }
}
