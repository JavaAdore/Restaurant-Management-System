package com.itigeeks.restaurant.common.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.itigeeks.restaurant.Lanucher;

public class BeanFactory {
  private final static ApplicationContext context;
  static {
    context = SpringApplication.run(Lanucher.class, "");

  }


  public static <T> T getBean(Class<T> cls) {
    return context.getBean(cls);
  }
}
