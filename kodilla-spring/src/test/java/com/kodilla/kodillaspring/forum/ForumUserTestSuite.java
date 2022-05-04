package com.kodilla.kodillaspring.forum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testForumUserLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String username = forumUser.username;
        //Then
        Assertions.assertEquals("John Smith", username);
    }
}