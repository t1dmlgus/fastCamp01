package com.s1dmlgus.fastCamp01.IoC;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCApplication {

    public static void main(String[] args) {

        SpringApplication.run(IoCApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getContext();


//        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);


//        Encoder encoder = new Encoder(base64Encoder);

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = context.getBean(Encoder.class);

        String result = encoder.encode(url);
        System.out.println("result = " + result);

        encoder.setIEncoder(context.getBean(UrlEncoder.class));
        String result2 = encoder.encode(url);


        System.out.println("result2 = " + result2);

    }
}
