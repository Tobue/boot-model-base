package com.sx.common.result;

/**
 * @author xieshiguo  service返回结果
 * @date 2019/11/13  10:45
 */
public class ServiceResult<String, RESULT> {

    private String errorCode;
    private RESULT result;


    public ServiceResult() {
    }


    public ServiceResult(String errorCode, RESULT result) {
        this.errorCode = errorCode;
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RESULT getResult() {
        return result;
    }

    public void setResult(RESULT result) {
        this.result = result;
    }

}