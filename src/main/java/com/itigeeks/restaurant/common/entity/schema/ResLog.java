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

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "res_log"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_log", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResLog.countAll", query="SELECT COUNT(x) FROM ResLog x" )
} )
public class ResLog extends AbstractEntity implements Serializable
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
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

	// "logTypeId" (column "log_type_id") is not defined by itself because used as FK in a link 
	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 
	// "terminalId" (column "terminal_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="log_type_id", referencedColumnName="id")
    private ResLogType resLogType  ;

    @ManyToOne
    @JoinColumn(name="terminal_id", referencedColumnName="id")
    private ResTerminal resTerminal ;

    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResLog()
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
    public void setResLogType( ResLogType resLogType )
    {
        this.resLogType = resLogType;
    }
    public ResLogType getResLogType()
    {
        return this.resLogType;
    }

    public void setResTerminal( ResTerminal resTerminal )
    {
        this.resTerminal = resTerminal;
    }
    public ResTerminal getResTerminal()
    {
        return this.resTerminal;
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
        sb.append(lastUpdate);
        return sb.toString(); 
    } 

}