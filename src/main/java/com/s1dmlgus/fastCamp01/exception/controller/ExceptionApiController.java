package com.s1dmlgus.fastCamp01.exception.controller;


import com.s1dmlgus.fastCamp01.exception.dto.UserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@RestController
@Validated
@RequestMapping("/api/user1")
public class ExceptionApiController {


    @GetMapping("")
    public UserDto get(
            @Size(min = 2)
            @RequestParam(required = false) String name,

            @NotNull
            @Min(1)
            @RequestParam Integer age) {

        UserDto userDto = new UserDto();
        userDto.setName(name);
        userDto.setAge(age);

        System.out.println("userDto = " + userDto);

        return userDto;
    }


    @PostMapping("")
    public UserDto post(@Valid @RequestBody UserDto userDto) {

        System.out.println("userDto = " + userDto);
        return userDto;
    }



}
