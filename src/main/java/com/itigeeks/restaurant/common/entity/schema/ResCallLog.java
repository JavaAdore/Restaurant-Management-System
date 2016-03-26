/*
 * Created on 24 Mar 2016 ( Time 16:42:53 ) Generated by Telosys Tools Generator ( version 2.1.1 )
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;
import java.util.Date;

/**
 * Persistent class for entity stored in table "res_call_log"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_call_log", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCallLog.countAll",
    query = "SELECT COUNT(x) FROM ResCallLog x")})
public class ResCallLog extends AbstractEntity implements Serializable {
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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "call_date")
  private Date callDate;

  @Column(name = "number", length = 45)
  private String number;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  // "userId" (column "user_id") is not defined by itself because used as FK in a link
  // "terminalId" (column "terminal_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private ResUser resUser;

  @ManyToOne
  @JoinColumn(name = "terminal_id", referencedColumnName = "id")
  private ResTerminal resTerminal;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCallLog() {
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
  // --- DATABASE MAPPING : call_date ( DATETIME )
  public void setCallDate(Date callDate) {
    this.callDate = callDate;
  }

  public Date getCallDate() {
    return this.callDate;
  }

  // --- DATABASE MAPPING : number ( VARCHAR )
  public void setNumber(String number) {
    this.number = number;
  }

  public String getNumber() {
    return this.number;
  }

  // --- DATABASE MAPPING : is_active ( BIT )
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Boolean getIsActive() {
    return this.isActive;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setResUser(ResUser resUser) {
    this.resUser = resUser;
  }

  public ResUser getResUser() {
    return this.resUser;
  }

  public void setResTerminal(ResTerminal resTerminal) {
    this.resTerminal = resTerminal;
  }

  public ResTerminal getResTerminal() {
    return this.resTerminal;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(callDate);
    sb.append("|");
    sb.append(number);
    sb.append("|");
    sb.append(isActive);
    return sb.toString();
  }

}
