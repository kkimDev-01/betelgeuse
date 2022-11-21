package com.example.betelgeuse.BeanScopeExample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Getter
@Setter
public class HelloMessageGenerator {
    private String message;

}


