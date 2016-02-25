package com.naio.mmeteopersistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.naio.mmeteopersistence.common.BaseEntity;

@Entity
@Table(name = "sms")
public class SmsArchive extends BaseEntity
{
    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

    /** Field PROP_MMETEO_BOX of type {@link String} */
    private static final String PROP_MMETEO_BOX = "mmeteoBox";
    /** Field mmeteoBox of type {@link String} */
    @ManyToOne(optional = true)
    @JoinColumn(name = SmsArchive.PROP_MMETEO_BOX)
    private MMeteoBox mmeteoBox;        
    
    /** Field PROP_ERROR of type {@link String} */
    public static final String PROP_ERROR = "error";
    /** Field error of type {@link String} */
    @Column(name = SmsArchive.PROP_ERROR, nullable=false)
	private Boolean error;   
    
    /** Field PROP_VALID of type {@link String} */
    public static final String PROP_VALID = "valid";
    /** Field valid of type {@link String} */
    @Column(name = SmsArchive.PROP_VALID, nullable=false)
	private Boolean valid;   
        
    /** Field PROP_ARCHIVE of type {@link String} */
    public static final String PROP_ARCHIVE = "archive";
    /** Field archive of type {@link String} */
    @Column(name = SmsArchive.PROP_ARCHIVE, nullable=false)
	private Boolean archive;   
    
    /** Field PROP_INCOMING of type {@link String} */
    public static final String PROP_INCOMING = "incoming";
    /** Field incoming of type {@link String} */
    @Column(name = SmsArchive.PROP_INCOMING, nullable=false)
	private Boolean incoming;  
    
    /** Field PROP_PROVIDER_TIME of type {@link String} */
    public static final String PROP_PROVIDER_TIME = "providerTime";
    /** Field providerTime of type {@link Long} */
    @Column(name = SmsArchive.PROP_PROVIDER_TIME)
	private Long providerTime;
    
    /** Field PROP_PHONE of type {@link String} */
    public static final String PROP_PHONE = "phone";
    /** Field phone of type {@link String} */
    @Column(name = SmsArchive.PROP_PHONE, nullable=false)
	private String phone;
 	
    /** Field PROP_MESSAGE of type {@link String} */
    public static final String PROP_MESSAGE = "message";
    /** Field message of type {@link String} */
    @Column(name = SmsArchive.PROP_MESSAGE, nullable=false)
	private String message;
	public MMeteoBox getMmeteoBox() {
		return mmeteoBox;
	}
	public void setMmeteoBox(MMeteoBox mmeteoBox) {
		this.mmeteoBox = mmeteoBox;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getArchive() {
		return archive;
	}
	public void setArchive(Boolean archive) {
		this.archive = archive;
	}
	public Boolean getIncoming() {
		return incoming;
	}
	public void setIncoming(Boolean incoming) {
		this.incoming = incoming;
	}
	public Long getProviderTime() {
		return providerTime;
	}
	public void setProviderTime(Long providerTime) {
		this.providerTime = providerTime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

    
    
}
