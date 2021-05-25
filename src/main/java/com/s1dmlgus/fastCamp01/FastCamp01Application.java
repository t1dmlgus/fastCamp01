package com.s1dmlgus.fastCamp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@SpringBootApplication
public class FastCamp01Application {

	public static void main(String[] args)
	{
		SpringApplication.run(FastCamp01Application.class, args);

		//System.out.println(Base64.getEncoder().encodeToString("s1dmlgus@gmail.com".getBytes()));
	}


}
