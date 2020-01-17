package com.aniket.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_Table")
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name="ACCOUNT_ID")
	private int accId;
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	@Column(name="ACCOUNT_NUMBER",unique=true)
	private String accountNumber;
	@Column(name="BALANCE")
	private double balance;
	
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
