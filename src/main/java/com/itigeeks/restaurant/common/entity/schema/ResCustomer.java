/*
 * Created on 24 Mar 2016 ( Time 16:42:53 ) Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite)

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itigeeks.restaurant.common.annotation.DisplayOrder;
import com.itigeeks.restaurant.common.entity.AbstractEntity;
// import javax.validation.constraints.* ;
// import org.hibernate.validator.constraints.* ;

/**
 * Persistent class for entity stored in table "res_customer"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_customer", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCustomer.countAll",
    query = "SELECT COUNT(x) FROM ResCustomer x")})
public class ResCustomer extends AbstractEntity implements Serializable {
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
  @Column(name = "customer_key", nullable = false, length = 10)
  private String customerKey;

  @Column(name = "available_credit", nullable = false)
  private Integer availableCredit;

  @DisplayOrder
  @Column(name = "customer_name", nullable = false, length = 50)
  private String customerName;

  @Column(name = "house_no", length = 150)
  private String houseNo;

  @Column(name = "house_name", length = 150)
  private String houseName;

  @Column(name = "street", length = 150)
  private String street;

  @Column(name = "post_code", length = 150)
  private String postCode;
  @DisplayOrder
  @Column(name = "email", length = 50)
  private String email;
  @DisplayOrder
  @Column(name = "mobile", length = 50)
  private String mobile;

  @Column(name = "land_line", length = 50)
  private String landLine;

  @Column(name = "membership_no", length = 50)
  private String membershipNo;

  @Column(name = "membership_points")
  private Integer membershipPoints;

  @Column(name = "dist", length = 50)
  private String dist;

  @Temporal(TemporalType.DATE)
  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Temporal(TemporalType.DATE)
  @Column(name = "anniversary_date")
  private Date anniversaryDate;

  @Column(name = "user_name", length = 150)
  private String userName;

  @Column(name = "password", length = 40)
  private String password;

  @Column(name = "ip_address", length = 15)
  private String ipAddress;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_activity")
  private Date lastActivity;

  // "townId" (column "town_id") is not defined by itself because used as FK in a link
  // "stateId" (column "state_id") is not defined by itself because used as FK in a link
  // "countryId" (column "country_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resCustomer", targetEntity = ResFlaggedOccassion.class)
  private List<ResFlaggedOccassion> listOfResFlaggedOccassion;

  @ManyToOne
  @JoinColumn(name = "state_id", referencedColumnName = "id")
  private ResState resState;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResTableTransactions.class)
  private List<ResTableTransactions> listOfResTableTransactions;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResOrder.class)
  private List<ResOrder> listOfResOrder;

  @ManyToOne
  @JoinColumn(name = "town_id", referencedColumnName = "id")
  private ResCity resCity;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResCustomerMessage.class)
  private List<ResCustomerMessage> listOfResCustomerMessage;

  @ManyToOne
  @JoinColumn(name = "country_id", referencedColumnName = "id")
  private ResCountry resCountry;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResCustomerAddress.class)
  private List<ResCustomerAddress> listOfResCustomerAddress;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResConvertedToTakeAway.class)
  private List<ResConvertedToTakeAway> listOfResConvertedToTakeAway;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResReservation.class)
  private List<ResReservation> listOfResReservation;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResVoucher.class)
  private List<ResVoucher> listOfResVoucher;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResCustomerComment.class)
  private List<ResCustomerComment> listOfResCustomerComment;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResCloakRoom.class)
  private List<ResCloakRoom> listOfResCloakRoom;

  @OneToMany(mappedBy = "resCustomer", targetEntity = ResOrderReplica.class)
  private List<ResOrderReplica> listOfResOrderReplica;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCustomer() {
    super();
  }

  public ResCustomer(Long id) {
    super();
    this.id = id;
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
  // --- DATABASE MAPPING : customer_key ( VARCHAR )
  public void setCustomerKey(String customerKey) {
    this.customerKey = customerKey;
  }

  public String getCustomerKey() {
    return this.customerKey;
  }

  // --- DATABASE MAPPING : available_credit ( DECIMAL )
  public void setAvailableCredit(Integer availableCredit) {
    this.availableCredit = availableCredit;
  }

  public Integer getAvailableCredit() {
    return this.availableCredit;
  }

  // --- DATABASE MAPPING : customer_name ( VARCHAR )
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  // --- DATABASE MAPPING : house_no ( VARCHAR )
  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public String getHouseNo() {
    return this.houseNo;
  }

  // --- DATABASE MAPPING : house_name ( VARCHAR )
  public void setHouseName(String houseName) {
    this.houseName = houseName;
  }

  public String getHouseName() {
    return this.houseName;
  }

  // --- DATABASE MAPPING : street ( VARCHAR )
  public void setStreet(String street) {
    this.street = street;
  }

  public String getStreet() {
    return this.street;
  }

  // --- DATABASE MAPPING : post_code ( VARCHAR )
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getPostCode() {
    return this.postCode;
  }

  // --- DATABASE MAPPING : email ( VARCHAR )
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  // --- DATABASE MAPPING : mobile ( VARCHAR )
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getMobile() {
    return this.mobile;
  }

  // --- DATABASE MAPPING : land_line ( VARCHAR )
  public void setLandLine(String landLine) {
    this.landLine = landLine;
  }

  public String getLandLine() {
    return this.landLine;
  }

  // --- DATABASE MAPPING : membership_no ( VARCHAR )
  public void setMembershipNo(String membershipNo) {
    this.membershipNo = membershipNo;
  }

  public String getMembershipNo() {
    return this.membershipNo;
  }

  // --- DATABASE MAPPING : membership_points ( INT )
  public void setMembershipPoints(Integer membershipPoints) {
    this.membershipPoints = membershipPoints;
  }

  public Integer getMembershipPoints() {
    return this.membershipPoints;
  }

  // --- DATABASE MAPPING : dist ( VARCHAR )
  public void setDist(String dist) {
    this.dist = dist;
  }

  public String getDist() {
    return this.dist;
  }

  // --- DATABASE MAPPING : date_of_birth ( DATE )
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }

  // --- DATABASE MAPPING : anniversary_date ( DATE )
  public void setAnniversaryDate(Date anniversaryDate) {
    this.anniversaryDate = anniversaryDate;
  }

  public Date getAnniversaryDate() {
    return this.anniversaryDate;
  }

  // --- DATABASE MAPPING : user_name ( VARCHAR )
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return this.userName;
  }

  // --- DATABASE MAPPING : password ( VARCHAR )
  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return this.password;
  }

  // --- DATABASE MAPPING : ip_address ( VARCHAR )
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  // --- DATABASE MAPPING : last_activity ( DATETIME )
  public void setLastActivity(Date lastActivity) {
    this.lastActivity = lastActivity;
  }

  public Date getLastActivity() {
    return this.lastActivity;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResFlaggedOccassion(List<ResFlaggedOccassion> listOfResFlaggedOccassion) {
    this.listOfResFlaggedOccassion = listOfResFlaggedOccassion;
  }

  public List<ResFlaggedOccassion> getListOfResFlaggedOccassion() {
    return this.listOfResFlaggedOccassion;
  }

  public void setResState(ResState resState) {
    this.resState = resState;
  }

  public ResState getResState() {
    return this.resState;
  }

  public void setListOfResTableTransactions(List<ResTableTransactions> listOfResTableTransactions) {
    this.listOfResTableTransactions = listOfResTableTransactions;
  }

  public List<ResTableTransactions> getListOfResTableTransactions() {
    return this.listOfResTableTransactions;
  }

  public void setListOfResOrder(List<ResOrder> listOfResOrder) {
    this.listOfResOrder = listOfResOrder;
  }

  public List<ResOrder> getListOfResOrder() {
    return this.listOfResOrder;
  }

  public void setResCity(ResCity resCity) {
    this.resCity = resCity;
  }

  public ResCity getResCity() {
    return this.resCity;
  }

  public void setListOfResCustomerMessage(List<ResCustomerMessage> listOfResCustomerMessage) {
    this.listOfResCustomerMessage = listOfResCustomerMessage;
  }

  public List<ResCustomerMessage> getListOfResCustomerMessage() {
    return this.listOfResCustomerMessage;
  }

  public void setResCountry(ResCountry resCountry) {
    this.resCountry = resCountry;
  }

  public ResCountry getResCountry() {
    return this.resCountry;
  }

  public void setListOfResCustomerAddress(List<ResCustomerAddress> listOfResCustomerAddress) {
    this.listOfResCustomerAddress = listOfResCustomerAddress;
  }

  public List<ResCustomerAddress> getListOfResCustomerAddress() {
    return this.listOfResCustomerAddress;
  }

  public void setListOfResConvertedToTakeAway(
      List<ResConvertedToTakeAway> listOfResConvertedToTakeAway) {
    this.listOfResConvertedToTakeAway = listOfResConvertedToTakeAway;
  }

  public List<ResConvertedToTakeAway> getListOfResConvertedToTakeAway() {
    return this.listOfResConvertedToTakeAway;
  }

  public void setListOfResReservation(List<ResReservation> listOfResReservation) {
    this.listOfResReservation = listOfResReservation;
  }

  public List<ResReservation> getListOfResReservation() {
    return this.listOfResReservation;
  }

  public void setListOfResVoucher(List<ResVoucher> listOfResVoucher) {
    this.listOfResVoucher = listOfResVoucher;
  }

  public List<ResVoucher> getListOfResVoucher() {
    return this.listOfResVoucher;
  }

  public void setListOfResCustomerComment(List<ResCustomerComment> listOfResCustomerComment) {
    this.listOfResCustomerComment = listOfResCustomerComment;
  }

  public List<ResCustomerComment> getListOfResCustomerComment() {
    return this.listOfResCustomerComment;
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


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(customerKey);
    sb.append("|");
    sb.append(availableCredit);
    sb.append("|");
    sb.append(customerName);
    sb.append("|");
    sb.append(houseNo);
    sb.append("|");
    sb.append(houseName);
    sb.append("|");
    sb.append(street);
    sb.append("|");
    sb.append(postCode);
    sb.append("|");
    sb.append(email);
    sb.append("|");
    sb.append(mobile);
    sb.append("|");
    sb.append(landLine);
    sb.append("|");
    sb.append(membershipNo);
    sb.append("|");
    sb.append(membershipPoints);
    sb.append("|");
    sb.append(dist);
    sb.append("|");
    sb.append(dateOfBirth);
    sb.append("|");
    sb.append(anniversaryDate);
    sb.append("|");
    sb.append(userName);
    sb.append("|");
    sb.append(password);
    sb.append("|");
    sb.append(ipAddress);
    sb.append("|");
    sb.append(lastActivity);
    return sb.toString();
  }

}
