package com.s1dmlgus.fastCamp011.ch07.serialize;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {

    private String name;
    transient private String job;


}
