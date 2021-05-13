package com.s1dmlgus.fastCamp01.controller;


import com.s1dmlgus.fastCamp01.annotation.Timer;
import com.s1dmlgus.fastCamp01.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){

//        System.out.println("get");
//        System.out.println("id = " + id);
//        System.out.println("name = " + name);

        return id + " " + name;
    }


    @PostMapping("/post")
    public UserDto post(@RequestBody UserDto userDto){
//        System.out.println("post");
//        System.out.println("userDto = " + userDto);

        return userDto;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {

        //db login -> 1~2 초 걸린다는 조건
        Thread.sleep(1000*2);

    }


}
