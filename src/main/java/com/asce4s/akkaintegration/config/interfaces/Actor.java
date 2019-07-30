package com.asce4s.akkaintegration.config.interfaces;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public @interface Actor {
}
