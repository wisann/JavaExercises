package entities;

import entities.exceptions.Exception; 

public class Account {
	private Integer number; // number of the account
	private String holder; // name of the holder
	private Double balance; // balance of the account
	private Double withdrawLimit; // limit maximum to be withdrew  
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	/**
	 * this method represents the deposit operation
	 * @param amount is the amount to be added into account
	 */
	public void deposit(Double amount) {

		balance += amount; // adds the amount typed into account
	}
	/**
	 * this method represents the withdraw operation
	 * @param amount is the amount to be withdrew of the account
	 * @throws Exception  if there is enough balance, if it wont exceeds the withdraw limit, and if the balance is different than 0 
	 */
	public void withdraw(Double amount) throws Exception {
		if (getBalance() == null|| amount > getBalance()) {
			throw new Exception("isufficient balance: cannot withdraw more than the current balance.");
			}
		
		if (amount > getWithdrawLimit()){
			throw new Exception("The amount exceeds withdraw limit");
			
		}
		balance -= amount; // remove the amount typed from the account
	}

}
