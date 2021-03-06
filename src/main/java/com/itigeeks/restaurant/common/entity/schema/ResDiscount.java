/*
 * Created on 24 Mar 2016 ( Time 16:42:54 ) Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite)

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;


/**
 * Persistent class for entity stored in table "res_discount"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_discount", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResDiscount.countAll",
    query = "SELECT COUNT(x) FROM ResDiscount x")})
public class ResDiscount extends AbstractEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  // ----------------------------------------------------------------------
  // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
  // ----------------------------------------------------------------------
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;


  // ----------------------------------------------------------------------
  // ENTITY DATA FIELDS
  // ----------------------------------------------------------------------
  @Column(name = "week_day", nullable = false)
  private Short weekDay;

  @Column(name = "discount_rate", nullable = false)
  private Integer discountRate;

  @Column(name = "is_flat", nullable = false)
  private Boolean isFlat;

  @Column(name = "minimum_value", nullable = false)
  private Integer minimumValue;

  // "orderType" (column "order_type") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resDiscount", targetEntity = ResDiscountProduct.class)
  private List<ResDiscountProduct> listOfResDiscountProduct;

  @ManyToOne
  @JoinColumn(name = "order_type", referencedColumnName = "id")
  private ResOrderType resOrderType;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResDiscount() {
    super();
  }

  // ----------------------------------------------------------------------
  // GETTER & SETTER FOR THE KEY FIELD
  // ----------------------------------------------------------------------
  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return this.id;
  }

  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR FIELDS
  // ----------------------------------------------------------------------
  // --- DATABASE MAPPING : week_day ( SMALLINT )
  public void setWeekDay(Short weekDay) {
    this.weekDay = weekDay;
  }

  public Short getWeekDay() {
    return this.weekDay;
  }

  // --- DATABASE MAPPING : discount_rate ( DECIMAL )
  public void setDiscountRate(Integer discountRate) {
    this.discountRate = discountRate;
  }

  public Integer getDiscountRate() {
    return this.discountRate;
  }

  // --- DATABASE MAPPING : is_flat ( BIT )
  public void setIsFlat(Boolean isFlat) {
    this.isFlat = isFlat;
  }

  public Boolean getIsFlat() {
    return this.isFlat;
  }

  // --- DATABASE MAPPING : minimum_value ( DECIMAL )
  public void setMinimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  public Integer getMinimumValue() {
    return this.minimumValue;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResDiscountProduct(List<ResDiscountProduct> listOfResDiscountProduct) {
    this.listOfResDiscountProduct = listOfResDiscountProduct;
  }

  public List<ResDiscountProduct> getListOfResDiscountProduct() {
    return this.listOfResDiscountProduct;
  }

  public void setResOrderType(ResOrderType resOrderType) {
    this.resOrderType = resOrderType;
  }

  public ResOrderType getResOrderType() {
    return this.resOrderType;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(weekDay);
    sb.append("|");
    sb.append(discountRate);
    sb.append("|");
    sb.append(isFlat);
    sb.append("|");
    sb.append(minimumValue);
    return sb.toString();
  }

}
