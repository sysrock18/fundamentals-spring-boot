package com.fundamentals.springboot.fundamentos.configuration;

import com.fundamentals.springboot.fundamentos.bean.*;
//import com.fundamentals.springboot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanSumOperation() {
        return new MyOperationImpl();
    }

    @Bean
    public MyBeanWithDependency beanSumGreetOperation(MyOperation myOperation) {
        return new MyBeanWithDependencyImpl(myOperation);
    }
}
