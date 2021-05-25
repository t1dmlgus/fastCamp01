package com.s1dmlgus.fastCamp01.jpa.bookmanager.repository;

import com.s1dmlgus.fastCamp01.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void crud테스트() throws Exception{
        //given
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));

        //when
        users.forEach(System.out::println);
        //System.out.println(userRepository.findAll());
        
        //then
    }


    @Test
    public void saveUser() throws Exception{
        //given

        User user1 = new User("JACK","jack@gmail.com");
        User user2 = new User("stom","stom@gmail.com");

        //when
        userRepository.saveAll(Lists.newArrayList(user1, user2));

        userRepository.findAll().forEach(System.out::println);

        //then
    }
    
    @Test
    public void 페이징() throws Exception{
        //given
        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));

        //when
        System.out.println("users = " + users);
        System.out.println("users.getTotalElements() = " + users.getTotalElements());
        System.out.println("users.getTotalPages() = " + users.getTotalPages());
        System.out.println("users.getNumberOfElements() = " + users.getNumberOfElements());
        System.out.println("users.getSort() = " + users.getSort());
        System.out.println("users.getSize() = " + users.getSize());


        users.getContent().forEach(System.out::println);
        
        //then
    }

    @Test
    public void queryByExample() throws Exception{
        //given



        //when
        
        
        //then
    }




}