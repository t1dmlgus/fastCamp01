package com.s1dmlgus.fastCamp01.validation.controller.dto;


import com.s1dmlgus.fastCamp01.validation.annotation.YearMonth;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Data
public class UserDto01 {


    @NotBlank
    private String name;
    @Max(value = 90)
    private int age;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phone;

    @Size(min = 6, max = 6)
    private String reqYearMonth;


    @AssertTrue(message = "yyyyMM의 형식에 맞지 않습니다.")
    public boolean isReqYearMonthValidaion(){

        try {
            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
        } catch (Exception e) {
            return false;
        }

        return true;
    }



}
