package com.fundamentals.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {
    @Override
    public void greet() {
        System.out.println("Hello World from my component");
    }
}
