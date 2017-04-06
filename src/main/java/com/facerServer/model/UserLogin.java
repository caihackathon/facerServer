package com.facerServer.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.sql.Timestamp;


/**
 * The persistent class for the USER_LOGIN database table.
 * 
 */
@Entity
@Table(name="USER_LOGIN")
@JsonPropertyOrder({ "userId", "firstName", "lastName", "emailAddress"
	, "userActive", "resetPasswordFlg" })
@NamedQueries({
	@NamedQuery(name="UserLogin.findByUserId", query="SELECT u FROM UserLogin u ORDER BY u.userId")
,	@NamedQuery(name="UserLogin.findbyLastName", query="SELECT u FROM UserLogin u ORDER BY u.lastName")
})
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID", updatable = false, nullable = false)
	private int userId;

	@Column(name="FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name="LAST_NAME", nullable = false)
	private String lastName;

	@Column(name="EMAIL_ADDRESS", nullable = false)
	private String emailAddress;

	@Column(name="CREATE_DATE", updatable = false, nullable = false)
	private Timestamp createDate;

	@Column(name="EXPIRE_DATE")
	private Timestamp expireDate;

	@Column(name="PASSWORD")
	private byte[] password;

	@Column(name="TOKEN")
	private byte[] token;

	@Column(name="RESET_PASSWORD_FLG")
	private String resetPasswordFlg;

	@Column(name="NEXT_PASSWORD_RESET_DATE")
	private Timestamp nextPasswordResetDate;

	public UserLogin() {
	}

	public int getUserId() {
		return this.userId;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public String getUserActive() {
		String active = new String();
		
		if ( this.expireDate != null) {
			active = "N";
		} else {
			active = "Y";
		};

		return active;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getResetPasswordFlg() {
		return this.resetPasswordFlg;
	}

/*
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public String getNextPasswordResetDate() {
		if ( this.nextPasswordResetDate == null ) {
			return "";
		} else {
			return this.nextPasswordResetDate.toString();			
		}
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public byte[] getPassword() {
		return this.password;
	}

	public byte[] getToken() {
		return this.token;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public void setToken(byte[] token) {
		this.token = token;
	}

	public void setResetPasswordFlg(String resetPasswordFlg) {
		this.resetPasswordFlg = resetPasswordFlg;
	}

	public void setNextPasswordResetDate(Timestamp nextPasswordResetDate) {
		this.nextPasswordResetDate = nextPasswordResetDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}


*/
	
}