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


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_promotion_product"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_promotion_product", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResPromotionProduct.countAll", query="SELECT COUNT(x) FROM ResPromotionProduct x" )
} )
public class ResPromotionProduct extends AbstractEntity implements Serializable
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
    @Column(name="buying_quantity", nullable=false)
    private Short      buyingQuantity ;

    @Column(name="offer_quantity", nullable=false)
    private Short      offerQuantity ;

	// "promotion" (column "promotion") is not defined by itself because used as FK in a link 
	// "buyingQuantityTypeId" (column "buying_quantity_type_id") is not defined by itself because used as FK in a link 
	// "buyingProduct" (column "buying_product") is not defined by itself because used as FK in a link 
	// "offerQuantityTypeId" (column "offer_quantity_type_id") is not defined by itself because used as FK in a link 
	// "offerProduct" (column "offer_product") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="promotion", referencedColumnName="id")
    private ResPromotionalOffer resPromotionalOffer;

    @ManyToOne
    @JoinColumn(name="offer_product", referencedColumnName="id")
    private ResProduct resProduct  ;

    @ManyToOne
    @JoinColumn(name="buying_product", referencedColumnName="id")
    private ResProduct resProduct2 ;

    @ManyToOne
    @JoinColumn(name="buying_quantity_type_id", referencedColumnName="id")
    private ResQuantityType resQuantityType2;

    @ManyToOne
    @JoinColumn(name="offer_quantity_type_id", referencedColumnName="id")
    private ResQuantityType resQuantityType;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResPromotionProduct()
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
    //--- DATABASE MAPPING : buying_quantity ( SMALLINT ) 
    public void setBuyingQuantity( Short buyingQuantity )
    {
        this.buyingQuantity = buyingQuantity;
    }
    public Short getBuyingQuantity()
    {
        return this.buyingQuantity;
    }

    //--- DATABASE MAPPING : offer_quantity ( SMALLINT ) 
    public void setOfferQuantity( Short offerQuantity )
    {
        this.offerQuantity = offerQuantity;
    }
    public Short getOfferQuantity()
    {
        return this.offerQuantity;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResPromotionalOffer( ResPromotionalOffer resPromotionalOffer )
    {
        this.resPromotionalOffer = resPromotionalOffer;
    }
    public ResPromotionalOffer getResPromotionalOffer()
    {
        return this.resPromotionalOffer;
    }

    public void setResProduct( ResProduct resProduct )
    {
        this.resProduct = resProduct;
    }
    public ResProduct getResProduct()
    {
        return this.resProduct;
    }

    public void setResProduct2( ResProduct resProduct2 )
    {
        this.resProduct2 = resProduct2;
    }
    public ResProduct getResProduct2()
    {
        return this.resProduct2;
    }

    public void setResQuantityType2( ResQuantityType resQuantityType2 )
    {
        this.resQuantityType2 = resQuantityType2;
    }
    public ResQuantityType getResQuantityType2()
    {
        return this.resQuantityType2;
    }

    public void setResQuantityType( ResQuantityType resQuantityType )
    {
        this.resQuantityType = resQuantityType;
    }
    public ResQuantityType getResQuantityType()
    {
        return this.resQuantityType;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(buyingQuantity);
        sb.append("|");
        sb.append(offerQuantity);
        return sb.toString(); 
    } 

}