package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the STD_INCIDENT_TYPE database table.
 * 
 */
@Entity
@Table(name="STD_INCIDENT_TYPE")
@NamedQuery(name="StdIncidentType.findAll", query="SELECT s FROM StdIncidentType s")
public class StdIncidentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INCIDENT_TYPE_ID", updatable = false, nullable = false)
	private int incidentTypeId;

	@Column(name="INCIDENT_TYPE_NAME", updatable = false, nullable = false)
	private String incidentTypeName;

	@Column(name="APPEND_NEW_EVENTS_FLG", nullable = false)
	private String appendNewEventsFlg;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	//bi-directional many-to-one association to Incident
	@OneToMany(mappedBy="stdIncidentType")
	private List<Incident> incidents;

	//bi-directional many-to-one association to StdComponent
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="COMPONENT_ID")
	private StdComponent stdComponent;

	public StdIncidentType() {
	}

	public int getIncidentTypeId() {
		return this.incidentTypeId;
	}

	public String getIncidentTypeName() {
		return this.incidentTypeName;
	}

	public String getAppendNewEventsFlg() {
		return this.appendNewEventsFlg;
	}

	public List<Incident> getIncidents() {
		return this.incidents;
	}

	public StdComponent getStdComponent() {
		return this.stdComponent;
	}


/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setIncidentTypeId(int incidentTypeId) {
		this.incidentTypeId = incidentTypeId;
	}

	public void setAppendNewEventsFlg(String appendNewEventsFlg) {
		this.appendNewEventsFlg = appendNewEventsFlg;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setIncidentTypeName(String incidentTypeName) {
		this.incidentTypeName = incidentTypeName;
	}

	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}

	public Incident addIncident(Incident incident) {
		getIncidents().add(incident);
		incident.setStdIncidentType(this);

		return incident;
	}

	public Incident removeIncident(Incident incident) {
		getIncidents().remove(incident);
		incident.setStdIncidentType(null);

		return incident;
	}

	public void setStdComponent(StdComponent stdComponent) {
		this.stdComponent = stdComponent;
	}
*/

}