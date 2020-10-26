package com.august.exception.handler;

import com.august.entity.DataMsg;
import com.august.exception.code.BaseResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author AUGUST
 * @description TODO
 * @date 2020/10/15
 */
@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {
    @ExceptionHandler(Exception.class)
    public DataMsg handlerException(Exception e){
        log.error(e.getMessage());
        return DataMsg.getResult(BaseResponseCode.SYSTEM_ERROR);
    }
}
