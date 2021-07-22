package com.fundamentals.springboot.fundamentos.bean;

public class MyOperationImpl implements MyOperation {
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
