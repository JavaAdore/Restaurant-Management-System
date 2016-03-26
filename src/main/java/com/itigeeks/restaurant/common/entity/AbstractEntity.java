package com.itigeeks.restaurant.common.entity;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;


  public abstract void setId(Long id);

  public abstract Long getId();



}
