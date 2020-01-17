package com.aniket.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="User_Table")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	@Column(name="FIRST_NAME")
	private String firstname;
	@Column(name="LAST_NAME")
	private String lastname;
	@Column(name="EMAIL",unique=true)
	private String email;
	//attribute nmae is used to give userdefined name .
	//unique is to tell consider column
	//of table as unique column, duplicate will not be consider
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASSWORD")
	private String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@OneToOne(cascade=CascadeType.ALL)
	//where ver relationship one to one
	//or one object has only one,then we must use@oneTone Annotation 
	//cascade is an attribute which is used in association concept
	//cascade attribute tells hibernate transfer all operation i.e current operation from parent to child object.
	//
	private Account account;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Account getAcoount() {
		return account;
	}
	public void setAcoount(Account acoount)
	{
		this.account = acoount;
	}
	
	
	

}
