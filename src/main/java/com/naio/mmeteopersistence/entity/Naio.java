package com.naio.mmeteopersistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.naio.mmeteopersistence.common.BaseEntity;

@Entity
@Table(name = "naio")
public class Naio extends BaseEntity
{
    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

	/** Field PROP_ALERT_PHONE_NUMBER of type {@link String} */
    public static final String PROP_ALERT_PHONE_NUMBER = "alertPhoneNumber";
    /** Field alertPhoneNumber of type {@link String} */
	@Column(name = Naio.PROP_ALERT_PHONE_NUMBER, nullable = false)
	private String alertPhoneNumber;
	
	/** Field PROP_NAME of type {@link String} */
	public static final String PROP_NAME = "name";
    /** Field name of type {@link String} */
	@Column(name = Naio.PROP_NAME, nullable = false)
	private String name;
	
	/** Field PROP_EMAIL of type {@link String} */
	public static final String PROP_EMAIL = "email";
    /** Field email of type {@link String} */
	@Column(name = Naio.PROP_EMAIL, nullable = false)
	private String email;
	
    /** Field PROP_SEND_EMAIL_ALERT of type {@link String} */
    public static final String PROP_SEND_EMAIL_ALERT = "sendEmailAlert";
    /** Field sendEmailAlert of type {@link Boolean} */
    @Column(name = PROP_SEND_EMAIL_ALERT, nullable=false)
	private Boolean sendEmailAlert; 

    /** Field PROP_SEND_SMS_ALERT of type {@link String} */
    public static final String PROP_SEND_SMS_ALERT = "sendSmsAlert";
    /** Field sendSmsAlert of type {@link Boolean} */
    @Column(name = PROP_SEND_SMS_ALERT, nullable=false)
	private Boolean sendSmsAlert;
	
    /** Field PROP_SEND_SERVER_ERROR of type {@link String} */
    public static final String PROP_SEND_SERVER_ERROR = "sendServerError";
    /** Field sendServerError of type {@link Boolean} */
    @Column(name = PROP_SEND_SERVER_ERROR, nullable=false)
	private Boolean sendServerError;
    
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlertPhoneNumber() {
		return alertPhoneNumber;
	}
	
	public void setAlertPhoneNumber(String alertPhoneNumber) {
		this.alertPhoneNumber = alertPhoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSendEmailAlert() {
		return sendEmailAlert;
	}

	public void setSendEmailAlert(Boolean sendEmailAlert) {
		this.sendEmailAlert = sendEmailAlert;
	}

	public Boolean getSendSmsAlert() {
		return sendSmsAlert;
	}

	public void setSendSmsAlert(Boolean sendSmsAlert) {
		this.sendSmsAlert = sendSmsAlert;
	}

	public Boolean getSendServerError() {
		return sendServerError;
	}

	public void setSendServerError(Boolean sendServerError) {
		this.sendServerError = sendServerError;
	}


	
	
}
