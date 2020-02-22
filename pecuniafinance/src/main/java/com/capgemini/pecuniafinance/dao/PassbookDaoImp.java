package com.capgemini.pecuniafinance.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.bean.Passbook;

public class PassbookDaoImp implements PassbookDao {
Map<Long, Passbook> Accounts=new HashMap<Long, Passbook>();
	
	public PassbookDaoImp() {
		addSomeAccount();
	}
	public void addSomeAccount() {
		Passbook ac1=new Passbook(100112131234L,2000.0F,99586566L,"ashu",
					Arrays.asList(new AccountSummary(1012121L,LocalDate.now(),10000),
							new AccountSummary(1012115L,LocalDate.now().minusDays(10),3000),
							//new AccountSummary(1012125L,LocalDate.now().minusDays(1),7000),
							//new AccountSummary(1012126L,LocalDate.now().minusDays(2),8000),
		                    //new AccountSummary(1012127L,LocalDate.now().minusDays(12),800),
		                    //new AccountSummary(1012128L,LocalDate.now().minusDays(8),90909),
		                    new AccountSummary(1012129L,LocalDate.now().minusDays(25),9000)));
		Passbook ac2=new Passbook(10011213021L,1000.0F,99586562L,"shailu",
				Arrays.asList(new AccountSummary(10125323L,LocalDate.now().minusDays(100),999),
						new AccountSummary(1012115L,LocalDate.now().minusDays(10),6000),
						//new AccountSummary(1012125L,LocalDate.now().minusDays(1),900),
	                    //new AccountSummary(1012126L,LocalDate.now().minusDays(11),7000),
	                    //new AccountSummary(1012127L,LocalDate.now().minusDays(12),8900),
	                    //new AccountSummary(1012128L,LocalDate.now().minusDays(18),9000),
	                    new AccountSummary(1012129L,LocalDate.now().minusDays(25),1000)));
		
		Accounts.put(ac1.getAccountId(), ac1);
		Accounts.put(ac2.getAccountId(), ac2);
	}
	public boolean addAccount(Passbook account) throws AccountException {
		String str = String.valueOf(account);
		try {
			if(str.matches("[0-9]{1}[0-9]{11}")) {
			if(Accounts.containsKey(account)) {
				return false;
			}
			}
			else
				throw new AccountException("Invalid account number");
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Accounts.put(account.getAccountId(), account);
		
		return true;
	}
	
	
	public Passbook getPassbookById(long id) {
		return Accounts.get(id);
	}
	public boolean updatePassbook(Passbook account) {
		if(!Accounts.containsKey(account.getAccountId())) {
			return false;
		}
		Passbook accountToUpdate=Accounts.get(account.getAccountId());
		accountToUpdate.setBalance(account.getBalance());
		return true;
	}
	public boolean addAmount(long id, float amount) {
		if(!Accounts.containsKey(id)) {
			return false;
		}
		Passbook acc=Accounts.get(id);
		AccountSummary tx=new AccountSummary();
		List<AccountSummary> trns=new ArrayList<AccountSummary>();
		for(AccountSummary t:acc.getTransactions())
		{
			trns.add(t);
		}
		trns.add(tx);
		acc.setTransactions(trns);
		
		return true;
	}


}
class AccountException extends Exception{
	AccountException(String msg){
		super(msg);
	}
}
