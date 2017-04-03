package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the STD_APPLICATION database table.
 * 
 */
@Entity
@Table(name="STD_APPLICATION")
@NamedQueries({
	@NamedQuery(name="StdApplication.find", query="SELECT s FROM StdApplication s")
,	@NamedQuery(name="StdApplication.findAll", query="SELECT s FROM StdApplication s ORDER BY s.applicationName")
})
public class StdApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="APPLICATION_ID", updatable = false, nullable = false)
	private int applicationId;

	@Column(name="APPLICATION_NAME", updatable = false, nullable = false)
	private String applicationName;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	@Column(name="EXPIRE_DATE")
	private Timestamp expireDate;

	//bi-directional many-to-one association to StdComponent
	@OneToMany(mappedBy="stdApplication")
	private List<StdComponent> stdComponents;

	public StdApplication() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public String getApplicationActive() {
		String active = new String();
		
		if ( this.expireDate != null) {
			active = "N";
		} else {
			active = "Y";
		};

		return active;
	}

	public List<StdComponent> getStdComponents() {
		return this.stdComponents;
	}

	
/*
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public void setStdComponents(List<StdComponent> stdComponents) {
		this.stdComponents = stdComponents;
	}

	public StdComponent addStdComponent(StdComponent stdComponent) {
		getStdComponents().add(stdComponent);
		stdComponent.setStdApplication(this);

		return stdComponent;
	}

	public StdComponent removeStdComponent(StdComponent stdComponent) {
		getStdComponents().remove(stdComponent);
		stdComponent.setStdApplication(null);

		return stdComponent;
	}
*/

}