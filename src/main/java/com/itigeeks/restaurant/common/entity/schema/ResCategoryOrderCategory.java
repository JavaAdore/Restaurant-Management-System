/*
 * Created on 24 Mar 2016 ( Time 16:42:53 ) Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite)

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Persistent class for entity stored in table "res_category_order_category"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_category_order_category", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCategoryOrderCategory.countAll",
    query = "SELECT COUNT(x) FROM ResCategoryOrderCategory x")})
public class ResCategoryOrderCategory extends AbstractEntity implements Serializable {
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
  // "orderCategoryId" (column "order_category_id") is not defined by itself because used as FK in a
  // link
  // "categoryId" (column "category_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "order_category_id", referencedColumnName = "id")
  private ResOrderCategory resOrderCategory;

  @ManyToOne
  @JoinColumn(name = "category_id", referencedColumnName = "id")
  private ResCategory resCategory;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCategoryOrderCategory() {
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

  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setResOrderCategory(ResOrderCategory resOrderCategory) {
    this.resOrderCategory = resOrderCategory;
  }

  public ResOrderCategory getResOrderCategory() {
    return this.resOrderCategory;
  }

  public void setResCategory(ResCategory resCategory) {
    this.resCategory = resCategory;
  }

  public ResCategory getResCategory() {
    return this.resCategory;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    return sb.toString();
  }

}
