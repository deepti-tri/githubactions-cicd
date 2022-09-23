package com.strategiotech.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubactionsCicdApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
        return name;

    }

}
