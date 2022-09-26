package com.strategiotech.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class GithubactionsCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubactionsCicdApplication.class, args);
    }

    @RequestMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
        return name;

    }

}
