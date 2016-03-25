/*
 * Created on 24 Mar 2016 ( Time 16:42:56 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
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
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import java.util.Date;
import java.util.List;

/**
 * Persistent class for entity stored in table "res_quantity_type"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_quantity_type", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResQuantityType.countAll", query="SELECT COUNT(x) FROM ResQuantityType x" )
} )
public class ResQuantityType extends AbstractEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long      id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="quantity_type_name", nullable=false, length=150)
    private String     quantityTypeName ;

    @Column(name="is_active", nullable=false)
    private Boolean    isActive     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="resQuantityType2", targetEntity=ResProduct.class)
    private List<ResProduct> listOfResProduct2;

    @OneToMany(mappedBy="resQuantityType2", targetEntity=ResQuantityTypeConversion.class)
    private List<ResQuantityTypeConversion> listOfResQuantityTypeConversion2;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResConvertedToTakeAway.class)
    private List<ResConvertedToTakeAway> listOfResConvertedToTakeAway;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResQuantityTypeConversion.class)
    private List<ResQuantityTypeConversion> listOfResQuantityTypeConversion;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResOrderDeleteLog.class)
    private List<ResOrderDeleteLog> listOfResOrderDeleteLog;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResPromotionProduct.class)
    private List<ResPromotionProduct> listOfResPromotionProduct;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResOrderChild.class)
    private List<ResOrderChild> listOfResOrderChild;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResProductPurchaseHistory.class)
    private List<ResProductPurchaseHistory> listOfResProductPurchaseHistory;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResProductMisc.class)
    private List<ResProductMisc> listOfResProductMisc;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResProduct.class)
    private List<ResProduct> listOfResProduct;

    @OneToMany(mappedBy="resQuantityType2", targetEntity=ResPromotionProduct.class)
    private List<ResPromotionProduct> listOfResPromotionProduct2;

    @OneToMany(mappedBy="resQuantityType", targetEntity=ResProductWithWithout.class)
    private List<ResProductWithWithout> listOfResProductWithWithout;

    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResQuantityType()
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
    //--- DATABASE MAPPING : quantity_type_name ( VARCHAR ) 
    public void setQuantityTypeName( String quantityTypeName )
    {
        this.quantityTypeName = quantityTypeName;
    }
    public String getQuantityTypeName()
    {
        return this.quantityTypeName;
    }

    //--- DATABASE MAPPING : is_active ( BIT ) 
    public void setIsActive( Boolean isActive )
    {
        this.isActive = isActive;
    }
    public Boolean getIsActive()
    {
        return this.isActive;
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
    public void setListOfResProduct2( List<ResProduct> listOfResProduct2 )
    {
        this.listOfResProduct2 = listOfResProduct2;
    }
    public List<ResProduct> getListOfResProduct2()
    {
        return this.listOfResProduct2;
    }

    public void setListOfResQuantityTypeConversion2( List<ResQuantityTypeConversion> listOfResQuantityTypeConversion2 )
    {
        this.listOfResQuantityTypeConversion2 = listOfResQuantityTypeConversion2;
    }
    public List<ResQuantityTypeConversion> getListOfResQuantityTypeConversion2()
    {
        return this.listOfResQuantityTypeConversion2;
    }

    public void setListOfResConvertedToTakeAway( List<ResConvertedToTakeAway> listOfResConvertedToTakeAway )
    {
        this.listOfResConvertedToTakeAway = listOfResConvertedToTakeAway;
    }
    public List<ResConvertedToTakeAway> getListOfResConvertedToTakeAway()
    {
        return this.listOfResConvertedToTakeAway;
    }

    public void setListOfResQuantityTypeConversion( List<ResQuantityTypeConversion> listOfResQuantityTypeConversion )
    {
        this.listOfResQuantityTypeConversion = listOfResQuantityTypeConversion;
    }
    public List<ResQuantityTypeConversion> getListOfResQuantityTypeConversion()
    {
        return this.listOfResQuantityTypeConversion;
    }

    public void setListOfResOrderDeleteLog( List<ResOrderDeleteLog> listOfResOrderDeleteLog )
    {
        this.listOfResOrderDeleteLog = listOfResOrderDeleteLog;
    }
    public List<ResOrderDeleteLog> getListOfResOrderDeleteLog()
    {
        return this.listOfResOrderDeleteLog;
    }

    public void setListOfResPromotionProduct( List<ResPromotionProduct> listOfResPromotionProduct )
    {
        this.listOfResPromotionProduct = listOfResPromotionProduct;
    }
    public List<ResPromotionProduct> getListOfResPromotionProduct()
    {
        return this.listOfResPromotionProduct;
    }

    public void setListOfResOrderChild( List<ResOrderChild> listOfResOrderChild )
    {
        this.listOfResOrderChild = listOfResOrderChild;
    }
    public List<ResOrderChild> getListOfResOrderChild()
    {
        return this.listOfResOrderChild;
    }

    public void setListOfResProductPurchaseHistory( List<ResProductPurchaseHistory> listOfResProductPurchaseHistory )
    {
        this.listOfResProductPurchaseHistory = listOfResProductPurchaseHistory;
    }
    public List<ResProductPurchaseHistory> getListOfResProductPurchaseHistory()
    {
        return this.listOfResProductPurchaseHistory;
    }

    public void setListOfResProductMisc( List<ResProductMisc> listOfResProductMisc )
    {
        this.listOfResProductMisc = listOfResProductMisc;
    }
    public List<ResProductMisc> getListOfResProductMisc()
    {
        return this.listOfResProductMisc;
    }

    public void setListOfResProduct( List<ResProduct> listOfResProduct )
    {
        this.listOfResProduct = listOfResProduct;
    }
    public List<ResProduct> getListOfResProduct()
    {
        return this.listOfResProduct;
    }

    public void setListOfResPromotionProduct2( List<ResPromotionProduct> listOfResPromotionProduct2 )
    {
        this.listOfResPromotionProduct2 = listOfResPromotionProduct2;
    }
    public List<ResPromotionProduct> getListOfResPromotionProduct2()
    {
        return this.listOfResPromotionProduct2;
    }

    public void setListOfResProductWithWithout( List<ResProductWithWithout> listOfResProductWithWithout )
    {
        this.listOfResProductWithWithout = listOfResProductWithWithout;
    }
    public List<ResProductWithWithout> getListOfResProductWithWithout()
    {
        return this.listOfResProductWithWithout;
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
        sb.append(quantityTypeName);
        sb.append("|");
        sb.append(isActive);
        sb.append("|");
        sb.append(lastUpdate);
        return sb.toString(); 
    } 

}