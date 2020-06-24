package com.moth.jdbcexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.moth.jdbcexam.dao"})
@Import({DBConfig.class})
public class ApplicationConfig {

}