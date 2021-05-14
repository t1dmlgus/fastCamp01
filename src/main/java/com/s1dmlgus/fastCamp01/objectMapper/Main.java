package com.s1dmlgus.fastCamp01.objectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.s1dmlgus.fastCamp01.objectMapper.dto.CarDto;
import com.s1dmlgus.fastCamp01.objectMapper.dto.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("main");

        ObjectMapper objectMapper = new ObjectMapper();

        UserDto userDto = new UserDto();
        userDto.setName("홍길2동");
        userDto.setAge(10);

        CarDto car1 = new CarDto();
        car1.setName("k5");
        car1.setCarName("11가 1111");
        car1.setType("세단");

        CarDto car2 = new CarDto();
        car2.setName("q5");
        car2.setCarName("22가 2222");
        car2.setType("SUV");

        CarDto car3 = new CarDto();
        car3.setName("t5");
        car3.setCarName("33가 3333");
        car3.setType("승용차");


        //배열
        List<CarDto> carDtos = Arrays.asList(car1, car2, car3, car1);
        // arrayList
        ArrayList<CarDto> carDtos2 = new ArrayList<>();


        // arrayList
        List<CarDto> carDtos1 = new ArrayList<>(Arrays.asList(car1,car2,car3));



        userDto.setCars(carDtos1);
        System.out.println("userDto = " + userDto);


        String json = objectMapper.writeValueAsString(userDto);
        System.out.println("json = " + json);

        // 파싱 >>>
        JsonNode jsonNode = objectMapper.readTree(json);
        String name = jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();
        System.out.println("name = " + name + " age =" +age);


        // array -> json 파싱
        ArrayNode arrayNode = (ArrayNode) jsonNode.get("cars");
        List<CarDto> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<CarDto>>() {
        });

        System.out.println("_cars = " + _cars);


        ObjectNode objectNode = (ObjectNode) jsonNode;
        objectNode.put("name", "s1dmlgus");
        objectNode.put("age", 20);

        System.out.println("objectNode.toPrettyString() = " + objectNode.toPrettyString());


    }

}
