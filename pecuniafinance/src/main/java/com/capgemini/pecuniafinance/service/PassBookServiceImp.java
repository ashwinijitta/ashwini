package com.capgemini.pecuniafinance.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.pecuniafianance.dao.PassBookDaoImp;
import com.capgemini.pecuniafinance.bean.PassBookMaintanance;
import com.capgemini.pecuniafinance.ui.PassBook;

public class PassBookServiceImp implements IPassBookService {
	PassBookDaoImp dao = new PassBookDaoImp();

	

	public boolean updatePassbook(PassBookMaintanance account){
		
		
		return dao.getupdatepassbook(id);
	}

	public PassBook getPassbookById(long id) {
	
		
		return dao.getPassbookById(id);
	
	if(AccountId.length(!=12){
		throw new Exception("Invalid account number");
	}
	


	
}
}


	