package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the USER_LOGIN database table.
 * 
 */
@Entity
@Table(name="USER_LOGIN")
@NamedQuery(name="UserLogin.findAll", query="SELECT u FROM UserLogin u")
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name="EXPIRE_DATE")
	private Timestamp expireDate;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="NEXT_PASSWORD_RESET_DATE")
	private Timestamp nextPasswordResetDate;

	@Column(name="PASSWORD")
	private byte[] password;

	@Column(name="RESET_PASSWORD_FLG")
	private String resetPasswordFlg;

	@Column(name="TOKEN")
	private byte[] token;

	public UserLogin() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getNextPasswordResetDate() {
		return this.nextPasswordResetDate;
	}

	public void setNextPasswordResetDate(Timestamp nextPasswordResetDate) {
		this.nextPasswordResetDate = nextPasswordResetDate;
	}

	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getResetPasswordFlg() {
		return this.resetPasswordFlg;
	}

	public void setResetPasswordFlg(String resetPasswordFlg) {
		this.resetPasswordFlg = resetPasswordFlg;
	}

	public byte[] getToken() {
		return this.token;
	}

	public void setToken(byte[] token) {
		this.token = token;
	}

}