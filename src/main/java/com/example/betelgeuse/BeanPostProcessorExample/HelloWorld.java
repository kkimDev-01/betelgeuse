package com.example.betelgeuse.BeanPostProcessorExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorld {
    private String message;

    public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }


}
