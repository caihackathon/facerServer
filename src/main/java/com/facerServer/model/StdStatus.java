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
	@Column(name="STATUS_ID")
	private int statusId;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="SORT_ORDER")
	private int sortOrder;

	@Column(name="STATUS_NAME")
	private String statusName;

	public StdStatus() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}