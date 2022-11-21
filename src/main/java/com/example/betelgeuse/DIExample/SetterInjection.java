package com.example.betelgeuse.DIExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

    private Frank frank;

    @Autowired
    public void setFrank(Frank frank) {
        this.frank = frank;
    }

}
