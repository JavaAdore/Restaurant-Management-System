/*
 * Created on 24 Mar 2016 ( Time 16:42:53 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import java.util.List;

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
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


/**
 * Persistent class for entity stored in table "res_addon"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_addon", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResAddon.countAll", query="SELECT COUNT(x) FROM ResAddon x" )
} )
public class ResAddon extends AbstractEntity implements Serializable
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
    @Column(name="addon_name", nullable=false, length=150)
    private String     addonName    ;

    @Column(name="addon_image", nullable=false, length=255)
    private String     addonImage   ;

    @Column(name="is_active", nullable=false)
    private Boolean    isActive     ;

    @Column(name="price")
    private Integer price        ;

    @Column(name="takeaway_price")
    private Integer takeawayPrice ;

    @Column(name="web_order_price")
    private Integer webOrderPrice ;

    @Column(name="delivery_price")
    private Integer deliveryPrice ;

    @Column(name="waiting_price", nullable=false)
    private Integer waitingPrice ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="resAddon", targetEntity=ResOrderProductAddon.class)
    private List<ResOrderProductAddon> listOfResOrderProductAddon;

    @OneToMany(mappedBy="resAddon", targetEntity=ResProductAddon.class)
    private List<ResProductAddon> listOfResProductAddon;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResAddon()
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
    //--- DATABASE MAPPING : addon_name ( VARCHAR ) 
    public void setAddonName( String addonName )
    {
        this.addonName = addonName;
    }
    public String getAddonName()
    {
        return this.addonName;
    }

    //--- DATABASE MAPPING : addon_image ( VARCHAR ) 
    public void setAddonImage( String addonImage )
    {
        this.addonImage = addonImage;
    }
    public String getAddonImage()
    {
        return this.addonImage;
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

    //--- DATABASE MAPPING : price ( DECIMAL ) 
    public void setPrice( Integer price )
    {
        this.price = price;
    }
    public Integer getPrice()
    {
        return this.price;
    }

    //--- DATABASE MAPPING : takeaway_price ( DECIMAL ) 
    public void setTakeawayPrice( Integer takeawayPrice )
    {
        this.takeawayPrice = takeawayPrice;
    }
    public Integer getTakeawayPrice()
    {
        return this.takeawayPrice;
    }

    //--- DATABASE MAPPING : web_order_price ( DECIMAL ) 
    public void setWebOrderPrice( Integer webOrderPrice )
    {
        this.webOrderPrice = webOrderPrice;
    }
    public Integer getWebOrderPrice()
    {
        return this.webOrderPrice;
    }

    //--- DATABASE MAPPING : delivery_price ( DECIMAL ) 
    public void setDeliveryPrice( Integer deliveryPrice )
    {
        this.deliveryPrice = deliveryPrice;
    }
    public Integer getDeliveryPrice()
    {
        return this.deliveryPrice;
    }

    //--- DATABASE MAPPING : waiting_price ( DECIMAL ) 
    public void setWaitingPrice( Integer waitingPrice )
    {
        this.waitingPrice = waitingPrice;
    }
    public Integer getWaitingPrice()
    {
        return this.waitingPrice;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfResOrderProductAddon( List<ResOrderProductAddon> listOfResOrderProductAddon )
    {
        this.listOfResOrderProductAddon = listOfResOrderProductAddon;
    }
    public List<ResOrderProductAddon> getListOfResOrderProductAddon()
    {
        return this.listOfResOrderProductAddon;
    }

    public void setListOfResProductAddon( List<ResProductAddon> listOfResProductAddon )
    {
        this.listOfResProductAddon = listOfResProductAddon;
    }
    public List<ResProductAddon> getListOfResProductAddon()
    {
        return this.listOfResProductAddon;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(addonName);
        sb.append("|");
        sb.append(addonImage);
        sb.append("|");
        sb.append(isActive);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(takeawayPrice);
        sb.append("|");
        sb.append(webOrderPrice);
        sb.append("|");
        sb.append(deliveryPrice);
        sb.append("|");
        sb.append(waitingPrice);
        return sb.toString(); 
    } 

}