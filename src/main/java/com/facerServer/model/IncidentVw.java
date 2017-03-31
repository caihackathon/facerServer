package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the INCIDENT_VW database table.
 * 
 */
@Entity
@Table(name="INCIDENT_VW")
@NamedQuery(name="IncidentVw.findAll", query="SELECT i FROM IncidentVw i")
public class IncidentVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APPLICATION_ID")
	private int applicationId;

	@Column(name="APPLICATION_NAME")
	private String applicationName;

	@Column(name="APPLICATION_STATUS_ID")
	private int applicationStatusId;

	@Column(name="APPLICATION_STATUS_NAME")
	private String applicationStatusName;

	@Column(name="COMPONENT_ID")
	private int componentId;

	@Column(name="COMPONENT_NAME")
	private String componentName;

	@Column(name="COMPONENT_STATUS_ID")
	private int componentStatusId;

	@Column(name="COMPONENT_STATUS_NAME")
	private String componentStatusName;

	@Column(name="INCIDENT_DATE")
	private Timestamp incidentDate;

	@Column(name="INCIDENT_ID")
	private int incidentId;

	@Column(name="INCIDENT_RESOLVED_DATE")
	private Timestamp incidentResolvedDate;

	@Column(name="INCIDENT_TYPE_ID")
	private int incidentTypeId;

	@Column(name="INCIDENT_TYPE_NAME")
	private String incidentTypeName;

	@Column(name="SEVERITY_ID")
	private int severityId;

	@Column(name="SEVERITY_NAME")
	private String severityName;

	@Column(name="SEVERITY_SORT_ORDER")
	private int severitySortOrder;

	public IncidentVw() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public int getApplicationStatusId() {
		return this.applicationStatusId;
	}

	public void setApplicationStatusId(int applicationStatusId) {
		this.applicationStatusId = applicationStatusId;
	}

	public String getApplicationStatusName() {
		return this.applicationStatusName;
	}

	public void setApplicationStatusName(String applicationStatusName) {
		this.applicationStatusName = applicationStatusName;
	}

	public int getComponentId() {
		return this.componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public int getComponentStatusId() {
		return this.componentStatusId;
	}

	public void setComponentStatusId(int componentStatusId) {
		this.componentStatusId = componentStatusId;
	}

	public String getComponentStatusName() {
		return this.componentStatusName;
	}

	public void setComponentStatusName(String componentStatusName) {
		this.componentStatusName = componentStatusName;
	}

	public Timestamp getIncidentDate() {
		return this.incidentDate;
	}

	public void setIncidentDate(Timestamp incidentDate) {
		this.incidentDate = incidentDate;
	}

	public int getIncidentId() {
		return this.incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public Timestamp getIncidentResolvedDate() {
		return this.incidentResolvedDate;
	}

	public void setIncidentResolvedDate(Timestamp incidentResolvedDate) {
		this.incidentResolvedDate = incidentResolvedDate;
	}

	public int getIncidentTypeId() {
		return this.incidentTypeId;
	}

	public void setIncidentTypeId(int incidentTypeId) {
		this.incidentTypeId = incidentTypeId;
	}

	public String getIncidentTypeName() {
		return this.incidentTypeName;
	}

	public void setIncidentTypeName(String incidentTypeName) {
		this.incidentTypeName = incidentTypeName;
	}

	public int getSeverityId() {
		return this.severityId;
	}

	public void setSeverityId(int severityId) {
		this.severityId = severityId;
	}

	public String getSeverityName() {
		return this.severityName;
	}

	public void setSeverityName(String severityName) {
		this.severityName = severityName;
	}

	public int getSeveritySortOrder() {
		return this.severitySortOrder;
	}

	public void setSeveritySortOrder(int severitySortOrder) {
		this.severitySortOrder = severitySortOrder;
	}

}