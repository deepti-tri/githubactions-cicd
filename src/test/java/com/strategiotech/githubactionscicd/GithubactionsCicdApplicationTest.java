package com.strategiotech.githubactionscicd;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GithubactionsCicdApplicationTest {

    @Test
    void hello() {
        GithubactionsCicdApplication controller = new GithubactionsCicdApplication(); // instance of the controller
        String response = controller.hello("Hello world"); // act
        assertEquals("Hello world", response); // assert
    }
}


