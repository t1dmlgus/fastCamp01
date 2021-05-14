package com.s1dmlgus.fastCamp01.validation.validator;

import com.s1dmlgus.fastCamp01.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    // 어노테이션에 지정한 패턴
    private String pattern;


    @Override
    public void initialize(YearMonth constraintAnnotation) {

        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {


        System.out.println("patternqqqq = " + pattern);
        System.out.println("valueqqqqq = " + value+"01");

        //yyyyMMdd(01~31)
        try {

            LocalDate localDate = LocalDate.parse(value + "01", DateTimeFormatter.ofPattern(this.pattern));

        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
