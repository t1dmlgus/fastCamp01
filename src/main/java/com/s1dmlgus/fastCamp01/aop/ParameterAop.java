package com.s1dmlgus.fastCamp01.aop;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class ParameterAop {

    // pointcut
    @Pointcut("execution( * com.s1dmlgus.fastCamp01.aop.controller..*.*(..))")
    private void cut(){

        /**
         * 1. 들어가는 args 확인  -> before
         * 2. 메소드 실행전 어떤 값이 들어가는지
         * 3. 어떤 값이 리턴되는지
         *
         */
    }

  //  @Before("cut()")
    public void before(JoinPoint joinpoint){

        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
        Method method = signature.getMethod();

        System.out.println("method = " + method.getName());

        Object[] args = joinpoint.getArgs();
        for (Object arg : args) {
            System.out.println("type = " + arg.getClass().getSimpleName());
            System.out.println("arg(value) = " + arg);
        }

    }

    //@AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinpoint, Object returnObj){

        System.out.println("returnObj = " + returnObj);
    }

}
