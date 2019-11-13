package com.sx.common.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author xieshiguo
 * @date 2019/11/13 0013 16:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {
    /**
     * 返回编码
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public Result() {

    }

    /**
     * 返回成功
     */
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(ErrorCode.BOOT_BASE_SUCCESS.getCode());
        result.setMsg(ErrorCode.BOOT_BASE_SUCCESS.getMsg());
        return result;
    }

    /**
     * 返回成功
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(ErrorCode.BOOT_BASE_SUCCESS.getCode());
        result.setMsg(ErrorCode.BOOT_BASE_SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    /**
     * 返回失败
     */
    public static <T> Result<T> fail(ErrorCode errorCode) {
        Result<T> result = new Result<>();
        result.setCode(errorCode.getCode());
        result.setMsg(errorCode.getMsg());
        return result;
    }

    /**
     * 返回失败
     */
    public static <T> Result<T> fail(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 构建result
     */
    public static <T> Result<T> build(String code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> build(ErrorCode errorCode) {
        return Result.build(errorCode.getCode(), errorCode.getMsg(), null);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
