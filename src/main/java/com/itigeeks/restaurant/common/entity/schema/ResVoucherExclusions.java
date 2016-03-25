/*
 * Created on 24 Mar 2016 ( Time 16:42:57 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import com.itigeeks.restaurant.common.entity.AbstractEntity;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_voucher_exclusions"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_voucher_exclusions", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResVoucherExclusions.countAll", query="SELECT COUNT(x) FROM ResVoucherExclusions x" )
} )
public class ResVoucherExclusions extends AbstractEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="exclusive_days_id", length=45)
    private String     exclusiveDaysId ;

	// "voucherId" (column "voucher_id") is not defined by itself because used as FK in a link 
	// "exclusiveOrderTypeId" (column "exclusive_order_type_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="voucher_id", referencedColumnName="id")
    private ResVoucher resVoucher  ;

    @ManyToOne
    @JoinColumn(name="exclusive_order_type_id", referencedColumnName="id")
    private ResOrderType resOrderType;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResVoucherExclusions()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Long    id )
    {
        this.id = id ;
    }
    public Long getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : exclusive_days_id ( VARCHAR ) 
    public void setExclusiveDaysId( String exclusiveDaysId )
    {
        this.exclusiveDaysId = exclusiveDaysId;
    }
    public String getExclusiveDaysId()
    {
        return this.exclusiveDaysId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResVoucher( ResVoucher resVoucher )
    {
        this.resVoucher = resVoucher;
    }
    public ResVoucher getResVoucher()
    {
        return this.resVoucher;
    }

    public void setResOrderType( ResOrderType resOrderType )
    {
        this.resOrderType = resOrderType;
    }
    public ResOrderType getResOrderType()
    {
        return this.resOrderType;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(exclusiveDaysId);
        return sb.toString(); 
    } 

}