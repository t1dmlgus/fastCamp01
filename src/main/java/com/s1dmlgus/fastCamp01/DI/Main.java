package com.s1dmlgus.fastCamp01.DI;

public class Main {


    private IEncoder iEncoder;

    public Main(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public static void main(String[] args) {

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        //base64 encoding
        IEncoder base64Encoder = new Base64Encoder();
        String result = base64Encoder.encode(url);


        // 조건 추가 -> url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);


        // DI
//        Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder = new Encoder(new UrlEncoder());
        String result03 = encoder.encode(url);

        System.out.println("result03 = " + result03);

    }





}
