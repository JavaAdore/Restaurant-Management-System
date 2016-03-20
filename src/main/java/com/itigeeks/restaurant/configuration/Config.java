package com.itigeeks.restaurant.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

@ImportResource(locations={"classpath:/spring-context.xml","classpath:/database.xml"})
public class Config {

} 
