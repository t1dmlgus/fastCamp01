package com.s1dmlgus.fastCamp01.validation.controller.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class UserDto03 {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    @Valid
    private List<CarDto> cars;


}
