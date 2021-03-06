/*
 * Created on 24 Mar 2016 ( Time 16:42:55 ) Generated by Telosys Tools Generator ( version 2.1.1 )
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
 * Persistent class for entity stored in table "res_print_block"
 * 
 * @author Telosys Tools Generator
 * 
 */

@Entity
@Table(name = "res_print_block", catalog = "viceroy")
// Define named queries here
@NamedQueries({@NamedQuery(name = "ResPrintBlock.countAll",
    query = "SELECT COUNT(x) FROM ResPrintBlock x")})
public class ResPrintBlock extends AbstractEntity implements Serializable {
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
  @Column(name = "block_name", nullable = false, length = 150)
  private String blockName;

  @Column(name = "sequence_number", nullable = false)
  private Short sequenceNumber;



  // ----------------------------------------------------------------------
  // ENTITY LINKS ( RELATIONSHIP )
  // ----------------------------------------------------------------------
  @OneToMany(mappedBy = "resPrintBlock", targetEntity = ResPrintBlockCategory.class)
  private List<ResPrintBlockCategory> listOfResPrintBlockCategory;


  // ----------------------------------------------------------------------
  // CONSTRUCTOR(S)
  // ----------------------------------------------------------------------
  public ResPrintBlock() {
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
  // --- DATABASE MAPPING : block_name ( VARCHAR )
  public void setBlockName(String blockName) {
    this.blockName = blockName;
  }

  public String getBlockName() {
    return this.blockName;
  }

  // --- DATABASE MAPPING : sequence_number ( SMALLINT )
  public void setSequenceNumber(Short sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public Short getSequenceNumber() {
    return this.sequenceNumber;
  }


  // ----------------------------------------------------------------------
  // GETTERS & SETTERS FOR LINKS
  // ----------------------------------------------------------------------
  public void setListOfResPrintBlockCategory(List<ResPrintBlockCategory> listOfResPrintBlockCategory) {
    this.listOfResPrintBlockCategory = listOfResPrintBlockCategory;
  }

  public List<ResPrintBlockCategory> getListOfResPrintBlockCategory() {
    return this.listOfResPrintBlockCategory;
  }


  // ----------------------------------------------------------------------
  // toString METHOD
  // ----------------------------------------------------------------------
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    sb.append(id);
    sb.append("]:");
    sb.append(blockName);
    sb.append("|");
    sb.append(sequenceNumber);
    return sb.toString();
  }

}
