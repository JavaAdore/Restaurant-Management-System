package com.itigeeks.restaurant.common.entity.schema;

import java.io.Serializable;

import javax.persistence.*;
import com.itigeeks.restaurant.common.entity.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 *
 * @author ITI GEEKS
 *
 */
 @Entity
@Table(name="res_predefined_message")
public class ResPredefinedMessage extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long       id           ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public ResPredefinedMessage() {
        super();
    }

    public ResPredefinedMessage( Long id ) {
        super();
        this.id = id ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setId( Long value ) {
        this.id = value;
    }
    public Long getId() {
        return this.id;
    }


   
    public String toString() {
		StringBuffer sb = new StringBuffer(); 
		sb.append(id); 
        return sb.toString();
    }
}
