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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;
import java.util.Date;
import java.util.List;

/**
 * Persistent class for entity stored in table "res_table"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_table", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResTable.countAll", query = "SELECT COUNT(x) FROM ResTable x")})
public class ResTable extends AbstractEntity implements Serializable {
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
  @Column(name = "table_number", nullable = false, length = 45)
  private String tableNumber;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  @Column(name = "hold_table")
  private Boolean holdTable;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_update", nullable = false)
  private Date lastUpdate;

  @Column(name = "sequence_no")
  private Short sequenceNo;

  // "floorId" (column "floor_id") is not defined by itself because used as FK in a link
  // "userId" (column "user_id") is not defined by itself because used as FK in a link
  // "statusId" (column "status_id") is not defined by itself because used as FK in a link
  // "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a
  // link
  // "prepLocationId" (column "prep_location_id") is not defined by itself because used as FK in a
  // link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resTable", targetEntity = ResTableTransactions.class)
  private List<ResTableTransactions> listOfResTableTransactions;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", referencedColumnName = "id")
  private ResUser resUser2;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private ResUser resUser;

  @OneToMany(mappedBy = "resTable", targetEntity = ResOrder.class)
  private List<ResOrder> listOfResOrder;

  @ManyToOne
  @JoinColumn(name = "floor_id", referencedColumnName = "id")
  private ResFloor resFloor;

  @OneToMany(mappedBy = "resTable", targetEntity = ResCloakRoom.class)
  private List<ResCloakRoom> listOfResCloakRoom;

  @OneToMany(mappedBy = "resTable", targetEntity = ResOrderReplica.class)
  private List<ResOrderReplica> listOfResOrderReplica;

  @OneToMany(mappedBy = "resTable", targetEntity = ResReservation.class)
  private List<ResReservation> listOfResReservation;

  @ManyToOne
  @JoinColumn(name = "prep_location_id", referencedColumnName = "id")
  private ResPrepLocation resPrepLocation;

  @ManyToOne
  @JoinColumn(name = "status_id", referencedColumnName = "id")
  private ResStatus resStatus;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResTable() {
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
  // --- DATABASE MAPPING : table_number ( VARCHAR )
  public void setTableNumber(String tableNumber) {
    this.tableNumber = tableNumber;
  }

  public String getTableNumber() {
    return this.tableNumber;
  }

  // --- DATABASE MAPPING : is_active ( BIT )
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Boolean getIsActive() {
    return this.isActive;
  }

  // --- DATABASE MAPPING : hold_table ( BIT )
  public void setHoldTable(Boolean holdTable) {
    this.holdTable = holdTable;
  }

  public Boolean getHoldTable() {
    return this.holdTable;
  }

  // --- DATABASE MAPPING : last_update ( DATETIME )
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Date getLastUpdate() {
    return this.lastUpdate;
  }

  // --- DATABASE MAPPING : sequence_no ( SMALLINT )
  public void setSequenceNo(Short sequenceNo) {
    this.sequenceNo = sequenceNo;
  }

  public Short getSequenceNo() {
    return this.sequenceNo;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResTableTransactions(List<ResTableTransactions> listOfResTableTransactions) {
    this.listOfResTableTransactions = listOfResTableTransactions;
  }

  public List<ResTableTransactions> getListOfResTableTransactions() {
    return this.listOfResTableTransactions;
  }

  public void setResUser2(ResUser resUser2) {
    this.resUser2 = resUser2;
  }

  public ResUser getResUser2() {
    return this.resUser2;
  }

  public void setResUser(ResUser resUser) {
    this.resUser = resUser;
  }

  public ResUser getResUser() {
    return this.resUser;
  }

  public void setListOfResOrder(List<ResOrder> listOfResOrder) {
    this.listOfResOrder = listOfResOrder;
  }

  public List<ResOrder> getListOfResOrder() {
    return this.listOfResOrder;
  }

  public void setResFloor(ResFloor resFloor) {
    this.resFloor = resFloor;
  }

  public ResFloor getResFloor() {
    return this.resFloor;
  }

  public void setListOfResCloakRoom(List<ResCloakRoom> listOfResCloakRoom) {
    this.listOfResCloakRoom = listOfResCloakRoom;
  }

  public List<ResCloakRoom> getListOfResCloakRoom() {
    return this.listOfResCloakRoom;
  }

  public void setListOfResOrderReplica(List<ResOrderReplica> listOfResOrderReplica) {
    this.listOfResOrderReplica = listOfResOrderReplica;
  }

  public List<ResOrderReplica> getListOfResOrderReplica() {
    return this.listOfResOrderReplica;
  }

  public void setListOfResReservation(List<ResReservation> listOfResReservation) {
    this.listOfResReservation = listOfResReservation;
  }

  public List<ResReservation> getListOfResReservation() {
    return this.listOfResReservation;
  }

  public void setResPrepLocation(ResPrepLocation resPrepLocation) {
    this.resPrepLocation = resPrepLocation;
  }

  public ResPrepLocation getResPrepLocation() {
    return this.resPrepLocation;
  }

  public void setResStatus(ResStatus resStatus) {
    this.resStatus = resStatus;
  }

  public ResStatus getResStatus() {
    return this.resStatus;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(tableNumber);
    sb.append("|");
    sb.append(isActive);
    sb.append("|");
    sb.append(holdTable);
    sb.append("|");
    sb.append(lastUpdate);
    sb.append("|");
    sb.append(sequenceNo);
    return sb.toString();
  }

}
