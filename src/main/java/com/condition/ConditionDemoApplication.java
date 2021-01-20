package com.condition;

import com.xsl.ConditionBean;
import com.xsl.ConditionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConditionDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConditionBean conditionBean = context.getBean(ConditionBean.class);
        conditionBean.sayHi();

        SpringApplication.run(ConditionDemoApplication.class, args);
    }

}
