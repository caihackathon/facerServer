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
@NamedQueries({
	@NamedQuery(name="StdComponent.find", query="SELECT c FROM StdComponent c")
,	@NamedQuery(name="StdComponent.findAll", query="SELECT c FROM StdComponent c ORDER BY c.componentName")
})
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

	public String getComponentName() {
		return this.componentName;
	}

	public int getApplicationId() {
		return this.stdApplication.getApplicationId();
	}

	public String getApplicationName() {
		return this.stdApplication.getApplicationName();
	}

	public StdApplication getStdApplication() {
		return this.stdApplication;
	}

	public List<StdIncidentType> getStdIncidentTypes() {
		return this.stdIncidentTypes;
	}

	public String getComponentActive() {

		String activeApp = this.stdApplication.getApplicationActive();
		
		String activeComp = new String();
		
		if ( activeApp == "Y" && this.expireDate == null ) {
			activeComp = "Y";			
		} else {
			activeComp = "N";
		};

		return activeComp;
	}


/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public void setStdApplication(StdApplication stdApplication) {
		this.stdApplication = stdApplication;
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

*/

}