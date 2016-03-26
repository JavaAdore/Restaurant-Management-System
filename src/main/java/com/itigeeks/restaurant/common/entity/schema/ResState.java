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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;
import java.util.List;

/**
 * Persistent class for entity stored in table "res_state"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_state", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResState.countAll", query = "SELECT COUNT(x) FROM ResState x")})
public class ResState extends AbstractEntity implements Serializable {
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
  @Column(name = "state_name", nullable = false, length = 150)
  private String stateName;



  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resState", targetEntity = ResCustomer.class)
  private List<ResCustomer> listOfResCustomer;

  @OneToMany(mappedBy = "resState", targetEntity = ResCustomerAddress.class)
  private List<ResCustomerAddress> listOfResCustomerAddress;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResState() {
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
  // --- DATABASE MAPPING : state_name ( VARCHAR )
  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getStateName() {
    return this.stateName;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResCustomer(List<ResCustomer> listOfResCustomer) {
    this.listOfResCustomer = listOfResCustomer;
  }

  public List<ResCustomer> getListOfResCustomer() {
    return this.listOfResCustomer;
  }

  public void setListOfResCustomerAddress(List<ResCustomerAddress> listOfResCustomerAddress) {
    this.listOfResCustomerAddress = listOfResCustomerAddress;
  }

  public List<ResCustomerAddress> getListOfResCustomerAddress() {
    return this.listOfResCustomerAddress;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(stateName);
    return sb.toString();
  }

}
