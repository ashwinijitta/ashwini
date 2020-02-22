package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.Passbook;

public interface PassbookService {
public Passbook getPassbookInfo(long id);
	
	public boolean addAmount(long id, float amount);
	
	public Passbook getaccountSummary(int id);

}
