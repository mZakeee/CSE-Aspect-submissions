package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* com.example.demo.controllers.*.*(..))")
    public void logging() {
        System.out.println("A controller method is about to be called!");

    }
}
