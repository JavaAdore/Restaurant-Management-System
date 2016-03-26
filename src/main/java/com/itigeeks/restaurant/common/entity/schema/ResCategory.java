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
 * Persistent class for entity stored in table "res_category"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_category", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResCategory.countAll",
    query = "SELECT COUNT(x) FROM ResCategory x")})
public class ResCategory extends AbstractEntity implements Serializable {
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
  @Column(name = "sequence_number", nullable = false)
  private Short sequenceNumber;

  @Column(name = "category_name", nullable = false, length = 100)
  private String categoryName;

  @Column(name = "description", length = 150)
  private String description;

  @Column(name = "top_color", nullable = false, length = 9)
  private String topColor;

  @Column(name = "bottom_color", nullable = false, length = 9)
  private String bottomColor;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_update", nullable = false)
  private Date lastUpdate;

  @Column(name = "is_bar", nullable = false)
  private Boolean isBar;

  // "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a
  // link
  // "parentId" (column "parent_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "last_updated_by", referencedColumnName = "id")
  private ResUser resUser;

  @OneToMany(mappedBy = "resCategory", targetEntity = ResPrintBlockCategory.class)
  private List<ResPrintBlockCategory> listOfResPrintBlockCategory;

  @ManyToOne
  @JoinColumn(name = "parent_id", referencedColumnName = "id")
  private ResCategory resCategory;

  @OneToMany(mappedBy = "resCategory", targetEntity = ResAdditionalCompanyCategory.class)
  private List<ResAdditionalCompanyCategory> listOfResAdditionalCompanyCategory;

  @OneToMany(mappedBy = "resCategory", targetEntity = ResCategoryOrderCategory.class)
  private List<ResCategoryOrderCategory> listOfResCategoryOrderCategory;

  @OneToMany(mappedBy = "resCategory", targetEntity = ResCategory.class)
  private List<ResCategory> listOfResCategory;

  @OneToMany(mappedBy = "resCategory", targetEntity = ResProduct.class)
  private List<ResProduct> listOfResProduct;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResCategory() {
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
  // --- DATABASE MAPPING : sequence_number ( SMALLINT )
  public void setSequenceNumber(Short sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public Short getSequenceNumber() {
    return this.sequenceNumber;
  }

  // --- DATABASE MAPPING : category_name ( VARCHAR )
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getCategoryName() {
    return this.categoryName;
  }

  // --- DATABASE MAPPING : description ( VARCHAR )
  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  // --- DATABASE MAPPING : top_color ( VARCHAR )
  public void setTopColor(String topColor) {
    this.topColor = topColor;
  }

  public String getTopColor() {
    return this.topColor;
  }

  // --- DATABASE MAPPING : bottom_color ( VARCHAR )
  public void setBottomColor(String bottomColor) {
    this.bottomColor = bottomColor;
  }

  public String getBottomColor() {
    return this.bottomColor;
  }

  // --- DATABASE MAPPING : is_active ( BIT )
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Boolean getIsActive() {
    return this.isActive;
  }

  // --- DATABASE MAPPING : last_update ( DATETIME )
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Date getLastUpdate() {
    return this.lastUpdate;
  }

  // --- DATABASE MAPPING : is_bar ( BIT )
  public void setIsBar(Boolean isBar) {
    this.isBar = isBar;
  }

  public Boolean getIsBar() {
    return this.isBar;
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

  public void setListOfResPrintBlockCategory(List<ResPrintBlockCategory> listOfResPrintBlockCategory) {
    this.listOfResPrintBlockCategory = listOfResPrintBlockCategory;
  }

  public List<ResPrintBlockCategory> getListOfResPrintBlockCategory() {
    return this.listOfResPrintBlockCategory;
  }

  public void setResCategory(ResCategory resCategory) {
    this.resCategory = resCategory;
  }

  public ResCategory getResCategory() {
    return this.resCategory;
  }

  public void setListOfResAdditionalCompanyCategory(
      List<ResAdditionalCompanyCategory> listOfResAdditionalCompanyCategory) {
    this.listOfResAdditionalCompanyCategory = listOfResAdditionalCompanyCategory;
  }

  public List<ResAdditionalCompanyCategory> getListOfResAdditionalCompanyCategory() {
    return this.listOfResAdditionalCompanyCategory;
  }

  public void setListOfResCategoryOrderCategory(
      List<ResCategoryOrderCategory> listOfResCategoryOrderCategory) {
    this.listOfResCategoryOrderCategory = listOfResCategoryOrderCategory;
  }

  public List<ResCategoryOrderCategory> getListOfResCategoryOrderCategory() {
    return this.listOfResCategoryOrderCategory;
  }

  public void setListOfResCategory(List<ResCategory> listOfResCategory) {
    this.listOfResCategory = listOfResCategory;
  }

  public List<ResCategory> getListOfResCategory() {
    return this.listOfResCategory;
  }

  public void setListOfResProduct(List<ResProduct> listOfResProduct) {
    this.listOfResProduct = listOfResProduct;
  }

  public List<ResProduct> getListOfResProduct() {
    return this.listOfResProduct;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(sequenceNumber);
    sb.append("|");
    sb.append(categoryName);
    sb.append("|");
    sb.append(description);
    sb.append("|");
    sb.append(topColor);
    sb.append("|");
    sb.append(bottomColor);
    sb.append("|");
    sb.append(isActive);
    sb.append("|");
    sb.append(lastUpdate);
    sb.append("|");
    sb.append(isBar);
    return sb.toString();
  }

}
