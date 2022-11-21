package com.example.betelgeuse.BeanLifeCycleExample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");

        cap.close();
    }

}
