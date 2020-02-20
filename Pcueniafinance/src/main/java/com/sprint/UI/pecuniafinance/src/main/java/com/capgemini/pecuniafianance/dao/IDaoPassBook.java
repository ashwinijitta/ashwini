package com.capgemini.pecuniafianance.dao;

import java.util.HashMap;

import com.capgemini.pecuniafinance.bean.PassBookMaintanance;
import com.capgemini.pecuniafinance.ui.PassBook;

public interface IDaoPassBook {
	
	public PassBook getPassbookById(long id);
	public boolean updatePassbook(PassBookMaintanance account);
	
	
	}
		
	


