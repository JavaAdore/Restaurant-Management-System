/*
 * Created on 24 Mar 2016 ( Time 16:42:54 ) Generated by Telosys Tools Generator ( version 2.1.1 )
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
 * Persistent class for entity stored in table "res_message_status"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_message_status", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResMessageStatus.countAll",
    query = "SELECT COUNT(x) FROM ResMessageStatus x")})
public class ResMessageStatus extends AbstractEntity implements Serializable {
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
  // "messageId" (column "message_id") is not defined by itself because used as FK in a link
  // "reader" (column "reader") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "reader", referencedColumnName = "id")
  private ResUser resUser;

  @ManyToOne
  @JoinColumn(name = "message_id", referencedColumnName = "id")
  private ResMessage resMessage;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResMessageStatus() {
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
  public void setResUser(ResUser resUser) {
    this.resUser = resUser;
  }

  public ResUser getResUser() {
    return this.resUser;
  }

  public void setResMessage(ResMessage resMessage) {
    this.resMessage = resMessage;
  }

  public ResMessage getResMessage() {
    return this.resMessage;
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
