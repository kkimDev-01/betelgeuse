package com.example.betelgeuse.DIExample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorInjection2 {
    private final Frank frank;

}
