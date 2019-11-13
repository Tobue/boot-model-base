package com.sx.common.result;


import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ResultGenerator {

    private static final String SUCCESS_CODE = ErrorCode.SUCCESS;
    private static final String CUSTOM_ERROR_CODE = ErrorCode.CUSTOM_ERROR;

    public Result generate(String code, Object obj) {
        Result result;
        if (SUCCESS_CODE.equals(code)) {
            result = new Result(SUCCESS_CODE, ErrorCode.getMessage(SUCCESS_CODE), true);
            result.setProperty("data", obj);
        } else if (StringUtils.isEmpty(ErrorCode.getMessage(code))) {
            result = new Result(ErrorCode.BUSINESS_EXCEPTION, code, false);
        } else {
            result = new Result(code, ErrorCode.getMessage(code), false);
        }

        if (CUSTOM_ERROR_CODE.equals(code)) {
            ErrorCode.clear(CUSTOM_ERROR_CODE);
        }
        return result;
    }

    public Result generateResult(String message, Object obj) {
        Result result;
        result = new Result(ErrorCode.RUNTIMEEXCEPTION, message, false);
        result.setProperty("data", obj);
        return result;
    }


    public Result generate(String code) {
        return generate(code, "");
    }

    public Result generate(ServiceResult serviceResult) {
        String code = (String) serviceResult.getErrorCode();
        Object data = serviceResult.getResult();
        Result result;
        if (SUCCESS_CODE.equals(code)) {
            result = new Result(SUCCESS_CODE, ErrorCode.getMessage(SUCCESS_CODE), true);
            result.setProperty("data", data);
        } else if (StringUtils.isEmpty(ErrorCode.getMessage(code))) {
            result = new Result(ErrorCode.BUSINESS_EXCEPTION, data.toString(), false);
        }  else {
            result = new Result(code, String.format(ErrorCode.getMessage(code)), false);
        }

        if (CUSTOM_ERROR_CODE.equals(code)) {
            ErrorCode.clear(CUSTOM_ERROR_CODE);
        }
        return result;
    }
}
