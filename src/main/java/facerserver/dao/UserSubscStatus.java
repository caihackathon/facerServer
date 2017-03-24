package facerserver.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * The persistent class for the USER_SUBSC_STATUS database table.
 * 
 */
@Entity
@Table(name="USER_SUBSC_STATUS")
public class UserSubscStatus  {

	@Column(name="APPLICATION_NAME")
	private String applicationName;

	@Column(name="APPLICATION_STATUS_NAME")
	private String applicationStatusName;

	@Column(name="COMPONENT_NAME")
	private String componentName;

	@Column(name="COMPONENT_STATUS_NAME")
	private String componentStatusName;

	@Temporal(TemporalType.DATE)
	@Column(name="INCIDENT_DATE")
	private Date incidentDate;

	@Column(name="INCIDENT_ID")
	private int incidentId;

	@Column(name="INCIDENT_NAME")
	private String incidentName;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Id
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	public UserSubscStatus() {
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationStatusName() {
		return this.applicationStatusName;
	}

	public void setApplicationStatusName(String applicationStatusName) {
		this.applicationStatusName = applicationStatusName;
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentStatusName() {
		return this.componentStatusName;
	}

	public void setComponentStatusName(String componentStatusName) {
		this.componentStatusName = componentStatusName;
	}

	public Date getIncidentDate() {
		return this.incidentDate;
	}

	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}

	public int getIncidentId() {
		return this.incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public String getIncidentName() {
		return this.incidentName;
	}

	public void setIncidentName(String incidentName) {
		this.incidentName = incidentName;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}