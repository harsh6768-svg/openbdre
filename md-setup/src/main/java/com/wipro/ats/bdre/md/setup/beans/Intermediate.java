package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.*;

/**
 * Intermediate generated by hbm2java
 */
@Entity
@Table(name="INTERMEDIATE"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class Intermediate  implements java.io.Serializable {


     private IntermediateId id;
     private String interValue;

    public Intermediate() {
    }

    public Intermediate(IntermediateId id, String interValue) {
       this.id = id;
       this.interValue = interValue;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="interKey", column=@Column(name="INTER_KEY", nullable=false, length=128) ), 
        @AttributeOverride(name="uuid", column=@Column(name="UUID", nullable=false, length=64) ) } )
    public IntermediateId getId() {
        return this.id;
    }
    
    public void setId(IntermediateId id) {
        this.id = id;
    }
    
    @Column(name="INTER_VALUE", nullable=false, length=2048)
    public String getInterValue() {
        return this.interValue;
    }
    
    public void setInterValue(String interValue) {
        this.interValue = interValue;
    }




}


