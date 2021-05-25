package com.s1dmlgus.fastCamp01.jpa.bookmanager.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    //@NotNull
    private String name;

    //@NotNull
    private String email;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
