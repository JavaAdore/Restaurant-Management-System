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
 * Persistent class for entity stored in table "res_table_transactions"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_table_transactions", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResTableTransactions.countAll", query="SELECT COUNT(x) FROM ResTableTransactions x" )
} )
public class ResTableTransactions extends AbstractEntity implements Serializable
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
    @Column(name="no_of_guests", nullable=false)
    private Short      noOfGuests   ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_time", nullable=false)
    private Date       startTime    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_time")
    private Date       endTime      ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false)
    private Date       lastUpdate   ;

	// "tableId" (column "table_id") is not defined by itself because used as FK in a link 
	// "customerId" (column "customer_id") is not defined by itself because used as FK in a link 
	// "lastUpdatedBy" (column "last_updated_by") is not defined by itself because used as FK in a link 
	// "userId" (column "user_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="last_updated_by", referencedColumnName="id")
    private ResUser resUser2    ;

    @ManyToOne
    @JoinColumn(name="table_id", referencedColumnName="id")
    private ResTable resTable    ;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName="id")
    private ResCustomer resCustomer ;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private ResUser resUser     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResTableTransactions()
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
    //--- DATABASE MAPPING : no_of_guests ( SMALLINT ) 
    public void setNoOfGuests( Short noOfGuests )
    {
        this.noOfGuests = noOfGuests;
    }
    public Short getNoOfGuests()
    {
        return this.noOfGuests;
    }

    //--- DATABASE MAPPING : start_time ( DATETIME ) 
    public void setStartTime( Date startTime )
    {
        this.startTime = startTime;
    }
    public Date getStartTime()
    {
        return this.startTime;
    }

    //--- DATABASE MAPPING : end_time ( DATETIME ) 
    public void setEndTime( Date endTime )
    {
        this.endTime = endTime;
    }
    public Date getEndTime()
    {
        return this.endTime;
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
    public void setResUser2( ResUser resUser2 )
    {
        this.resUser2 = resUser2;
    }
    public ResUser getResUser2()
    {
        return this.resUser2;
    }

    public void setResTable( ResTable resTable )
    {
        this.resTable = resTable;
    }
    public ResTable getResTable()
    {
        return this.resTable;
    }

    public void setResCustomer( ResCustomer resCustomer )
    {
        this.resCustomer = resCustomer;
    }
    public ResCustomer getResCustomer()
    {
        return this.resCustomer;
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
        sb.append(noOfGuests);
        sb.append("|");
        sb.append(startTime);
        sb.append("|");
        sb.append(endTime);
        sb.append("|");
        sb.append(lastUpdate);
        return sb.toString(); 
    } 

}