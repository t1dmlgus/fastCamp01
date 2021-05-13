package com.s1dmlgus.fastCamp01.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class TimerAop {

    // pointcut
    @Pointcut("execution( * com.s1dmlgus.fastCamp01.controller..*.*(..))")
    private void cut(){

        /**
         * 1. 들어가는 args 확인  -> before
         * 2. 메소드 실행전 어떤 값이 들어가는지
         * 3. 어떤 값이 리턴되는지
         *
         */
    }

    @Pointcut("@annotation(com.s1dmlgus.fastCamp01.annotation.Timer)")
    private void enableTimer(){


    }

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // <- 실질적인 메소드 실행
        // 리턴타입이 있으면 Object에 값이 담김
        Object result = proceedingJoinPoint.proceed();

        stopWatch.stop();

        System.out.println("total time = " + stopWatch.getTotalTimeSeconds());
    }
}
