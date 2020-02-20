package com.capgemini.pecuniafinance.service;

import java.sql.Date;

import com.capgemini.pecuniafinance.bean.PassBookMaintanance;
import com.capgemini.pecuniafinance.ui.PassBook;

public interface IPassBookService {

	public PassBook getPassbookById(long id);
	public boolean updatePassbook(PassBookMaintanance account);
	
	}
	

	


