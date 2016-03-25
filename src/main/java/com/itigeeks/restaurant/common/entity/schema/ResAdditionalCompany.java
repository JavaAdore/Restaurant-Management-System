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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.itigeeks.restaurant.common.entity.AbstractEntity;
//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;
import java.util.List;

/**
 * Persistent class for entity stored in table "res_additional_company"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_additional_company", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResAdditionalCompany.countAll", query="SELECT COUNT(x) FROM ResAdditionalCompany x" )
} )
public class ResAdditionalCompany extends AbstractEntity implements Serializable
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
    @Column(name="company_name", nullable=false, length=150)
    private String     companyName  ;

    @Column(name="company_street", nullable=false, length=255)
    private String     companyStreet ;

    @Column(name="company_city", nullable=false, length=255)
    private String     companyCity  ;

    @Column(name="company_town", nullable=false, length=255)
    private String     companyTown  ;

    @Column(name="company_pin_code", nullable=false, length=255)
    private String     companyPinCode ;

    @Column(name="company_country", nullable=false, length=255)
    private String     companyCountry ;

    @Column(name="company_email", nullable=false, length=255)
    private String     companyEmail ;

    @Column(name="company_phone", nullable=false, length=255)
    private String     companyPhone ;

    @Column(name="company_website", nullable=false, length=255)
    private String     companyWebsite ;

    @Column(name="logo", nullable=false, length=255)
    private String     logo         ;

	// "printerId" (column "printer_id") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="printer_id", referencedColumnName="id")
    private ResPrinter resPrinter  ;

    @OneToMany(mappedBy="resAdditionalCompany", targetEntity=ResAdditionalCompanyCategory.class)
    private List<ResAdditionalCompanyCategory> listOfResAdditionalCompanyCategory;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResAdditionalCompany()
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
    //--- DATABASE MAPPING : company_name ( VARCHAR ) 
    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return this.companyName;
    }

    //--- DATABASE MAPPING : company_street ( VARCHAR ) 
    public void setCompanyStreet( String companyStreet )
    {
        this.companyStreet = companyStreet;
    }
    public String getCompanyStreet()
    {
        return this.companyStreet;
    }

    //--- DATABASE MAPPING : company_city ( VARCHAR ) 
    public void setCompanyCity( String companyCity )
    {
        this.companyCity = companyCity;
    }
    public String getCompanyCity()
    {
        return this.companyCity;
    }

    //--- DATABASE MAPPING : company_town ( VARCHAR ) 
    public void setCompanyTown( String companyTown )
    {
        this.companyTown = companyTown;
    }
    public String getCompanyTown()
    {
        return this.companyTown;
    }

    //--- DATABASE MAPPING : company_pin_code ( VARCHAR ) 
    public void setCompanyPinCode( String companyPinCode )
    {
        this.companyPinCode = companyPinCode;
    }
    public String getCompanyPinCode()
    {
        return this.companyPinCode;
    }

    //--- DATABASE MAPPING : company_country ( VARCHAR ) 
    public void setCompanyCountry( String companyCountry )
    {
        this.companyCountry = companyCountry;
    }
    public String getCompanyCountry()
    {
        return this.companyCountry;
    }

    //--- DATABASE MAPPING : company_email ( VARCHAR ) 
    public void setCompanyEmail( String companyEmail )
    {
        this.companyEmail = companyEmail;
    }
    public String getCompanyEmail()
    {
        return this.companyEmail;
    }

    //--- DATABASE MAPPING : company_phone ( VARCHAR ) 
    public void setCompanyPhone( String companyPhone )
    {
        this.companyPhone = companyPhone;
    }
    public String getCompanyPhone()
    {
        return this.companyPhone;
    }

    //--- DATABASE MAPPING : company_website ( VARCHAR ) 
    public void setCompanyWebsite( String companyWebsite )
    {
        this.companyWebsite = companyWebsite;
    }
    public String getCompanyWebsite()
    {
        return this.companyWebsite;
    }

    //--- DATABASE MAPPING : logo ( VARCHAR ) 
    public void setLogo( String logo )
    {
        this.logo = logo;
    }
    public String getLogo()
    {
        return this.logo;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setResPrinter( ResPrinter resPrinter )
    {
        this.resPrinter = resPrinter;
    }
    public ResPrinter getResPrinter()
    {
        return this.resPrinter;
    }

    public void setListOfResAdditionalCompanyCategory( List<ResAdditionalCompanyCategory> listOfResAdditionalCompanyCategory )
    {
        this.listOfResAdditionalCompanyCategory = listOfResAdditionalCompanyCategory;
    }
    public List<ResAdditionalCompanyCategory> getListOfResAdditionalCompanyCategory()
    {
        return this.listOfResAdditionalCompanyCategory;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(companyName);
        sb.append("|");
        sb.append(companyStreet);
        sb.append("|");
        sb.append(companyCity);
        sb.append("|");
        sb.append(companyTown);
        sb.append("|");
        sb.append(companyPinCode);
        sb.append("|");
        sb.append(companyCountry);
        sb.append("|");
        sb.append(companyEmail);
        sb.append("|");
        sb.append(companyPhone);
        sb.append("|");
        sb.append(companyWebsite);
        sb.append("|");
        sb.append(logo);
        return sb.toString(); 
    } 

}