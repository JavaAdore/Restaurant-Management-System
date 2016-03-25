/*
 * Created on 24 Mar 2016 ( Time 16:42:56 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


/**
 * Persistent class for entity stored in table "res_reservation_invoice"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_reservation_invoice", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResReservationInvoice.countAll", query="SELECT COUNT(x) FROM ResReservationInvoice x" )
} )
public class ResReservationInvoice extends AbstractEntity implements Serializable
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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="invoice_date", nullable=false)
    private Date       invoiceDate  ;

    @Column(name="bill_amount", nullable=false)
    private Integer billAmount   ;

    @Column(name="delivery_charge")
    private Integer deliveryCharge ;

    @Column(name="tax")
    private Integer tax          ;

    @Column(name="total_amount", nullable=false)
    private Integer totalAmount  ;

    @Column(name="notes", length=250)
    private String     notes        ;

    @Column(name="is_active", nullable=false)
    private Boolean    isActive     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

	// "reservationId" (column "reservation_id") is not defined by itself because used as FK in a link 
	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 
	// "paymentMethodId" (column "payment_method_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser     ;

    @ManyToOne
    @JoinColumn(name="payment_method_id", referencedColumnName="id")
    private ResPaymentMethod resPaymentMethod;

    @ManyToOne
    @JoinColumn(name="reservation_id", referencedColumnName="id")
    private ResReservation resReservation;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResReservationInvoice()
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
    //--- DATABASE MAPPING : invoice_date ( DATETIME ) 
    public void setInvoiceDate( Date invoiceDate )
    {
        this.invoiceDate = invoiceDate;
    }
    public Date getInvoiceDate()
    {
        return this.invoiceDate;
    }

    //--- DATABASE MAPPING : bill_amount ( DECIMAL ) 
    public void setBillAmount( Integer billAmount )
    {
        this.billAmount = billAmount;
    }
    public Integer getBillAmount()
    {
        return this.billAmount;
    }

    //--- DATABASE MAPPING : delivery_charge ( DECIMAL ) 
    public void setDeliveryCharge( Integer deliveryCharge )
    {
        this.deliveryCharge = deliveryCharge;
    }
    public Integer getDeliveryCharge()
    {
        return this.deliveryCharge;
    }

    //--- DATABASE MAPPING : tax ( DECIMAL ) 
    public void setTax( Integer tax )
    {
        this.tax = tax;
    }
    public Integer getTax()
    {
        return this.tax;
    }

    //--- DATABASE MAPPING : total_amount ( DECIMAL ) 
    public void setTotalAmount( Integer totalAmount )
    {
        this.totalAmount = totalAmount;
    }
    public Integer getTotalAmount()
    {
        return this.totalAmount;
    }

    //--- DATABASE MAPPING : notes ( VARCHAR ) 
    public void setNotes( String notes )
    {
        this.notes = notes;
    }
    public String getNotes()
    {
        return this.notes;
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
    public void setResUser( ResUser resUser )
    {
        this.resUser = resUser;
    }
    public ResUser getResUser()
    {
        return this.resUser;
    }

    public void setResPaymentMethod( ResPaymentMethod resPaymentMethod )
    {
        this.resPaymentMethod = resPaymentMethod;
    }
    public ResPaymentMethod getResPaymentMethod()
    {
        return this.resPaymentMethod;
    }

    public void setResReservation( ResReservation resReservation )
    {
        this.resReservation = resReservation;
    }
    public ResReservation getResReservation()
    {
        return this.resReservation;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(invoiceDate);
        sb.append("|");
        sb.append(billAmount);
        sb.append("|");
        sb.append(deliveryCharge);
        sb.append("|");
        sb.append(tax);
        sb.append("|");
        sb.append(totalAmount);
        sb.append("|");
        sb.append(notes);
        sb.append("|");
        sb.append(isActive);
        sb.append("|");
        sb.append(lastUpdate);
        return sb.toString(); 
    } 

}