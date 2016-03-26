package com.itigeeks.restaurant.common.dto;

import java.io.Serializable;

public class CustomCriteria implements Serializable {

  private static final long serialVersionUID = 1L;


  public enum Criteria {

    GREATER_THAN(" > "), LESS_THAN(" < "), EQUAL(" = "), GREATER_THAN_OR_EQUAL(" >= "), LESS_THAN_OR_EQUAL(
        " <= ");
    private String value;

    Criteria(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

  }


  private Object criteriaValue;
  private Criteria criteria = Criteria.EQUAL;


  public CustomCriteria() {

  }



  public CustomCriteria(Criteria criteria) {
    super();
    this.criteria = criteria;
  }



  public CustomCriteria(Object criteriaValue, Criteria criteria) {
    super();
    this.criteriaValue = criteriaValue;
    this.criteria = criteria;
  }



  public Criteria getCriteria() {
    return criteria;
  }

  public void setCriteria(Criteria criteria) {
    this.criteria = criteria;
  }

  public CustomCriteria(Object criteria) {
    super();
    this.criteriaValue = criteria;
  }

  public Object getCriteriaValue() {
    return criteriaValue;
  }

  public void setCriteriaValue(Object criteria) {
    this.criteriaValue = criteria;
  }
}
