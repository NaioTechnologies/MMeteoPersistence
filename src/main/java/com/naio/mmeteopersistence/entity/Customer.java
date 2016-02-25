package com.naio.mmeteopersistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.naio.mmeteopersistence.common.BaseEntity;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity
{
    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

    /** Field PROP_NAME of type {@link String} */
    public static final String PROP_NAME = "name";
    /** Field name of type {@link String} */
	@Column(name = Customer.PROP_NAME, nullable = true)
	private String name;
	
	/** Field PROP_SOCIAL of type {@link String} */
	public static final String PROP_SOCIAL = "social";
    /** Field social of type {@link String} */
	@Column(name = Customer.PROP_SOCIAL, nullable = true)
	private String social;
	
	/** Field PROP_ADDRESS of type {@link String} */
	public static final String PROP_ADDRESS = "address";
    /** Field address of type {@link String} */
	@Column(name = Customer.PROP_ADDRESS, nullable = true)
	private String address;
	
	/** Field PROP_POSTAL_CODE of type {@link String} */
	public static final String PROP_POSTAL_CODE = "postalCode";
    /** Field postalCode of type {@link String} */
	@Column(name = Customer.PROP_POSTAL_CODE, nullable = true)
	private String postalCode;

	/** Field PROP_CITY of type {@link String} */
	public static final String PROP_CITY = "city";
    /** Field city of type {@link String} */
	@Column(name = Customer.PROP_CITY, nullable = true)
	private String city;
	
	/** Field PROP_COUNTRY of type {@link String} */
	public static final String PROP_COUNTRY = "country";
    /** Field country of type {@link String} */
	@Column(name = Customer.PROP_COUNTRY, nullable = true)
	private String country;
	
	/** Field PROP_PHONE_NUMBER of type {@link String} */
	public static final String PROP_PHONE_NUMBER = "phoneNumber";
    /** Field phoneNumber of type {@link String} */
	@Column(name = Customer.PROP_PHONE_NUMBER, nullable = true)
	private String phoneNumber;
	
	/** Field PROP_CUSTOMER_STATUS of type {@link String} */
	public static final String PROP_CUSTOMER_STATUS = "customerStatus";
    /** Field customerStatus of type {@link CUSTOMER_STATUS} */
    @Enumerated(EnumType.STRING)
	@Column(name = Customer.PROP_CUSTOMER_STATUS, nullable = true)
	private CUSTOMER_STATUS customerStatus;

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
    

    /** Field PROP_SEND_DAILY_REPORT of type {@link String} */
    public static final String PROP_SEND_DAILY_REPORT = "sendDailyReport";
    /** Field sendDailyReport of type {@link Boolean} */
    @Column(name = PROP_SEND_DAILY_REPORT, nullable=false)
	private Boolean sendDailyReport;
    
    /** Field PROP_SEND_MONTHLY_REPORT of type {@link String} */
    public static final String PROP_SEND_MONTHLY_REPORT = "sendMonthlyReport";
    /** Field sendMonthlyReport of type {@link Boolean} */
    @Column(name = PROP_SEND_MONTHLY_REPORT, nullable=false)
	private Boolean sendMonthlyReport;    
      
    /** Field PROP_CONTACT_EMAIL of type {@link String} */
    public static final String PROP_CONTACT_EMAIL = "contactEmail";
    /** Field contactEmail of type {@link String} */
	@Column(name = Customer.PROP_CONTACT_EMAIL, nullable = true)
	private String contactEmail;
    
    /**
     * Enum CHECK_STATUS Astrium (c), 2013
     */
    public enum CUSTOMER_STATUS
    {
        /** Field TEST of type {@link CUSTOMER_STATUS} */
        TEST,
        /** Field ACTIVE of type {@link CUSTOMER_STATUS} */
        ACTIVE,
        /** Field BLOCKED of type {@link CUSTOMER_STATUS} */
        BLOCKED
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public CUSTOMER_STATUS getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(CUSTOMER_STATUS customerStatus) {
		this.customerStatus = customerStatus;
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

	public Boolean getSendDailyReport() {
		return sendDailyReport;
	}

	public void setSendDailyReport(Boolean sendDailyReport) {
		this.sendDailyReport = sendDailyReport;
	}

	public Boolean getSendMonthlyReport() {
		return sendMonthlyReport;
	}

	public void setSendMonthlyReport(Boolean sendMonthlyReport) {
		this.sendMonthlyReport = sendMonthlyReport;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

    
    
}
