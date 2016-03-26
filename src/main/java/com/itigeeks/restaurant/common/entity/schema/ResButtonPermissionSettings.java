/*
 * Created on 24 Mar 2016 ( Time 16:42:53 ) Generated by Telosys Tools Generator ( version 2.1.1 )
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
 * Persistent class for entity stored in table "res_button_permission_settings"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_button_permission_settings", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResButtonPermissionSettings.countAll",
    query = "SELECT COUNT(x) FROM ResButtonPermissionSettings x")})
public class ResButtonPermissionSettings extends AbstractEntity implements Serializable {
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
  @Column(name = "value", nullable = false)
  private String value;

  // "permissionTypeId" (column "permission_type_id") is not defined by itself because used as FK in
  // a link
  // "userId" (column "user_id") is not defined by itself because used as FK in a link


  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @ManyToOne
  @JoinColumn(name = "permission_type_id", referencedColumnName = "id")
  private ResButtonPermissionType resButtonPermissionType;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private ResUser resUser;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResButtonPermissionSettings() {
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
  // --- DATABASE MAPPING : value ( LONGTEXT )
  public void setValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setResButtonPermissionType(ResButtonPermissionType resButtonPermissionType) {
    this.resButtonPermissionType = resButtonPermissionType;
  }

  public ResButtonPermissionType getResButtonPermissionType() {
    return this.resButtonPermissionType;
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
    // attribute 'value' not usable (type = String Long Text)
    return sb.toString();
  }

}
