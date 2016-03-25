/*
 * Created on 24 Mar 2016 ( Time 16:42:54 )
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

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_loyalty_points"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_loyalty_points", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResLoyaltyPoints.countAll", query="SELECT COUNT(x) FROM ResLoyaltyPoints x" )
} )
public class ResLoyaltyPoints extends AbstractEntity implements Serializable
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
    @Column(name="week_day", nullable=false)
    private Short      weekDay      ;

    @Temporal(TemporalType.TIME)
    @Column(name="start_time", nullable=false)
    private Date       startTime    ;

    @Temporal(TemporalType.TIME)
    @Column(name="end_time", nullable=false)
    private Date       endTime      ;

    @Column(name="multiplier", nullable=false)
    private BigDecimal multiplier   ;

	// "orderTypeId" (column "order_type_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="order_type_id", referencedColumnName="id")
    private ResOrderType resOrderType;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResLoyaltyPoints()
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
    //--- DATABASE MAPPING : week_day ( SMALLINT ) 
    public void setWeekDay( Short weekDay )
    {
        this.weekDay = weekDay;
    }
    public Short getWeekDay()
    {
        return this.weekDay;
    }

    //--- DATABASE MAPPING : start_time ( TIME ) 
    public void setStartTime( Date startTime )
    {
        this.startTime = startTime;
    }
    public Date getStartTime()
    {
        return this.startTime;
    }

    //--- DATABASE MAPPING : end_time ( TIME ) 
    public void setEndTime( Date endTime )
    {
        this.endTime = endTime;
    }
    public Date getEndTime()
    {
        return this.endTime;
    }

    //--- DATABASE MAPPING : multiplier ( DECIMAL ) 
    public void setMultiplier( BigDecimal multiplier )
    {
        this.multiplier = multiplier;
    }
    public BigDecimal getMultiplier()
    {
        return this.multiplier;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
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
        sb.append(weekDay);
        sb.append("|");
        sb.append(startTime);
        sb.append("|");
        sb.append(endTime);
        sb.append("|");
        sb.append(multiplier);
        return sb.toString(); 
    } 

}