package com.naio.mmeteopersistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.naio.mmeteopersistence.common.BaseEntity;

@Entity
@Table(name = "mmeteo_box_data")
public class MMeteoBoxData extends BaseEntity
{
    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

    /** Field PROP_MMETEO_BOX of type {@link String} */
    public static final String PROP_MMETEO_BOX = "mmeteoBox";
    /** Field mmeteoBox of type {@link MMeteoBox} */
    @ManyToOne(optional = false)
    @JoinColumn(name = MMeteoBoxData.PROP_MMETEO_BOX)
    private MMeteoBox mmeteoBox;        
  
    /** Field PROP_SMS_RECEIVED of type {@link String} */
    public static final String PROP_SMS_RECEIVED = "smsReceived";
    /** Field smsReceived of type {@link Integer} */
    @Column(name = MMeteoBoxData.PROP_SMS_RECEIVED, nullable=false)     
	private Integer smsReceived;

    /** Field PROP_SMS_SENT of type {@link String} */
    public static final String PROP_SMS_SENT = "smsSent";
    /** Field smsSent of type {@link Integer} */
    @Column(name = MMeteoBoxData.PROP_SMS_SENT, nullable=false)     
	private Integer smsSent;

    /** Field PROP_BYTES_RECEIVED of type {@link String} */
    public static final String PROP_BYTES_RECEIVED = "bytesReceived";
    /** Field bytesReceived of type {@link Integer} */
    @Column(name = MMeteoBoxData.PROP_BYTES_RECEIVED, nullable=false)   
    private Integer bytesReceived;

    /** Field PROP_BYTES_SENT of type {@link String} */
    public static final String PROP_BYTES_SENT = "bytesSent";
    /** Field bytesSent of type {@link Integer} */
    @Column(name = MMeteoBoxData.PROP_BYTES_SENT, nullable=false)       
	private Integer bytesSent;
	
    /** Field PROP_LAST_INCOMING_MESSAGE_TIME of type {@link String} */
    public static final String PROP_LAST_INCOMING_MESSAGE_TIME = "lastIncomingMessageTime";
    /** Field lastIncomingMessageTime of type {@link Long} */
    @Column(name = MMeteoBoxData.PROP_LAST_INCOMING_MESSAGE_TIME, nullable=true)
	private Long lastIncomingMessageTime;
  	    
    /** Field PROP_LAST_TEMPERATURE of type {@link String} */
    public static final String PROP_LAST_TEMPERATURE = "lastTemperature";
    /** Field lastTemperature of type {@link Double} */
    @Column(name = PROP_LAST_TEMPERATURE)
	private Double lastTemperature;
	
    /** Field PROP_LAST_HUMIDITY of type {@link String} */
    public static final String PROP_LAST_HUMIDITY = "lastHumidity";
    /** Field lastHumidity of type {@link Double} */
    @Column(name = PROP_LAST_HUMIDITY)
	private Double lastHumidity;
    
    /** Field PROP_LAST_ACTIVITY_CHECK_TIME of type {@link String} */
    public static final String PROP_LAST_ACTIVITY_CHECK_TIME = "lastActivityCheckTime";
    /** Field lastActivityCheckTime of type {@link Long} */
    @Column(name = PROP_LAST_ACTIVITY_CHECK_TIME)
	private Long lastActivityCheckTime;    
    
    /** Field PROP_SIGNAL_STRENGTH of type {@link String} */
    public static final String PROP_SIGNAL_STRENGTH = "signalStrength";
    /** Field signalStrenght of type {@link Integer} */
    @Column(name = PROP_SIGNAL_STRENGTH)       
	private Integer signalStrength;
    
    /** Field PROP_ALERT_SMS_SENT of type {@link String} */
    public static final String PROP_ALERT_SMS_SENT = "alertSmsSent";
    /** Field alertSmsSent of type {@link Boolean} */
    @Column(name = PROP_ALERT_SMS_SENT, nullable=false)
	private Boolean alertSmsSent;  
    
	public MMeteoBox getMmeteoBox() {
		return mmeteoBox;
	}
	public void setMmeteoBox(MMeteoBox mmeteoBox) {
		this.mmeteoBox = mmeteoBox;
	}
	public Integer getSmsReceived() {
		return smsReceived;
	}
	public void setSmsReceived(Integer smsReceived) {
		this.smsReceived = smsReceived;
	}
	public Integer getSmsSent() {
		return smsSent;
	}
	public void setSmsSent(Integer smsSent) {
		this.smsSent = smsSent;
	}
	public Integer getBytesReceived() {
		return bytesReceived;
	}
	public void setBytesReceived(Integer bytesReceived) {
		this.bytesReceived = bytesReceived;
	}
	public Integer getBytesSent() {
		return bytesSent;
	}
	public void setBytesSent(Integer bytesSent) {
		this.bytesSent = bytesSent;
	}
	public Long getLastIncomingMessageTime() {
		return lastIncomingMessageTime;
	}
	public void setLastIncomingMessageTime(Long lastIncomingMessageTime) {
		this.lastIncomingMessageTime = lastIncomingMessageTime;
	}
	public Double getLastTemperature() {
		return lastTemperature;
	}
	public void setLastTemperature(Double lastTemperature) {
		this.lastTemperature = lastTemperature;
	}
	public Double getLastHumidity() {
		return lastHumidity;
	}
	public void setLastHumidity(Double lastHumidity) {
		this.lastHumidity = lastHumidity;
	}
	
	public Long getLastActivityCheckTime() {
		return lastActivityCheckTime;
	}
	public void setLastActivityCheckTime(Long lastActivityCheckTime) {
		this.lastActivityCheckTime = lastActivityCheckTime;
	}
	public Integer getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}
	public Boolean getAlertSmsSent() {
		return alertSmsSent;
	}
	public void setAlertSmsSent(Boolean alertSmsSent) {
		this.alertSmsSent = alertSmsSent;
	}

}
