/*
 * Created on 24 Mar 2016 ( Time 16:42:53 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import com.itigeeks.restaurant.common.entity.AbstractEntity;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_converted_to_take_away"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_converted_to_take_away", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResConvertedToTakeAway.countAll", query="SELECT COUNT(x) FROM ResConvertedToTakeAway x" )
} )
public class ResConvertedToTakeAway extends AbstractEntity implements Serializable
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
    @Column(name="quantity", nullable=false)
    private Short      quantity     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

	// "customerId" (column "customer_id") is not defined by itself because used as FK in a link 
	// "orderId" (column "order_id") is not defined by itself because used as FK in a link 
	// "productId" (column "product_id") is not defined by itself because used as FK in a link 
	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 
	// "quantityTypeId" (column "quantity_type_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName="id")
    private ResCustomer resCustomer ;

    @ManyToOne
    @JoinColumn(name="order_id", referencedColumnName="id")
    private ResOrder resOrder    ;

    @ManyToOne
    @JoinColumn(name="quantity_type_id", referencedColumnName="id")
    private ResQuantityType resQuantityType;

    @ManyToOne
    @JoinColumn(name="product_id", referencedColumnName="id")
    private ResProduct resProduct  ;

    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResConvertedToTakeAway()
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
    //--- DATABASE MAPPING : quantity ( SMALLINT ) 
    public void setQuantity( Short quantity )
    {
        this.quantity = quantity;
    }
    public Short getQuantity()
    {
        return this.quantity;
    }

    //--- DATABASE MAPPING : last_update ( DATETIME ) 
    public void setLastUpdate( Date lastUpdate )
    {
        this.lastUpdate = lastUpdate;
    }
    public Date getLastUpdate()
    {
        return this.lastUpdate;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResCustomer( ResCustomer resCustomer )
    {
        this.resCustomer = resCustomer;
    }
    public ResCustomer getResCustomer()
    {
        return this.resCustomer;
    }

    public void setResOrder( ResOrder resOrder )
    {
        this.resOrder = resOrder;
    }
    public ResOrder getResOrder()
    {
        return this.resOrder;
    }

    public void setResQuantityType( ResQuantityType resQuantityType )
    {
        this.resQuantityType = resQuantityType;
    }
    public ResQuantityType getResQuantityType()
    {
        return this.resQuantityType;
    }

    public void setResProduct( ResProduct resProduct )
    {
        this.resProduct = resProduct;
    }
    public ResProduct getResProduct()
    {
        return this.resProduct;
    }

    public void setResUser( ResUser resUser )
    {
        this.resUser = resUser;
    }
    public ResUser getResUser()
    {
        return this.resUser;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(quantity);
        sb.append("|");
        sb.append(lastUpdate);
        return sb.toString(); 
    } 

}