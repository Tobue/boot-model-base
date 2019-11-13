package com.sx.common.demo;

import java.io.Serializable;

/**
 * @author xieshiguo
 * @date 2019/11/13 0013 16:31
 */
public enum ErrorCode implements Serializable {

    BOOT_BASE_SUCCESS("000000", "成功"),
    BOOT_BASE_FAIL("000001", "失败");
    /**
     * 编码
     */
    private String code;
    /**
     * 信息
     */
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
