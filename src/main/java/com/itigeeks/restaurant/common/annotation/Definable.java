package com.itigeeks.restaurant.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Definable {

  public String fileName();
}
