package com.study;

import com.study.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigPropertysourceImportsourceApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext context;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }




    @Test
    public void helloService(){
        Boolean flag = context.containsBean("helloService");
        System.out.println(flag);
    }

}

