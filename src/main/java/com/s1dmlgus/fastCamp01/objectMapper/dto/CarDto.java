package com.s1dmlgus.fastCamp01.objectMapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarDto {

    private String name;

    @JsonProperty("car_number")
    private String carName;

    @JsonProperty("TYPE")
    private String type;


}
