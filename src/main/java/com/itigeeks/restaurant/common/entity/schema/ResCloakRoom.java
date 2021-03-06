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
 * Persistent class for entity stored in table "res_cloak_room"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_cloak_room", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCloakRoom.countAll",
    query = "SELECT COUNT(x) FROM ResCloakRoom x")})
public class ResCloakRoom extends AbstractEntity implements Serializable {
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
  @Column(name = "no_of_items", nullable = false)
  private Short noOfItems;

  @Column(name = "is_collected", nullable = false)
  private Boolean isCollected;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_update", nullable = false)
  private Date lastUpdate;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  @Column(name = "has_items_brought_to_customer", nullable = false)
  private Boolean hasItemsBroughtToCustomer;

  @Column(name = "is_customer_items_prepared", nullable = false)
  private Boolean isCustomerItemsPrepared;

  // "customerId" (column "customer_id") is not defined by itself because used as FK in a link
  // "tableId" (column "table_id") is not defined by itself because used as FK in a link
  // "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a
  // link
  // "statusId" (column "status_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "status_id", referencedColumnName = "id")
  private ResCloakRoomStatus resCloakRoomStatus;

  @ManyToOne
  @JoinColumn(name = "table_id", referencedColumnName = "id")
  private ResTable resTable;

  @ManyToOne
  @JoinColumn(name = "customer_id", referencedColumnName = "id")
  private ResCustomer resCustomer;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", referencedColumnName = "id")
  private ResUser resUser;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCloakRoom() {
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
  // --- DATABASE MAPPING : no_of_items ( SMALLINT )
  public void setNoOfItems(Short noOfItems) {
    this.noOfItems = noOfItems;
  }

  public Short getNoOfItems() {
    return this.noOfItems;
  }

  // --- DATABASE MAPPING : is_collected ( BIT )
  public void setIsCollected(Boolean isCollected) {
    this.isCollected = isCollected;
  }

  public Boolean getIsCollected() {
    return this.isCollected;
  }

  // --- DATABASE MAPPING : last_update ( DATETIME )
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Date getLastUpdate() {
    return this.lastUpdate;
  }

  // --- DATABASE MAPPING : is_active ( BIT )
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Boolean getIsActive() {
    return this.isActive;
  }

  // --- DATABASE MAPPING : has_items_brought_to_customer ( BIT )
  public void setHasItemsBroughtToCustomer(Boolean hasItemsBroughtToCustomer) {
    this.hasItemsBroughtToCustomer = hasItemsBroughtToCustomer;
  }

  public Boolean getHasItemsBroughtToCustomer() {
    return this.hasItemsBroughtToCustomer;
  }

  // --- DATABASE MAPPING : is_customer_items_prepared ( BIT )
  public void setIsCustomerItemsPrepared(Boolean isCustomerItemsPrepared) {
    this.isCustomerItemsPrepared = isCustomerItemsPrepared;
  }

  public Boolean getIsCustomerItemsPrepared() {
    return this.isCustomerItemsPrepared;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setResCloakRoomStatus(ResCloakRoomStatus resCloakRoomStatus) {
    this.resCloakRoomStatus = resCloakRoomStatus;
  }

  public ResCloakRoomStatus getResCloakRoomStatus() {
    return this.resCloakRoomStatus;
  }

  public void setResTable(ResTable resTable) {
    this.resTable = resTable;
  }

  public ResTable getResTable() {
    return this.resTable;
  }

  public void setResCustomer(ResCustomer resCustomer) {
    this.resCustomer = resCustomer;
  }

  public ResCustomer getResCustomer() {
    return this.resCustomer;
  }

  public void setResUser(ResUser resUser) {
    this.resUser = resUser;
  }

  public ResUser getResUser() {
    return this.resUser;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(noOfItems);
    sb.append("|");
    sb.append(isCollected);
    sb.append("|");
    sb.append(lastUpdate);
    sb.append("|");
    sb.append(isActive);
    sb.append("|");
    sb.append(hasItemsBroughtToCustomer);
    sb.append("|");
    sb.append(isCustomerItemsPrepared);
    return sb.toString();
  }

}
