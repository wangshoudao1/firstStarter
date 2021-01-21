package com.wsd.teststarter;

import com.wsd.starter.ExampleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TeststarterApplicationTests {
    @Autowired
    private ExampleService exampleService;
    @Test
    void contextLoads() {
    }
    @Test
    public void testStarter() {
        System.out.println(exampleService.wrap("hello"));
    }



}
