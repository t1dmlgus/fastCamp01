package com.s1dmlgus.fastCamp01.validation.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CarDto {

    @NotBlank
    private String name;

    @NotBlank
    @JsonProperty("car_number")
    private String carName;

    @NotBlank
    @JsonProperty("TYPE")
    private String type;


}
