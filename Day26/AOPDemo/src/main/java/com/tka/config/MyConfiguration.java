package com.tka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.tka"})
@EnableAspectJAutoProxy
public class MyConfiguration {

}
