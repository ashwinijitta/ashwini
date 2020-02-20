package com.capgemini.pecuniafianance.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.bean.PassBookMaintanance;
import com.capgemini.pecuniafinance.ui.PassBook;

public class PassBookDaoImp implements IDaoPassBook {
	Map<Long, PassBook> Accounts = new HashMap<Long, PassBook>();

	public void PassbookDaoimpl() {
		addSomeAccount();
	}

	public void addSomeAccount() {
		PassBook ac1 = new PassBook(1001121312L, 2000.0F, 99586566L, "ashu",
				Arrays.asList(new AccountSummary(1012121L, LocalDate.now(), 10000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(10), 3000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(1), 7000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(2), 8000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(12), 800),
						new AccountSummary(1012115L, LocalDate.now().minusDays(1), 909909),
						new AccountSummary(1012115L, LocalDate.now().minusDays(25), 9000)));
		PassBook ac2 = new PassBook(1001121302L, 1000.0F, 99586562L, "shailu",
				Arrays.asList(new AccountSummary(1012121L, LocalDate.now().minusDays(100), 999),
						new AccountSummary(1012115L, LocalDate.now().minusDays(10), 6000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(1), 900),
						new AccountSummary(1012115L, LocalDate.now().minusDays(11), 7000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(12), 8900),
						new AccountSummary(1012115L, LocalDate.now().minusDays(18), 9000),
						new AccountSummary(1012115L, LocalDate.now().minusDays(25), 1000)));

		Accounts.put(ac1.getAccountId(), ac1);
		Accounts.put(ac2.getAccountId(), ac2);
	}

	public boolean updatePassbook(PassBookMaintanance account) {

		// TODO Auto-generated method stub
		if (!Accounts.containsKey(account.getAccountId())) {
			return false;
		}
		PassBook accountToUpdate = Accounts.get(account.getAccountId());
		accountToUpdate.setBalance(account.getBalance());
		return true;

	}

	public PassBook getPassbookById(long id) {
		// TODO Auto-generated method stub
		return Accounts.get(id);
	}

}
