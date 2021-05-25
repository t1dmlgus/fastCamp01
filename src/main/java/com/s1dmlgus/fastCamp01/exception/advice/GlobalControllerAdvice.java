package com.s1dmlgus.fastCamp01.exception.advice;


import com.s1dmlgus.fastCamp01.exception.controller.ExceptionApiController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice(basePackageClasses = ExceptionApiController.class)
@RestControllerAdvice()
public class GlobalControllerAdvice {


    /**
     * RestController에 대한 모든 에러처리 -> RestControllerAdvice
     * ViewResolver(뷰)에 대한 모든 에러처리 -> ControllerAdvice
     *
     */

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exception(Exception e){

        System.out.println("e.getClass().getName() = " + e.getClass().getName());
        System.out.println(" --------------" );
        System.out.println(e.getLocalizedMessage());
        System.out.println(" --------------" );


        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity MethodArgumentNotValidException(MethodArgumentNotValidException e) {

        System.out.println("22---------------");
        System.out.println(e.getMessage());
        System.out.println("22---------------");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
    }
}
