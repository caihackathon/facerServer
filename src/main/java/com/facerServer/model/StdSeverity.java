package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the STD_SEVERITY database table.
 * 
 */
@Entity
@Table(name="STD_SEVERITY")
@NamedQuery(name="StdSeverity.findAll", query="SELECT s FROM StdSeverity s")
public class StdSeverity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SEVERITY_ID", updatable = false, nullable = false)
	private int severityId;

	@Column(name="SEVERITY_NAME", updatable = false, nullable = false)
	private String severityName;

	@Column(name="SORT_ORDER", nullable = false)
	private int sortOrder;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	//bi-directional many-to-one association to Incident
	@OneToMany(mappedBy="stdSeverity")
	@JsonIgnore
	private List<Incident> incidents;

	public StdSeverity() {
	}

	public int getSeverityId() {
		return this.severityId;
	}

	public String getSeverityName() {
		return this.severityName;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public List<Incident> getIncidents() {
		return this.incidents;
	}
	
/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setSeverityId(int severityId) {
		this.severityId = severityId;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setSeverityName(String severityName) {
		this.severityName = severityName;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}

	public Incident addIncident(Incident incident) {
		getIncidents().add(incident);
		incident.setStdSeverity(this);

		return incident;
	}

	public Incident removeIncident(Incident incident) {
		getIncidents().remove(incident);
		incident.setStdSeverity(null);

		return incident;
	}

*/
	
}