package co.simplon.entities;

import java.util.Date;

public class Account {
	private int NumAt;
	private Date DateCreation;
	private double Balance;
	private int IdCust ; 
	
	public Account(int numAt, Date dateCreation, double balance,int idCust) {
		this.NumAt = numAt;
		this.DateCreation = dateCreation;
		this.Balance = balance ; 
		this.IdCust =idCust;
	}

	@Override
	public String toString() {
		return "Account [Account number=" + NumAt + ",Creation Date = " + DateCreation + ",Balance=" + Balance+",Customer number = "+IdCust+ "]";
	}

	public int getNumAt() {
		return NumAt;
	}

	public void setNumAt(int NumAt) {
		this.NumAt = NumAt;
	}

	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date DateCreation) {
		this.DateCreation = DateCreation;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double Balance) {
		this.Balance =Balance;
	}
	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int IdCust) {
		this.IdCust = IdCust;
	}
	}




















