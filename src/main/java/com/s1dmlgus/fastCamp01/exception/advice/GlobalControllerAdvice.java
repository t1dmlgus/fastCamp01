package com.s1dmlgus.fastCamp01.exception.advice;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {


    /**
     * RestController에 대한 모든 에러처리 -> RestControllerAdvice
     * ViewResolver(뷰)에 대한 모든 에러처리 -> ControllerAdvice
     *
     */

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exception(Exception e){

        System.out.println(e.getClass().getName());

        return null;
    }


}
