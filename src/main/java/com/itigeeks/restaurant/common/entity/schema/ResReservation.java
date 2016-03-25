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
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_reservation"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_reservation", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResReservation.countAll", query="SELECT COUNT(x) FROM ResReservation x" )
} )
public class ResReservation extends AbstractEntity implements Serializable
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
    @Column(name="is_active", nullable=false)
    private Boolean    isActive     ;

    @Column(name="has_customer_sat_down", nullable=false)
    private Boolean    hasCustomerSatDown ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time_from", nullable=false)
    private Date       timeFrom     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time_to", nullable=false)
    private Date       timeTo       ;

    @Column(name="no_of_guests", nullable=false)
    private Short      noOfGuests   ;

    @Column(name="special_instruction", nullable=false, length=500)
    private String     specialInstruction ;

    @Column(name="deposit_amount", nullable=false)
    private BigDecimal depositAmount ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reservation_date", nullable=false)
    private Date       reservationDate ;

	// "customerId" (column "customer_id") is not defined by itself because used as FK in a link 
	// "tableId" (column "table_id") is not defined by itself because used as FK in a link 
	// "reservationTypeId" (column "reservation_type_id") is not defined by itself because used as FK in a link 
	// "depositTypeId" (column "deposit_type_id") is not defined by itself because used as FK in a link 
	// "promoId" (column "promo_id") is not defined by itself because used as FK in a link 
	// "reservationStatusId" (column "reservation_status_id") is not defined by itself because used as FK in a link 
	// "reservationConfirmationId" (column "reservation_confirmation_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="reservation_type_id", referencedColumnName="id")
    private ResReservationType resReservationType;

    @ManyToOne
    @JoinColumn(name="deposit_type_id", referencedColumnName="id")
    private ResDepositType resDepositType;

    @ManyToOne
    @JoinColumn(name="reservation_confirmation_id", referencedColumnName="id")
    private ResReservationConfirmation resReservationConfirmation;

    @ManyToOne
    @JoinColumn(name="table_id", referencedColumnName="id")
    private ResTable resTable    ;

    @OneToMany(mappedBy="resReservation", targetEntity=ResReservationInvoice.class)
    private List<ResReservationInvoice> listOfResReservationInvoice;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName="id")
    private ResCustomer resCustomer ;

    @ManyToOne
    @JoinColumn(name="promo_id", referencedColumnName="id")
    private ResPromo resPromo    ;

    @ManyToOne
    @JoinColumn(name="reservation_status_id", referencedColumnName="id")
    private ResReservationStatus resReservationStatus;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResReservation()
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
    //--- DATABASE MAPPING : is_active ( BIT ) 
    public void setIsActive( Boolean isActive )
    {
        this.isActive = isActive;
    }
    public Boolean getIsActive()
    {
        return this.isActive;
    }

    //--- DATABASE MAPPING : has_customer_sat_down ( BIT ) 
    public void setHasCustomerSatDown( Boolean hasCustomerSatDown )
    {
        this.hasCustomerSatDown = hasCustomerSatDown;
    }
    public Boolean getHasCustomerSatDown()
    {
        return this.hasCustomerSatDown;
    }

    //--- DATABASE MAPPING : time_from ( DATETIME ) 
    public void setTimeFrom( Date timeFrom )
    {
        this.timeFrom = timeFrom;
    }
    public Date getTimeFrom()
    {
        return this.timeFrom;
    }

    //--- DATABASE MAPPING : time_to ( DATETIME ) 
    public void setTimeTo( Date timeTo )
    {
        this.timeTo = timeTo;
    }
    public Date getTimeTo()
    {
        return this.timeTo;
    }

    //--- DATABASE MAPPING : no_of_guests ( SMALLINT ) 
    public void setNoOfGuests( Short noOfGuests )
    {
        this.noOfGuests = noOfGuests;
    }
    public Short getNoOfGuests()
    {
        return this.noOfGuests;
    }

    //--- DATABASE MAPPING : special_instruction ( VARCHAR ) 
    public void setSpecialInstruction( String specialInstruction )
    {
        this.specialInstruction = specialInstruction;
    }
    public String getSpecialInstruction()
    {
        return this.specialInstruction;
    }

    //--- DATABASE MAPPING : deposit_amount ( DECIMAL ) 
    public void setDepositAmount( BigDecimal depositAmount )
    {
        this.depositAmount = depositAmount;
    }
    public BigDecimal getDepositAmount()
    {
        return this.depositAmount;
    }

    //--- DATABASE MAPPING : reservation_date ( DATETIME ) 
    public void setReservationDate( Date reservationDate )
    {
        this.reservationDate = reservationDate;
    }
    public Date getReservationDate()
    {
        return this.reservationDate;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResReservationType( ResReservationType resReservationType )
    {
        this.resReservationType = resReservationType;
    }
    public ResReservationType getResReservationType()
    {
        return this.resReservationType;
    }

    public void setResDepositType( ResDepositType resDepositType )
    {
        this.resDepositType = resDepositType;
    }
    public ResDepositType getResDepositType()
    {
        return this.resDepositType;
    }

    public void setResReservationConfirmation( ResReservationConfirmation resReservationConfirmation )
    {
        this.resReservationConfirmation = resReservationConfirmation;
    }
    public ResReservationConfirmation getResReservationConfirmation()
    {
        return this.resReservationConfirmation;
    }

    public void setResTable( ResTable resTable )
    {
        this.resTable = resTable;
    }
    public ResTable getResTable()
    {
        return this.resTable;
    }

    public void setListOfResReservationInvoice( List<ResReservationInvoice> listOfResReservationInvoice )
    {
        this.listOfResReservationInvoice = listOfResReservationInvoice;
    }
    public List<ResReservationInvoice> getListOfResReservationInvoice()
    {
        return this.listOfResReservationInvoice;
    }

    public void setResCustomer( ResCustomer resCustomer )
    {
        this.resCustomer = resCustomer;
    }
    public ResCustomer getResCustomer()
    {
        return this.resCustomer;
    }

    public void setResPromo( ResPromo resPromo )
    {
        this.resPromo = resPromo;
    }
    public ResPromo getResPromo()
    {
        return this.resPromo;
    }

    public void setResReservationStatus( ResReservationStatus resReservationStatus )
    {
        this.resReservationStatus = resReservationStatus;
    }
    public ResReservationStatus getResReservationStatus()
    {
        return this.resReservationStatus;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(isActive);
        sb.append("|");
        sb.append(hasCustomerSatDown);
        sb.append("|");
        sb.append(timeFrom);
        sb.append("|");
        sb.append(timeTo);
        sb.append("|");
        sb.append(noOfGuests);
        sb.append("|");
        sb.append(specialInstruction);
        sb.append("|");
        sb.append(depositAmount);
        sb.append("|");
        sb.append(reservationDate);
        return sb.toString(); 
    } 

}