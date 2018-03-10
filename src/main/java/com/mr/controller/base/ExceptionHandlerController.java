package com.mr.controller.base;

import com.mr.common.base.Response;
import com.mr.common.enumeration.ResultEnum;
import com.mr.common.exception.BaseRuntimeException;
import com.mr.common.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(BaseRuntimeException.class)
    public Response handler(BaseRuntimeException e) {
        logger.error(e.getMessage(), e);
        return new Response<>(e.getCode(), e.getMessage(), false);
    }

    @ExceptionHandler(ServiceException.class)
    public Response handler(ServiceException e) {
        logger.error(e.getMessage(), e);
        return new Response<>(e.getCode(), e.getMessage(), false);
    }

    @ExceptionHandler(Exception.class)
    public Response handler(Exception e) {
        logger.error(e.getMessage(), e);
        return new Response<>(ResultEnum.FAIL.getCode(), e.getMessage(), false);
    }
}
