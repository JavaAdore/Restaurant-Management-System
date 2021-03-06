/*
 * Created on 24 Mar 2016 ( Time 16:42:54 ) Generated by Telosys Tools Generator ( version 2.1.1 )
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
 * Persistent class for entity stored in table "res_customer_message"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_customer_message", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCustomerMessage.countAll",
    query = "SELECT COUNT(x) FROM ResCustomerMessage x")})
public class ResCustomerMessage extends AbstractEntity implements Serializable {
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
  @Column(name = "send_date", nullable = false)
  private Date sendDate;

  @Column(name = "subject", nullable = false, length = 150)
  private String subject;

  @Column(name = "message", nullable = false, length = 1000)
  private String message;

  @Column(name = "message_type", length = 255)
  private String messageType;

  // "sender" (column "sender") is not defined by itself because used as FK in a link
  // "receiver" (column "receiver") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "sender", referencedColumnName = "id")
  private ResUser resUser;

  @ManyToOne
  @JoinColumn(name = "receiver", referencedColumnName = "id")
  private ResCustomer resCustomer;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCustomerMessage() {
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
  // --- DATABASE MAPPING : send_date ( DATETIME )
  public void setSendDate(Date sendDate) {
    this.sendDate = sendDate;
  }

  public Date getSendDate() {
    return this.sendDate;
  }

  // --- DATABASE MAPPING : subject ( VARCHAR )
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getSubject() {
    return this.subject;
  }

  // --- DATABASE MAPPING : message ( VARCHAR )
  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  // --- DATABASE MAPPING : message_type ( VARCHAR )
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public String getMessageType() {
    return this.messageType;
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

  public void setResCustomer(ResCustomer resCustomer) {
    this.resCustomer = resCustomer;
  }

  public ResCustomer getResCustomer() {
    return this.resCustomer;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(sendDate);
    sb.append("|");
    sb.append(subject);
    sb.append("|");
    sb.append(message);
    sb.append("|");
    sb.append(messageType);
    return sb.toString();
  }

}
