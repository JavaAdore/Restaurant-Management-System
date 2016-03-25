/*
 * Created on 24 Mar 2016 ( Time 16:42:57 )
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import java.util.Date;

/**
 * Persistent class for entity stored in table "res_zreport_log"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_zreport_log", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResZreportLog.countAll", query="SELECT COUNT(x) FROM ResZreportLog x" )
} )
public class ResZreportLog extends AbstractEntity implements Serializable
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
    @Column(name="pull_date")
    private Date       pullDate     ;

    @Column(name="value", nullable=false)
    private String     value        ;

	// "userId" (column "user_id") is not defined by itself because used as FK in a link 
	// "terminalId" (column "terminal_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private ResUser resUser     ;

    @ManyToOne
    @JoinColumn(name="terminal_id", referencedColumnName="id")
    private ResTerminal resTerminal ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResZreportLog()
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
    //--- DATABASE MAPPING : pull_date ( DATETIME ) 
    public void setPullDate( Date pullDate )
    {
        this.pullDate = pullDate;
    }
    public Date getPullDate()
    {
        return this.pullDate;
    }

    //--- DATABASE MAPPING : value ( LONGTEXT ) 
    public void setValue( String value )
    {
        this.value = value;
    }
    public String getValue()
    {
        return this.value;
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

    public void setResTerminal( ResTerminal resTerminal )
    {
        this.resTerminal = resTerminal;
    }
    public ResTerminal getResTerminal()
    {
        return this.resTerminal;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(pullDate);
        // attribute 'value' not usable (type = String Long Text)
        return sb.toString(); 
    } 

}