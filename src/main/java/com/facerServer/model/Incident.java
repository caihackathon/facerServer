package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.sql.Timestamp;


/**
 * The persistent class for the INCIDENT database table.
 * 
 */
@Entity
@Table(name="INCIDENT")
@JsonPropertyOrder({ "incidentId", "incidentTypeName", "applicationName", "componentName"
	, "incidentDate", "incidentResolvedDate", "incidentActive"
	, "severityId", "severityName", "incidentDetail" })
@NamedQueries({
	@NamedQuery(name="Incident.findAll", query="SELECT i FROM Incident i ORDER BY i.incidentId DESC")
,	@NamedQuery(name="Incident.findActive", query="SELECT i FROM Incident i WHERE i.incidentResolvedDate IS NULL ORDER BY i.incidentId DESC")
})
public class Incident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INCIDENT_ID", updatable = false, nullable = false)
	private int incidentId;

	@Column(name="INCIDENT_DATE", updatable = false, nullable = false)
	private Timestamp incidentDate;

	@Column(name="INCIDENT_RESOLVED_DATE")
	private Timestamp incidentResolvedDate;

	@Column(name="INCIDENT_DETAIL")
	private String incidentDetail;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	//bi-directional many-to-one association to StdIncidentType
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="INCIDENT_TYPE_ID")
	private StdIncidentType stdIncidentType;

	//bi-directional many-to-one association to StdSeverity
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="SEVERITY_ID")
	private StdSeverity stdSeverity;

	public Incident() {
	}

	public int getIncidentId() {
		return this.incidentId;
	}

	public String getIncidentDate() {
		return this.incidentDate.toString();
	}

	public String getIncidentResolvedDate() {
		if ( this.incidentResolvedDate == null) {
			return "";
		} else {
			return this.incidentResolvedDate.toString();	
		}
	}

	public String getIncidentDetail() {
		return this.incidentDetail;
	}

	public String getIncidentActive() {
		String active = new String();
		
		if ( this.incidentResolvedDate != null) {
			active = "N";
		} else {
			active = "Y";
		};

		return active;
	}
	
	public String getIncidentTypeName() {
		return this.stdIncidentType.getIncidentTypeName();
	}
	
	public int getSeverityId() {
		return this.stdSeverity.getSeverityId();
	}
	
	public String getSeverityName() {
		return this.stdSeverity.getSeverityName();
	}
	
	public String getComponentName() {
		return  this.stdIncidentType.getStdComponent().getComponentName();
	}
	
	public String getApplicationName() {
		return this.stdIncidentType.getStdComponent().getStdApplication().getApplicationName();
	}
	
	//	Connectors to Std tables
	public StdIncidentType getStdIncidentType() {
		return this.stdIncidentType;
	}

	public StdSeverity getStdSeverity() {
		return this.stdSeverity;
	}
	
/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setIncidentDate(Timestamp incidentDate) {
		this.incidentDate = incidentDate;
	}

	public void setIncidentDetail(String incidentDetail) {
		this.incidentDetail = incidentDetail;
	}

	public void setIncidentResolvedDate(Timestamp incidentResolvedDate) {
		this.incidentResolvedDate = incidentResolvedDate;
	}

	public void setStdIncidentType(StdIncidentType stdIncidentType) {
		this.stdIncidentType = stdIncidentType;
	}

	public void setStdSeverity(StdSeverity stdSeverity) {
		this.stdSeverity = stdSeverity;
	}
*/
	
}