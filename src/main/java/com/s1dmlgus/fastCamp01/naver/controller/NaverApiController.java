package com.s1dmlgus.fastCamp01.naver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


@Slf4j
@RestController
@RequestMapping("/api/server")
public class NaverApiController {

    @GetMapping("/naver")
    public String naver(){

        RestTemplate restTemplate = new RestTemplate();

        // 주소
        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/doc.json")
                .queryParam("query", "안양")
                .queryParam("display", "10")
                .queryParam("start", "1")
                .queryParam("sort", "sim")
                .encode()
                .build()
                .toUri();



        log.info("uri : {} ", uri);

        // 헤더
        RequestEntity<Void> req = RequestEntity
                .get(uri)
                .header("X-Naver-Client-Id", "UbFWG1Bs_JjXtnjQtSYt")
                .header("X-Naver-Client-Secret", "mbifKbGnlO")
                .build();


        ResponseEntity<String> result = restTemplate.exchange(req, String.class);

        return result.getBody();

    }
}
