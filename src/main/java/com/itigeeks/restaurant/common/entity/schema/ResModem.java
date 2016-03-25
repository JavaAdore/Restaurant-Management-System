/*
 * Created on 24 Mar 2016 ( Time 16:42:55 )
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
 * Persistent class for entity stored in table "res_modem"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_modem", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResModem.countAll", query="SELECT COUNT(x) FROM ResModem x" )
} )
public class ResModem extends AbstractEntity implements Serializable
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
    @Column(name="modem_name", length=45)
    private String     modemName    ;

    @Column(name="modem_device_id", length=200)
    private String     modemDeviceId ;

    @Column(name="ip_address", length=45)
    private String     ipAddress    ;

    @Column(name="is_active", nullable=false)
    private Boolean    isActive     ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

    @Temporal(TemporalType.TIME)
    @Column(name="query_timer")
    private Date       queryTimer   ;

	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResModem()
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
    //--- DATABASE MAPPING : modem_name ( VARCHAR ) 
    public void setModemName( String modemName )
    {
        this.modemName = modemName;
    }
    public String getModemName()
    {
        return this.modemName;
    }

    //--- DATABASE MAPPING : modem_device_id ( VARCHAR ) 
    public void setModemDeviceId( String modemDeviceId )
    {
        this.modemDeviceId = modemDeviceId;
    }
    public String getModemDeviceId()
    {
        return this.modemDeviceId;
    }

    //--- DATABASE MAPPING : ip_address ( VARCHAR ) 
    public void setIpAddress( String ipAddress )
    {
        this.ipAddress = ipAddress;
    }
    public String getIpAddress()
    {
        return this.ipAddress;
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

    //--- DATABASE MAPPING : query_timer ( TIME ) 
    public void setQueryTimer( Date queryTimer )
    {
        this.queryTimer = queryTimer;
    }
    public Date getQueryTimer()
    {
        return this.queryTimer;
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


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(modemName);
        sb.append("|");
        sb.append(modemDeviceId);
        sb.append("|");
        sb.append(ipAddress);
        sb.append("|");
        sb.append(isActive);
        sb.append("|");
        sb.append(lastUpdate);
        sb.append("|");
        sb.append(queryTimer);
        return sb.toString(); 
    } 

}