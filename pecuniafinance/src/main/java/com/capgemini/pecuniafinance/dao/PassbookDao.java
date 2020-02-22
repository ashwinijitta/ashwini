package com.capgemini.pecuniafinance.dao;

import com.capgemini.pecuniafinance.bean.Passbook;

public interface PassbookDao {
	public boolean addAccount(Passbook account) throws AccountException;
	public Passbook getPassbookById(long id);
	public boolean updatePassbook(Passbook account);
	public boolean addAmount(long id,float amount);
}
