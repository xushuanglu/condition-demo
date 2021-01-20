package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: ConditionConfig
 * DATE: 2021/1/20
 * TIME: 22:36
 * JDK 11
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ConditionConfig
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:36
 * @Version v1.0
 **/
@Configuration
@Conditional(MyCondition.class)
public class ConditionConfig {

    @Bean
    public ConditionBean conditionBean(){
        return new ConditionBean();
    }

}
