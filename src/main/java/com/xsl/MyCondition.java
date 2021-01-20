package com.xsl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: MyCondition
 * DATE: 2021/1/20
 * TIME: 22:35
 * JDK 11
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName MyCondition
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 22:35
 * @Version v1.0
 **/
public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
