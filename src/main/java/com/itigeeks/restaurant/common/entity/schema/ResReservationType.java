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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import java.util.List;

/**
 * Persistent class for entity stored in table "res_reservation_type"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_reservation_type", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResReservationType.countAll", query="SELECT COUNT(x) FROM ResReservationType x" )
} )
public class ResReservationType extends AbstractEntity implements Serializable
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
    @Column(name="reservation_type", nullable=false, length=150)
    private String     reservationType ;

    @Column(name="color", nullable=false, length=9)
    private String     color        ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="resReservationType", targetEntity=ResReservation.class)
    private List<ResReservation> listOfResReservation;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResReservationType()
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
    //--- DATABASE MAPPING : reservation_type ( VARCHAR ) 
    public void setReservationType( String reservationType )
    {
        this.reservationType = reservationType;
    }
    public String getReservationType()
    {
        return this.reservationType;
    }

    //--- DATABASE MAPPING : color ( VARCHAR ) 
    public void setColor( String color )
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfResReservation( List<ResReservation> listOfResReservation )
    {
        this.listOfResReservation = listOfResReservation;
    }
    public List<ResReservation> getListOfResReservation()
    {
        return this.listOfResReservation;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(reservationType);
        sb.append("|");
        sb.append(color);
        return sb.toString(); 
    } 

}