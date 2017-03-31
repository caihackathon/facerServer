package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the INCIDENT database table.
 * 
 */
@Entity
@Table(name="INCIDENT")
@NamedQuery(name="Incident.findAll", query="SELECT i FROM Incident i")
public class Incident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INCIDENT_ID")
	private int incidentId;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="INCIDENT_DATE")
	private Timestamp incidentDate;

	@Column(name="INCIDENT_DETAIL")
	private String incidentDetail;

	@Column(name="INCIDENT_RESOLVED_DATE")
	private Timestamp incidentResolvedDate;

	//bi-directional many-to-one association to StdIncidentType
	@ManyToOne
	@JoinColumn(name="INCIDENT_TYPE_ID")
	private StdIncidentType stdIncidentType;

	//bi-directional many-to-one association to StdSeverity
	@ManyToOne
	@JoinColumn(name="SEVERITY_ID")
	private StdSeverity stdSeverity;

	public Incident() {
	}

	public int getIncidentId() {
		return this.incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getIncidentDate() {
		return this.incidentDate;
	}

	public void setIncidentDate(Timestamp incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getIncidentDetail() {
		return this.incidentDetail;
	}

	public void setIncidentDetail(String incidentDetail) {
		this.incidentDetail = incidentDetail;
	}

	public Timestamp getIncidentResolvedDate() {
		return this.incidentResolvedDate;
	}

	public void setIncidentResolvedDate(Timestamp incidentResolvedDate) {
		this.incidentResolvedDate = incidentResolvedDate;
	}

	public StdIncidentType getStdIncidentType() {
		return this.stdIncidentType;
	}

	public void setStdIncidentType(StdIncidentType stdIncidentType) {
		this.stdIncidentType = stdIncidentType;
	}

	public StdSeverity getStdSeverity() {
		return this.stdSeverity;
	}

	public void setStdSeverity(StdSeverity stdSeverity) {
		this.stdSeverity = stdSeverity;
	}

}