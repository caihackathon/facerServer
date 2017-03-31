package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the STD_COMPONENT database table.
 * 
 */
@Entity
@Table(name="STD_COMPONENT")
@NamedQuery(name="StdComponent.findAll", query="SELECT s FROM StdComponent s")
public class StdComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COMPONENT_ID")
	private int componentId;

	@Column(name="COMPONENT_NAME")
	private String componentName;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="EXPIRE_DATE")
	private Timestamp expireDate;

	//bi-directional many-to-one association to StdApplication
	@ManyToOne
	@JoinColumn(name="APPLICATION_ID")
	private StdApplication stdApplication;

	//bi-directional many-to-one association to StdIncidentType
	@OneToMany(mappedBy="stdComponent")
	private List<StdIncidentType> stdIncidentTypes;

	public StdComponent() {
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

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public StdApplication getStdApplication() {
		return this.stdApplication;
	}

	public void setStdApplication(StdApplication stdApplication) {
		this.stdApplication = stdApplication;
	}

	public List<StdIncidentType> getStdIncidentTypes() {
		return this.stdIncidentTypes;
	}

	public void setStdIncidentTypes(List<StdIncidentType> stdIncidentTypes) {
		this.stdIncidentTypes = stdIncidentTypes;
	}

	public StdIncidentType addStdIncidentType(StdIncidentType stdIncidentType) {
		getStdIncidentTypes().add(stdIncidentType);
		stdIncidentType.setStdComponent(this);

		return stdIncidentType;
	}

	public StdIncidentType removeStdIncidentType(StdIncidentType stdIncidentType) {
		getStdIncidentTypes().remove(stdIncidentType);
		stdIncidentType.setStdComponent(null);

		return stdIncidentType;
	}

}