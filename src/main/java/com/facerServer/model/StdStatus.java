package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the STD_STATUS database table.
 * 
 */
@Entity
@Table(name="STD_STATUS")
@NamedQuery(name="StdStatus.findAll", query="SELECT s FROM StdStatus s")
public class StdStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STATUS_ID", updatable = false, nullable = false)
	private int statusId;

	@Column(name="STATUS_NAME", updatable = false, nullable = false)
	private String statusName;

	@Column(name="SORT_ORDER", nullable = false)
	private int sortOrder;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	public StdStatus() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
*/
	
}