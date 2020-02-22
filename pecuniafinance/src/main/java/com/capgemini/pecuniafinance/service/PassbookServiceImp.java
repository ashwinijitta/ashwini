package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.Passbook;
import com.capgemini.pecuniafinance.dao.PassbookDao;
import com.capgemini.pecuniafinance.dao.PassbookDaoImp;

public class PassbookServiceImp implements PassbookService {
	PassbookDao passbookdao=new PassbookDaoImp();

	public Passbook getPassbookInfo(long id) {
		return passbookdao.getPassbookById(id);
	}

	public boolean addAmount(long id, float amount) {
		return passbookdao.addAmount(id, amount);
	}

	public Passbook getaccountSummary(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
