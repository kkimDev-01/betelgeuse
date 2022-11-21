package com.example.betelgeuse.BeanLifeCycleExample;

import org.springframework.stereotype.Component;

public class HelloWorld {

    public void init() throws Exception {
        System.out.println("init method1");

    }

    public void destroy() throws Exception {
        System.out.println("destroy method1");
    }



}
