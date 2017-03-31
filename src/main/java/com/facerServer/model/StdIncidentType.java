package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
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
	@Column(name="INCIDENT_TYPE_ID")
	private int incidentTypeId;

	@Column(name="APPEND_NEW_EVENTS_FLG")
	private String appendNewEventsFlg;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="INCIDENT_TYPE_NAME")
	private String incidentTypeName;

	//bi-directional many-to-one association to Incident
	@OneToMany(mappedBy="stdIncidentType")
	private List<Incident> incidents;

	//bi-directional many-to-one association to StdComponent
	@ManyToOne
	@JoinColumn(name="COMPONENT_ID")
	private StdComponent stdComponent;

	public StdIncidentType() {
	}

	public int getIncidentTypeId() {
		return this.incidentTypeId;
	}

	public void setIncidentTypeId(int incidentTypeId) {
		this.incidentTypeId = incidentTypeId;
	}

	public String getAppendNewEventsFlg() {
		return this.appendNewEventsFlg;
	}

	public void setAppendNewEventsFlg(String appendNewEventsFlg) {
		this.appendNewEventsFlg = appendNewEventsFlg;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getIncidentTypeName() {
		return this.incidentTypeName;
	}

	public void setIncidentTypeName(String incidentTypeName) {
		this.incidentTypeName = incidentTypeName;
	}

	public List<Incident> getIncidents() {
		return this.incidents;
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

	public StdComponent getStdComponent() {
		return this.stdComponent;
	}

	public void setStdComponent(StdComponent stdComponent) {
		this.stdComponent = stdComponent;
	}

}