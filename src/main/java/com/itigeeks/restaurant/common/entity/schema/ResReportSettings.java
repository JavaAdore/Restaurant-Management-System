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

/**
 * Persistent class for entity stored in table "res_report_settings"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_report_settings", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResReportSettings.countAll", query="SELECT COUNT(x) FROM ResReportSettings x" )
} )
public class ResReportSettings extends AbstractEntity implements Serializable
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
    @Column(name="settings_name", nullable=false, length=200)
    private String     settingsName ;

    @Column(name="show_on_report", nullable=false)
    private Boolean    showOnReport ;

    @Column(name="is_available_for_z_report", nullable=false)
    private Boolean    isAvailableForZReport ;

	// "reportId" (column "report_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="report_id", referencedColumnName="id")
    private ResReports resReports  ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResReportSettings()
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
    //--- DATABASE MAPPING : settings_name ( VARCHAR ) 
    public void setSettingsName( String settingsName )
    {
        this.settingsName = settingsName;
    }
    public String getSettingsName()
    {
        return this.settingsName;
    }

    //--- DATABASE MAPPING : show_on_report ( BIT ) 
    public void setShowOnReport( Boolean showOnReport )
    {
        this.showOnReport = showOnReport;
    }
    public Boolean getShowOnReport()
    {
        return this.showOnReport;
    }

    //--- DATABASE MAPPING : is_available_for_z_report ( BIT ) 
    public void setIsAvailableForZReport( Boolean isAvailableForZReport )
    {
        this.isAvailableForZReport = isAvailableForZReport;
    }
    public Boolean getIsAvailableForZReport()
    {
        return this.isAvailableForZReport;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResReports( ResReports resReports )
    {
        this.resReports = resReports;
    }
    public ResReports getResReports()
    {
        return this.resReports;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(settingsName);
        sb.append("|");
        sb.append(showOnReport);
        sb.append("|");
        sb.append(isAvailableForZReport);
        return sb.toString(); 
    } 

}