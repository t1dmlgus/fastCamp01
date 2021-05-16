package com.s1dmlgus.fastCamp01.exception.controller;


import com.s1dmlgus.fastCamp01.exception.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api")
public class ExceptionApiController {


    @GetMapping("")
    public UserDto get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {

        UserDto userDto = new UserDto();
        userDto.setName(name);
        userDto.setAge(age);

        int a = 10 + age;



        return userDto;
    }

    @PostMapping("")
    public UserDto post(@Valid @RequestBody UserDto userDto) {


        return userDto;
    }



}
