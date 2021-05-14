package com.s1dmlgus.fastCamp01.aop;


import com.s1dmlgus.fastCamp01.aop.dto.UserDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Component
@Aspect
public class DecodeAop {


    @Pointcut("execution( * com.s1dmlgus.fastCamp01.aop.controller..*.*(..))")
    private void cut(){}

    @Pointcut("@annotation(com.s1dmlgus.fastCamp01.aop.annotation.Decode)")
    private void enableDecode(){}


    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof UserDto) {
                UserDto userDto = UserDto.class.cast(arg);
                userDto.setEmail(new String(Base64.getDecoder().decode(userDto.getEmail()), "UTF-8"));

            }

        }
    }

    @AfterReturning(value = "cut() && enableDecode()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){

        if (returnObj instanceof UserDto) {
            UserDto userDto = UserDto.class.cast(returnObj);
            String email = userDto.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());

            userDto.setEmail(base64Email);
        }
    }



}
