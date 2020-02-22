package com.capgemini.pecuniafinance.bean;

import java.time.LocalDate;

public class AccountSummary {
	long transactionId;
	LocalDate transactionDate;
	float amounttransmitted;
	
	
	public AccountSummary() {
		// TODO Auto-generated constructor stub
	}


	public long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}


	public float getAmounttransmitted() {
		return amounttransmitted;
	}


	public void setAmounttransmitted(float amounttransmitted) {
		this.amounttransmitted = amounttransmitted;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amounttransmitted);
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + (int) (transactionId ^ (transactionId >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountSummary other = (AccountSummary) obj;
		if (Float.floatToIntBits(amounttransmitted) != Float.floatToIntBits(other.amounttransmitted))
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (transactionId != other.transactionId)
			return false;
		return true;
	}


	public AccountSummary(long transactionId, LocalDate transactionDate, float amounttransmitted) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.amounttransmitted = amounttransmitted;
	}


	@Override
	public String toString() {
		return "AccountSummary [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", amounttransmitted=" + amounttransmitted + "]";
	}
	

}
