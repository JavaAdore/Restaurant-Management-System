/*
 * Created on 24 Mar 2016 ( Time 16:42:57 ) Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite)

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;

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

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;


/**
 * Persistent class for entity stored in table "res_special_instructions"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_special_instructions", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResSpecialInstructions.countAll",
    query = "SELECT COUNT(x) FROM ResSpecialInstructions x")})
public class ResSpecialInstructions extends AbstractEntity implements Serializable {
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
  @Column(name = "instruction", nullable = false, length = 500)
  private String instruction;

  @Column(name = "price", nullable = false)
  private Integer price;

  // "orderChildId" (column "order_child_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "order_child_id", referencedColumnName = "id")
  private ResOrderChild resOrderChild;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResSpecialInstructions() {
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
  // --- DATABASE MAPPING : instruction ( VARCHAR )
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public String getInstruction() {
    return this.instruction;
  }

  // --- DATABASE MAPPING : price ( DECIMAL )
  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getPrice() {
    return this.price;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setResOrderChild(ResOrderChild resOrderChild) {
    this.resOrderChild = resOrderChild;
  }

  public ResOrderChild getResOrderChild() {
    return this.resOrderChild;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(instruction);
    sb.append("|");
    sb.append(price);
    return sb.toString();
  }

}
