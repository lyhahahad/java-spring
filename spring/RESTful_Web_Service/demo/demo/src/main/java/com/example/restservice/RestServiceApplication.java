package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {
//ioc의 가장 큰 특징 만약 여기서 run이후에 다른 코드를 추가해도 실행되지 않는다.
//기존의 자바 프로그램들은 main에서 실행흐름을 컨트롤하지만 스프링은 그렇지 않다.
    public static void main(String[] args) {
        System.out.println(111111);
        SpringApplication.run(RestServiceApplication.class, args);
    }


}
