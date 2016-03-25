/*
 * Created on 24 Mar 2016 ( Time 16:42:56 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import com.itigeeks.restaurant.common.entity.AbstractEntity;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_quantity_type_conversion"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_quantity_type_conversion", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResQuantityTypeConversion.countAll", query="SELECT COUNT(x) FROM ResQuantityTypeConversion x" )
} )
public class ResQuantityTypeConversion extends AbstractEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long       id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="conversion_rate", nullable=false)
    private BigDecimal conversionRate ;

	// "fromTypeId" (column "from_type_id") is not defined by itself because used as FK in a link 
	// "toTypeId" (column "to_type_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="from_type_id", referencedColumnName="id")
    private ResQuantityType resQuantityType;

    @ManyToOne
    @JoinColumn(name="to_type_id", referencedColumnName="id")
    private ResQuantityType resQuantityType2;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResQuantityTypeConversion()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Long id )
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
    //--- DATABASE MAPPING : conversion_rate ( DECIMAL ) 
    public void setConversionRate( BigDecimal conversionRate )
    {
        this.conversionRate = conversionRate;
    }
    public BigDecimal getConversionRate()
    {
        return this.conversionRate;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResQuantityType( ResQuantityType resQuantityType )
    {
        this.resQuantityType = resQuantityType;
    }
    public ResQuantityType getResQuantityType()
    {
        return this.resQuantityType;
    }

    public void setResQuantityType2( ResQuantityType resQuantityType2 )
    {
        this.resQuantityType2 = resQuantityType2;
    }
    public ResQuantityType getResQuantityType2()
    {
        return this.resQuantityType2;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(conversionRate);
        return sb.toString(); 
    } 

}