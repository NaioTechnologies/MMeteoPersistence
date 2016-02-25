package com.naio.mmeteopersistence.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "meteo_data")
public class MeteoData
{
	/** Field PROP_ID of type {@link String} */
    public static final String PROP_ID = "id";
    /** Field id of type {@link UUID} */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Type(type = "pg-uuid")
	@Column(name = MeteoData.PROP_ID, unique = true, length = 36)
	private UUID id;
	
	/** Field PROP_OWNER of type {@link String} */
    public static final String PROP_OWNER = "owner";
    /** Field owner of type {@link String} */
    @Column(name = MeteoData.PROP_OWNER)
	private String owner;
	
    /** Field PROP_TS of type {@link Long} */
    public static final String PROP_TS = "ts";
    /** Field ts of type {@link Date} */
    @Column(name = MeteoData.PROP_TS)
	private Long ts;
	
    /** Field PROP_PHONE_NUMBER of type {@link String} */
    public static final String PROP_PHONE_NUMBER = "phoneNumber";
    /** Field phoneNumber of type {@link String} */
    @Column(name = "phone_number")
	private String phoneNumber;
	
    /** Field PROP_DATA_TIME of type {@link String} */
    public static final String PROP_DATA_TIME = "dataTime";
    /** Field dataTime of type {@link Long} */
    @Column(name = "data_time")
	private Long dataTime;
    
    /** Field PROP_DATA_TEMPERATURE of type {@link String} */
    public static final String PROP_DATA_TEMPERATURE = "dataTemperature";
    /** Field dataTemperature of type {@link Double} */
    @Column(name = "data_temperature")
	private Double dataTemperature;
	
    /** Field PROP_DATA_HUMIDITY of type {@link String} */
    public static final String PROP_DATA_HUMIDITY = "dataHumidity";
    /** Field dataHumidity of type {@link Double} */
    @Column(name = "data_humidity")
	private Double dataHumidity;

    /** Field PROP_MMETEO_SOFT_VERSION of type {@link String} */
    public static final String PROP_MMETEO_SOFT_VERSION = "mmeteoSoftVersion";
    /** Field mmeteoSoftVersion of type {@link String} */
    @Column(name = "mmeteo_soft_version")
	private String mmeteoSoftVersion;

    /** Field PROP_MMETEO_DATE_VERSION of type {@link String} */
    public static final String PROP_MMETEO_DATE_VERSION = "mmeteoDateVersion";
    /** Field mmeteoDateVersion of type {@link String} */
    @Column(name = "mmeteo_date_version")
	private String mmeteoDateVersion;

    /** Field PROP_IMEI of type {@link String} */
    public static final String PROP_IMEI = "imei";
    /** Field imei of type {@link String} */
    @Column(name = MeteoData.PROP_IMEI)    
	private String imei;

    /** Field PROP_CLIENT_PHONE_1 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_1 = "clientPhone1";
    /** Field clientPhone1 of type {@link String} */
    @Column(name = "client_phone1")
	private String clientPhone1;

    /** Field PROP_CLIENT_PHONE_2 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_2 = "clientPhone2";
    /** Field clientPhone2 of type {@link String} */
    @Column(name = "client_phone2")    
	private String clientPhone2;
	
    /** Field PROP_CLIENT_PHONE_3 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_3 = "clientPhone3";
    /** Field clientPhone3 of type {@link String} */
    @Column(name = "client_phone3")    
	private String clientPhone3;
	
    /** Field PROP_TEMPERATURE_MIN of type {@link String} */
    public static final String PROP_TEMPERATURE_MIN = "temperatureMin";
    /** Field dataHumidity of type {@link Integer} */
    @Column(name = "temperature_min")    
	private Integer temperatureMin;

    /** Field PROP_TEMPERATURE_MAX of type {@link String} */
    public static final String PROP_TEMPERATURE_MAX = "temperatureMax";
    /** Field temperatureMax of type {@link Integer} */
    @Column(name = "temperature_max")        
	private Integer temperatureMax;

    /** Field PROP_HUMIDITY_MIN of type {@link String} */
    public static final String PROP_HUMIDITY_MIN = "humidityMin";
    /** Field humidityMin of type {@link Integer} */
    @Column(name = "humidity_min")       
	private Integer humidityMin;

    /** Field PROP_HUMIDITY_MAX of type {@link String} */
    public static final String PROP_HUMIDITY_MAX = "humidityMax";
    /** Field humidityMax of type {@link Integer} */
    @Column(name = "humidity_max")     
	private Integer humidityMax;

    /** Field PROP_SMS_RECEIVED of type {@link String} */
    public static final String PROP_SMS_RECEIVED = "smsReceived";
    /** Field smsReceived of type {@link Integer} */
    @Column(name = "sms_received")     
	private Integer smsReceived;

    /** Field PROP_SMS_SENT of type {@link String} */
    public static final String PROP_SMS_SENT = "smsSent";
    /** Field smsSent of type {@link Integer} */
    @Column(name = "sms_sent")     
	private Integer smsSent;

    /** Field PROP_BYTES_RECEIVED of type {@link String} */
    public static final String PROP_BYTES_RECEIVED = "bytesReceived";
    /** Field bytesReceived of type {@link Integer} */
    @Column(name = "bytes_received")   
    private Integer bytesReceived;

    /** Field PROP_BYTES_SENT of type {@link String} */
    public static final String PROP_BYTES_SENT = "bytesSent";
    /** Field bytesSent of type {@link Integer} */
    @Column(name = "bytes_sent")       
	private Integer bytesSent;

    /** Field PROP_SIGNAL_STRENGTH of type {@link String} */
    public static final String PROP_SIGNAL_STRENGTH = "signalStrength";
    /** Field signalStrenght of type {@link Integer} */
    @Column(name = "signal_strength")       
	private Integer signalStrength;
	
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

	public Integer getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(Integer temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public Integer getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(Integer temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public Integer getHumidityMin() {
		return humidityMin;
	}

	public void setHumidityMin(Integer humidityMin) {
		this.humidityMin = humidityMin;
	}

	public Integer getHumidityMax() {
		return humidityMax;
	}

	public void setHumidityMax(Integer humidityMax) {
		this.humidityMax = humidityMax;
	}

	public MeteoData()
	{
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getDataTime() {
		return dataTime;
	}

	public void setDataTime(Long dataTime) {
		this.dataTime = dataTime;
	}

	public Double getDataTemperature() {
		return dataTemperature;
	}

	public void setDataTemperature(Double dataTemperature) {
		this.dataTemperature = dataTemperature;
	}

	public Double getDataHumidity() {
		return dataHumidity;
	}

	public void setDataHumidity(Double dataHumidity) {
		this.dataHumidity = dataHumidity;
	}

	public String getMmeteoSoftVersion() {
		return mmeteoSoftVersion;
	}

	public void setMmeteoSoftVersion(String mmeteoSoftVersion) {
		this.mmeteoSoftVersion = mmeteoSoftVersion;
	}

	public String getMmeteoDateVersion() {
		return mmeteoDateVersion;
	}

	public void setMmeteoDateVersion(String mmeteoDateVersion) {
		this.mmeteoDateVersion = mmeteoDateVersion;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getClientPhone1() {
		return clientPhone1;
	}

	public void setClientPhone1(String clientPhone1) {
		this.clientPhone1 = clientPhone1;
	}

	public String getClientPhone2() {
		return clientPhone2;
	}

	public void setClientPhone2(String clientPhone2) {
		this.clientPhone2 = clientPhone2;
	}

	public String getClientPhone3() {
		return clientPhone3;
	}

	public void setClientPhone3(String clientPhone3) {
		this.clientPhone3 = clientPhone3;
	}

	public Integer getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}
	
	
}
