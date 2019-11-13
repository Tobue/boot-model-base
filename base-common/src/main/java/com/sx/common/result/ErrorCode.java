package com.sx.common.result;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回码
 *
 * @author Think
 */
public class ErrorCode {
    private static Map<String, String> MAP = new HashMap<>();

    /**
     * 系统公用模块
     */
    public static final String SUCCESS = "S111111";
    public static final String FIAL = "S000000";
    public static final String BUSINESS_EXCEPTION = "SYS_00002";
    public static final String CUSTOM_ERROR = "C000029";
    public static final String RUNTIMEEXCEPTION = "L000106";



    static {
        MAP.put(SUCCESS, "成功");
        MAP.put(FIAL, "失败");
    }

    public static String getMessage(String code) {
        return MAP.get(code);
    }

    public static String getMessage(String code, String parmName) {
        return MAP.get(code) + " : " + parmName;
    }

    public static String clear(String code) {
        return MAP.put(code, "");
    }
}
