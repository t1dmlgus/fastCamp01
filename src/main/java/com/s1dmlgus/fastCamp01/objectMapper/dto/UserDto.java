package com.s1dmlgus.fastCamp01.objectMapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.JoinColumn;
import java.util.List;

@Data
public class UserDto {

    private String name;
    private int age;
    private List<CarDto> cars;

}
