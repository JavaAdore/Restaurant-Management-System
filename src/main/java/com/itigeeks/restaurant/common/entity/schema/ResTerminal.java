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
 * Persistent class for entity stored in table "res_terminal"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_terminal", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResTerminal.countAll",
    query = "SELECT COUNT(x) FROM ResTerminal x")})
public class ResTerminal extends AbstractEntity implements Serializable {
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
  @Column(name = "terminal_name", nullable = false, length = 100)
  private String terminalName;

  @Column(name = "mac_address", nullable = false, length = 100)
  private String macAddress;



  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resTerminal", targetEntity = ResZreportLog.class)
  private List<ResZreportLog> listOfResZreportLog;

  @OneToMany(mappedBy = "resTerminal", targetEntity = ResCallLog.class)
  private List<ResCallLog> listOfResCallLog;

  @OneToMany(mappedBy = "resTerminal", targetEntity = ResPayment.class)
  private List<ResPayment> listOfResPayment;

  @OneToMany(mappedBy = "resTerminal", targetEntity = ResOrderDeleteLog.class)
  private List<ResOrderDeleteLog> listOfResOrderDeleteLog;

  @OneToMany(mappedBy = "resTerminal", targetEntity = ResLog.class)
  private List<ResLog> listOfResLog;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResTerminal() {
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
  // --- DATABASE MAPPING : terminal_name ( VARCHAR )
  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }

  public String getTerminalName() {
    return this.terminalName;
  }

  // --- DATABASE MAPPING : mac_address ( VARCHAR )
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public String getMacAddress() {
    return this.macAddress;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResZreportLog(List<ResZreportLog> listOfResZreportLog) {
    this.listOfResZreportLog = listOfResZreportLog;
  }

  public List<ResZreportLog> getListOfResZreportLog() {
    return this.listOfResZreportLog;
  }

  public void setListOfResCallLog(List<ResCallLog> listOfResCallLog) {
    this.listOfResCallLog = listOfResCallLog;
  }

  public List<ResCallLog> getListOfResCallLog() {
    return this.listOfResCallLog;
  }

  public void setListOfResPayment(List<ResPayment> listOfResPayment) {
    this.listOfResPayment = listOfResPayment;
  }

  public List<ResPayment> getListOfResPayment() {
    return this.listOfResPayment;
  }

  public void setListOfResOrderDeleteLog(List<ResOrderDeleteLog> listOfResOrderDeleteLog) {
    this.listOfResOrderDeleteLog = listOfResOrderDeleteLog;
  }

  public List<ResOrderDeleteLog> getListOfResOrderDeleteLog() {
    return this.listOfResOrderDeleteLog;
  }

  public void setListOfResLog(List<ResLog> listOfResLog) {
    this.listOfResLog = listOfResLog;
  }

  public List<ResLog> getListOfResLog() {
    return this.listOfResLog;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(terminalName);
    sb.append("|");
    sb.append(macAddress);
    return sb.toString();
  }

}
