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

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_reservation_time"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_reservation_time", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResReservationTime.countAll", query="SELECT COUNT(x) FROM ResReservationTime x" )
} )
public class ResReservationTime extends AbstractEntity implements Serializable
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
    @Temporal(TemporalType.TIME)
    @Column(name="time_from", nullable=false)
    private Date       timeFrom     ;

    @Temporal(TemporalType.TIME)
    @Column(name="time_to", nullable=false)
    private Date       timeTo       ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResReservationTime()
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
    //--- DATABASE MAPPING : time_from ( TIME ) 
    public void setTimeFrom( Date timeFrom )
    {
        this.timeFrom = timeFrom;
    }
    public Date getTimeFrom()
    {
        return this.timeFrom;
    }

    //--- DATABASE MAPPING : time_to ( TIME ) 
    public void setTimeTo( Date timeTo )
    {
        this.timeTo = timeTo;
    }
    public Date getTimeTo()
    {
        return this.timeTo;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(timeFrom);
        sb.append("|");
        sb.append(timeTo);
        return sb.toString(); 
    } 

}