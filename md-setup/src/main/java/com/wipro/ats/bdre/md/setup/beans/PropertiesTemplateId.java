package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PropertiesTemplateId generated by hbm2java
 */
@Embeddable
public class PropertiesTemplateId  implements java.io.Serializable {


     private Integer processTemplateId;
     private String propTempKey;

    public PropertiesTemplateId() {
    }

    public PropertiesTemplateId(Integer processTemplateId, String propTempKey) {
       this.processTemplateId = processTemplateId;
       this.propTempKey = propTempKey;
    }
   

    @Column(name="PROCESS_TEMPLATE_ID", nullable=false)
    public Integer getProcessTemplateId() {
        return this.processTemplateId;
    }
    
    public void setProcessTemplateId(Integer processTemplateId) {
        this.processTemplateId = processTemplateId;
    }

    @Column(name="PROP_TEMP_KEY", nullable=false, length=128)
    public String getPropTempKey() {
        return this.propTempKey;
    }
    
    public void setPropTempKey(String propTempKey) {
        this.propTempKey = propTempKey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PropertiesTemplateId) ) return false;
		 PropertiesTemplateId castOther = ( PropertiesTemplateId ) other; 
         
		 return ( (this.getProcessTemplateId()==castOther.getProcessTemplateId()) || ( this.getProcessTemplateId()!=null && castOther.getProcessTemplateId()!=null && this.getProcessTemplateId().equals(castOther.getProcessTemplateId()) ) )
 && ( (this.getPropTempKey()==castOther.getPropTempKey()) || ( this.getPropTempKey()!=null && castOther.getPropTempKey()!=null && this.getPropTempKey().equals(castOther.getPropTempKey()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProcessTemplateId() == null ? 0 : this.getProcessTemplateId().hashCode() );
         result = 37 * result + ( getPropTempKey() == null ? 0 : this.getPropTempKey().hashCode() );
         return result;
   }   


}


