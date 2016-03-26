package com.itigeeks.restaurant.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ImportResource(locations = {"classpath:/spring-context.xml", "classpath:/database.xml"})
@PropertySource("classpath:config.properties")
public class Config {

  @Value(value="${application.default.date.format}?: dd/mm/yyyy")
  private String defaultDateFormat;
  
  public String getDefaultDateFormat()
  {
    return defaultDateFormat;
  }
  
}
