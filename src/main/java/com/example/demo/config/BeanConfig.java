package com.example.demo.config;

import java.util.Calendar;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.controller.Game;

@Configuration
@ImportResource("classpath:application.xml")
@ComponentScan(basePackageClasses = BeanConfig.class)
public class BeanConfig {
    @Bean
    public Game game() {
    return new Game();
    }
    @Bean
    public String bean1 (){
        return new String("Bean 1");
    }
    @Bean
    public Random bean2 (){
        return new Random();
    }
    @Bean
    public Calendar bean3(){
        return Calendar.getInstance();
    }
    
}

// @ComponentScan(basePackages = "com.example.demo")
// public class BeanConfig {
    //         @Bean
    //         public Game game() {
        //         return new Game();
        //         }