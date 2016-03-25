/*
 * Created on 24 Mar 2016 ( Time 16:42:53 )
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
 * Persistent class for entity stored in table "res_cloak_room_status"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_cloak_room_status", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResCloakRoomStatus.countAll", query="SELECT COUNT(x) FROM ResCloakRoomStatus x" )
} )
public class ResCloakRoomStatus extends AbstractEntity implements Serializable
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
    @Column(name="status", nullable=false, length=45)
    private String     status       ;

    @Column(name="status_color", nullable=false, length=9)
    private String     statusColor  ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="resCloakRoomStatus", targetEntity=ResCloakRoom.class)
    private List<ResCloakRoom> listOfResCloakRoom;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResCloakRoomStatus()
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
    //--- DATABASE MAPPING : status ( VARCHAR ) 
    public void setStatus( String status )
    {
        this.status = status;
    }
    public String getStatus()
    {
        return this.status;
    }

    //--- DATABASE MAPPING : status_color ( VARCHAR ) 
    public void setStatusColor( String statusColor )
    {
        this.statusColor = statusColor;
    }
    public String getStatusColor()
    {
        return this.statusColor;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfResCloakRoom( List<ResCloakRoom> listOfResCloakRoom )
    {
        this.listOfResCloakRoom = listOfResCloakRoom;
    }
    public List<ResCloakRoom> getListOfResCloakRoom()
    {
        return this.listOfResCloakRoom;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(status);
        sb.append("|");
        sb.append(statusColor);
        return sb.toString(); 
    } 

}