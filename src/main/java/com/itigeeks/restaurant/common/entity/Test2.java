package com.itigeeks.restaurant.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Test2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue 
	private Long id;
 
	  
	private String notNullName;

	public String getNotNullName() {
		return notNullName;
	}


	public void setNotNullName(String notNullName) {
		this.notNullName = notNullName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
