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
 * Persistent class for entity stored in table "res_button_permission_type"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="res_button_permission_type", catalog="viceroy" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ResButtonPermissionType.countAll", query="SELECT COUNT(x) FROM ResButtonPermissionType x" )
} )
public class ResButtonPermissionType extends AbstractEntity implements Serializable
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
    @Column(name="permission_type", nullable=false, length=150)
    private String     permissionType ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="resButtonPermissionType", targetEntity=ResButtonPermissionSettings.class)
    private List<ResButtonPermissionSettings> listOfResButtonPermissionSettings;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ResButtonPermissionType()
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
    //--- DATABASE MAPPING : permission_type ( VARCHAR ) 
    public void setPermissionType( String permissionType )
    {
        this.permissionType = permissionType;
    }
    public String getPermissionType()
    {
        return this.permissionType;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfResButtonPermissionSettings( List<ResButtonPermissionSettings> listOfResButtonPermissionSettings )
    {
        this.listOfResButtonPermissionSettings = listOfResButtonPermissionSettings;
    }
    public List<ResButtonPermissionSettings> getListOfResButtonPermissionSettings()
    {
        return this.listOfResButtonPermissionSettings;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(permissionType);
        return sb.toString(); 
    } 

}