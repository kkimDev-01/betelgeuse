package com.example.betelgeuse.BeanLifeCycleExample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld3 {

    @PostConstruct
    public void init() throws Exception {
        System.out.println("init method3");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy method3");
    }

}
