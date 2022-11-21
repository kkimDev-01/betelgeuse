package com.example.betelgeuse.DIExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private final Frank frank;

    @Autowired
    public ConstructorInjection(Frank frank) {
        this.frank = frank;
    }
}
