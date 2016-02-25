package com.naio.mmeteopersistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.naio.mmeteopersistence.common.BaseEntity;

@Entity
@Table(name = "mmeteo_box")
public class MMeteoBox extends BaseEntity
{
    /** Field serialVersionUID of type {@link long} */
    private static final long serialVersionUID = 1L;

    /** Field PROP_CUSTOMER of type {@link String} */
    public static final String PROP_CUSTOMER = "customer";
    /** Field customer of type {@link Customer} */
    @ManyToOne(optional = true)
    @JoinColumn(name = MMeteoBox.PROP_CUSTOMER)
    private Customer customer;        
    
    /** Field PROP_REFERENCE_NAIO of type {@link String} */
    public static final String PROP_REFERENCE_NAIO = "referenceNaio";
    /** Field referenceNaio of type {@link String} */
	@Column(name = MMeteoBox.PROP_REFERENCE_NAIO, nullable = false)
	private String referenceNaio;
    
    /** Field PROP_IMEI of type {@link String} */
	public static final String PROP_IMEI = "imei";
    /** Field imei of type {@link String} */
	@Column(name = MMeteoBox.PROP_IMEI, nullable = true, unique=true)
	private String imei;
	
	 /** Field PROP_PHONE_NUMBER of type {@link String} */
	public static final String PROP_PHONE_NUMBER = "phoneNumber";
    /** Field phoneNumber of type {@link String} */
	@Column(name = MMeteoBox.PROP_PHONE_NUMBER, nullable = true)
	private String phoneNumber;	
	
    /** Field PROP_SOFT_VERSION of type {@link String} */
	public static final String PROP_SOFT_VERSION = "softVersion";
    /** Field softVersion of type {@link String} */
	@Column(name = MMeteoBox.PROP_SOFT_VERSION, nullable = true)
	private String softVersion;
	
    /** Field PROP_SOFT_VERSION of type {@link String} */
	public static final String PROP_DATE_VERSION = "mmeteoDateVersion";
    /** Field mmeteoDateVersion of type {@link String} */
	@Column(name = MMeteoBox.PROP_DATE_VERSION, nullable = true)
	private String mmeteoDateVersion;
	
	   /** Field PROP_TEMPERATURE_MIN of type {@link String} */
    public static final String PROP_TEMPERATURE_MIN = "temperatureMin";
    /** Field dataHumidity of type {@link Integer} */
    @Column(name = MMeteoBox.PROP_TEMPERATURE_MIN, nullable = false )    
	private Integer temperatureMin;

    /** Field PROP_TEMPERATURE_MAX of type {@link String} */
    public static final String PROP_TEMPERATURE_MAX = "temperatureMax";
    /** Field temperatureMax of type {@link Integer} */
    @Column(name = MMeteoBox.PROP_TEMPERATURE_MAX, nullable = false)        
	private Integer temperatureMax;

    /** Field PROP_HUMIDITY_MIN of type {@link String} */
    public static final String PROP_HUMIDITY_MIN = "humidityMin";
    /** Field humidityMin of type {@link Integer} */
    @Column(name = MMeteoBox.PROP_HUMIDITY_MIN, nullable = false)       
	private Integer humidityMin;

    /** Field PROP_HUMIDITY_MAX of type {@link String} */
    public static final String PROP_HUMIDITY_MAX = "humidityMax";
    /** Field humidityMax of type {@link Integer} */
    @Column(name = MMeteoBox.PROP_HUMIDITY_MAX, nullable = false)     
	private Integer humidityMax;

    /** Field PROP_CLIENT_PHONE_1 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_1 = "clientPhone1";
    /** Field clientPhone1 of type {@link String} */
    @Column(name = MMeteoBox.PROP_CLIENT_PHONE_1)
	private String clientPhone1;

    /** Field PROP_CLIENT_PHONE_2 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_2 = "clientPhone2";
    /** Field clientPhone2 of type {@link String} */
    @Column(name = MMeteoBox.PROP_CLIENT_PHONE_2)    
	private String clientPhone2;
	
    /** Field PROP_CLIENT_PHONE_3 of type {@link String} */
    public static final String PROP_CLIENT_PHONE_3 = "clientPhone3";
    /** Field clientPhone3 of type {@link String} */
    @Column(name = MMeteoBox.PROP_CLIENT_PHONE_3)    
	private String clientPhone3;
    
    /** Field PROP_ACTIVITY_CHECK of type {@link String} */
    public static final String PROP_ACTIVITY_CHECK = "activityCheck";
    /** Field activityCheck of type {@link Boolean} */
    @Column(name = PROP_ACTIVITY_CHECK, nullable=false)
	private Boolean activityCheck;  
    
    /** Field PROP_FIRST_ACTIVITY_TIME of type {@link String} */
    public static final String PROP_FIRST_ACTIVITY_TIME = "firstActivityTime";
    /** Field firstActivityTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_FIRST_ACTIVITY_TIME, nullable=true)
	private Long firstActivityTime;
    
    /** Field PROP_ACTIVITY_TIMEOUT_MINUTE of type {@link String} */
    public static final String PROP_ACTIVITY_TIMEOUT_MINUTE = "activityTimeoutMinute";
    /** Field activityTimeoutMinute of type {@link Integer} */
    @Column(name = PROP_ACTIVITY_TIMEOUT_MINUTE, nullable=false)     
	private Integer activityTimeoutMinute;
    
    /** Field PROP_ALERT_TIMEOUT_MINUTE of type {@link String} */
    public static final String PROP_ALERT_TIMEOUT_MINUTE = "alertTimeoutMinute";
    /** Field alertTimeoutMinute of type {@link Integer} */
    @Column(name = PROP_ALERT_TIMEOUT_MINUTE, nullable=false)     
	private Integer alertTimeoutMinute;
            
    /** Field PROP_DAILY_REPORT_HOUR of type {@link String} */
    public static final String PROP_DAILY_REPORT_HOUR = "dailyReportHour";
    /** Field dailyReportHour of type {@link Boolean} */
    @Column(name = PROP_DAILY_REPORT_HOUR, nullable=false)
	private Integer dailyReportHour;  
    
    /** Field PROP_WEEKLY_REPORT_DAY of type {@link String} */
    public static final String PROP_WEEKLY_REPORT_DAY = "weeklyReportDay";
    /** Field weeklyReportDay of type {@link Boolean} */
    @Column(name = PROP_WEEKLY_REPORT_DAY, nullable=false)
	private Integer weeklyReportDay;  
    
    /** Field PROP_MONTHLY_REPORT_DAY of type {@link String} */
    public static final String PROP_MONTHLY_REPORT_DAY = "monthlyReportDay";
    /** Field monthlyReportDay of type {@link Boolean} */
    @Column(name = PROP_MONTHLY_REPORT_DAY, nullable=false)
	private Integer monthlyReportDay;    
    
    
    /** Field PROP_NEXT_DAILY_REPORT_TIME of type {@link String} */
    public static final String PROP_NEXT_DAILY_REPORT_TIME = "nextDailyReportTime";
    /** Field nextDailyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_NEXT_DAILY_REPORT_TIME, nullable=true)
	private Long nextDailyReportTime;
    
    /** Field PROP_NEXT_WEEKLY_REPORT_TIME of type {@link String} */
    public static final String PROP_NEXT_WEEKLY_REPORT_TIME = "nextWeeklyReportTime";
    /** Field nextWeeklyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_NEXT_WEEKLY_REPORT_TIME, nullable=true)
	private Long nextWeeklyReportTime; 
    
    /** Field PROP_NEXT_MONTHLY_REPORT_TIME of type {@link String} */
    public static final String PROP_NEXT_MONTHLY_REPORT_TIME = "nextMonthlyReportTime";
    /** Field nextMonthlyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_NEXT_MONTHLY_REPORT_TIME, nullable=true)
	private Long nextMonthlyReportTime; 
    
    
    /** Field PROP_LAST_SENT_DAILY_REPORT_TIME of type {@link String} */
    public static final String PROP_LAST_SENT_DAILY_REPORT_TIME = "lastSentDailyReportTime";
    /** Field lastSentDailyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_LAST_SENT_DAILY_REPORT_TIME, nullable=true)
	private Long lastSentDailyReportTime;
    
    /** Field PROP_LAST_SENT_WEEKLY_REPORT_TIME of type {@link String} */
    public static final String PROP_LAST_SENT_WEEKLY_REPORT_TIME = "lastSentWeeklyReportTime";
    /** Field lastSentWeeklyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_LAST_SENT_WEEKLY_REPORT_TIME, nullable=true)
	private Long lastSentWeeklyReportTime; 
    
    /** Field PROP_LAST_SENT_MONTHLY_REPORT_TIME of type {@link String} */
    public static final String PROP_LAST_SENT_MONTHLY_REPORT_TIME = "lastSentMonthlyReportTime";
    /** Field lastSentMonthlyReportTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_LAST_SENT_MONTHLY_REPORT_TIME, nullable=true)
	private Long lastSentMonthlyReportTime; 
    
    /** Field PROP_SEND_DAILY_REPORT of type {@link String} */
    public static final String PROP_SEND_DAILY_REPORT = "sendDailyReport";
    /** Field sendDailyReport of type {@link Boolean} */
    @Column(name = PROP_SEND_DAILY_REPORT, nullable=false)
	private Boolean sendDailyReport;  
    
    /** Field PROP_SEND_WEEKLY_REPORT of type {@link String} */
    public static final String PROP_SEND_WEEKLY_REPORT = "sendWeeklyReport";
    /** Field sendWeeklyReport of type {@link Boolean} */
    @Column(name = PROP_SEND_WEEKLY_REPORT, nullable=false)
	private Boolean sendWeeklyReport;  
    
    /** Field PROP_SEND_MONTHLY_REPORT of type {@link String} */
    public static final String PROP_SEND_MONTHLY_REPORT = "sendMonthlyReport";
    /** Field sendMonthlyReport of type {@link Boolean} */
    @Column(name = PROP_SEND_MONTHLY_REPORT, nullable=false)
	private Boolean sendMonthlyReport;  
    
    
    /** Field PROP_GPS_TIME of type {@link String} */
    public static final String PROP_GPS_TIME = "gpsTime";
    /** Field gpsTime of type {@link Long} */
    @Column(name = MMeteoBox.PROP_GPS_TIME, nullable=true)
	private Long gpsTime;
    
    /** Field PROP_GPS_LAT of type {@link String} */
    public static final String PROP_GPS_LAT = "gpsLat";
    /** Field gpsLat of type {@link Double} */
    @Column(name = PROP_GPS_LAT, nullable=true)
	private Double gpsLat;  
    
    /** Field PROP_GPS_LON of type {@link String} */
    public static final String PROP_GPS_LON = "gpsLon";
    /** Field gpsLon of type {@link Double} */
    @Column(name = PROP_GPS_LON, nullable=true)
	private Double gpsLon;  
    
    /** Field PROP_GPS_ALT of type {@link String} */
    public static final String PROP_GPS_ALT = "gpsAlt";
    /** Field gpsAlt of type {@link Double} */
    @Column(name = PROP_GPS_ALT, nullable=true)
	private Double gpsAlt;  
        
    /** Field PROP_REGISTERED of type {@link String} */
    public static final String PROP_REGISTERED = "registered";
    /** Field sendWeeklyReport of type {@link Boolean} */
    @Column(name = PROP_REGISTERED, nullable=false)
	private Boolean registered;  
    

    
    
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getReferenceNaio() {
		return referenceNaio;
	}
	public void setReferenceNaio(String referenceNaio) {
		this.referenceNaio = referenceNaio;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSoftVersion() {
		return softVersion;
	}
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}
	public String getMmeteoDateVersion() {
		return mmeteoDateVersion;
	}
	public void setMmeteoDateVersion(String mmeteoDateVersion) {
		this.mmeteoDateVersion = mmeteoDateVersion;
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
	public Boolean getActivityCheck() {
		return activityCheck;
	}
	public void setActivityCheck(Boolean activityCheck) {
		this.activityCheck = activityCheck;
	}
	
	public Long getFirstActivityTime() {
		return firstActivityTime;
	}
	public void setFirstActivityTime(Long firstActivityTime) {
		this.firstActivityTime = firstActivityTime;
	}
	public Integer getActivityTimeoutMinute() {
		return activityTimeoutMinute;
	}
	public void setActivityTimeoutMinute(Integer activityTimeoutMinute) {
		this.activityTimeoutMinute = activityTimeoutMinute;
	}
	public Integer getAlertTimeoutMinute() {
		return alertTimeoutMinute;
	}
	public void setAlertTimeoutMinute(Integer alertTimeoutMinute) {
		this.alertTimeoutMinute = alertTimeoutMinute;
	}
	public Integer getDailyReportHour() {
		return dailyReportHour;
	}
	public void setDailyReportHour(Integer dailyReportHour) {
		this.dailyReportHour = dailyReportHour;
	}
	public Integer getWeeklyReportDay() {
		return weeklyReportDay;
	}
	public void setWeeklyReportDay(Integer weeklyReportDay) {
		this.weeklyReportDay = weeklyReportDay;
	}
	public Integer getMonthlyReportDay() {
		return monthlyReportDay;
	}
	public void setMonthlyReportDay(Integer monthlyReportDay) {
		this.monthlyReportDay = monthlyReportDay;
	}
	public Long getLastSentDailyReportTime() {
		return lastSentDailyReportTime;
	}
	public void setLastSentDailyReportTime(Long lastSentDailyReportTime) {
		this.lastSentDailyReportTime = lastSentDailyReportTime;
	}
	public Long getLastSentWeeklyReportTime() {
		return lastSentWeeklyReportTime;
	}
	public void setLastSentWeeklyReportTime(Long lastSentWeeklyReportTime) {
		this.lastSentWeeklyReportTime = lastSentWeeklyReportTime;
	}
	public Long getLastSentMonthlyReportTime() {
		return lastSentMonthlyReportTime;
	}
	public void setLastSentMonthlyReportTime(Long lastSentMonthlyReportTime) {
		this.lastSentMonthlyReportTime = lastSentMonthlyReportTime;
	}
	public Boolean getSendDailyReport() {
		return sendDailyReport;
	}
	public void setSendDailyReport(Boolean sendDailyReport) {
		this.sendDailyReport = sendDailyReport;
	}
	public Boolean getSendWeeklyReport() {
		return sendWeeklyReport;
	}
	public void setSendWeeklyReport(Boolean sendWeeklyReport) {
		this.sendWeeklyReport = sendWeeklyReport;
	}
	public Boolean getSendMonthlyReport() {
		return sendMonthlyReport;
	}
	public void setSendMonthlyReport(Boolean sendMonthlyReport) {
		this.sendMonthlyReport = sendMonthlyReport;
	}
	public Long getNextDailyReportTime() {
		return nextDailyReportTime;
	}
	public void setNextDailyReportTime(Long nextDailyReportTime) {
		this.nextDailyReportTime = nextDailyReportTime;
	}
	public Long getNextWeeklyReportTime() {
		return nextWeeklyReportTime;
	}
	public void setNextWeeklyReportTime(Long nextWeeklyReportTime) {
		this.nextWeeklyReportTime = nextWeeklyReportTime;
	}
	public Long getNextMonthlyReportTime() {
		return nextMonthlyReportTime;
	}
	public void setNextMonthlyReportTime(Long nextMonthlyReportTime) {
		this.nextMonthlyReportTime = nextMonthlyReportTime;
	}
	public Long getGpsTime() {
		return gpsTime;
	}
	public void setGpsTime(Long gpsTime) {
		this.gpsTime = gpsTime;
	}
	public Double getGpsLat() {
		return gpsLat;
	}
	public void setGpsLat(Double gpsLat) {
		this.gpsLat = gpsLat;
	}
	public Double getGpsLon() {
		return gpsLon;
	}
	public void setGpsLon(Double gpsLon) {
		this.gpsLon = gpsLon;
	}
	public Double getGpsAlt() {
		return gpsAlt;
	}
	public void setGpsAlt(Double gpsAlt) {
		this.gpsAlt = gpsAlt;
	}
	public Boolean getRegistered() {
		return registered;
	}
	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

	
    

}
