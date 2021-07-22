package com.fundamentals.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void greet() {
        System.out.println("Hello World from my component two");
    }
}
