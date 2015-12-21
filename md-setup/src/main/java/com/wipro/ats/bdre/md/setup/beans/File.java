package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.*;

/**
 * File generated by hbm2java
 */
@Entity
@Table(name="FILE"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class File  implements java.io.Serializable {


     private FileId id;

    public File() {
    }

    public File(FileId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="batchId", column=@Column(name="BATCH_ID", nullable=false) ), 
        @AttributeOverride(name="serverId", column=@Column(name="SERVER_ID", nullable=false) ), 
        @AttributeOverride(name="path", column=@Column(name="PATH", nullable=false, length=256) ), 
        @AttributeOverride(name="fileSize", column=@Column(name="FILE_SIZE", nullable=false) ), 
        @AttributeOverride(name="fileHash", column=@Column(name="FILE_HASH", length=100) ), 
        @AttributeOverride(name="creationTs", column=@Column(name="CREATION_TS", nullable=false, length=23) ) } )
    public FileId getId() {
        return this.id;
    }
    
    public void setId(FileId id) {
        this.id = id;
    }




}


