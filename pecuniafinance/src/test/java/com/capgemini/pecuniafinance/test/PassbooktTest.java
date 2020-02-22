package com.capgemini.pecuniafinance.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.bean.Passbook;
import com.capgemini.pecuniafinance.dao.PassbookDao;
import com.capgemini.pecuniafinance.dao.PassbookDaoImp;

class PassbooktTest {
 PassbookDao dao;
 Passbook p = new Passbook();
	
	Passbook ac1=new Passbook(100112131234L,2000.0F,99586566L,"ashu",
			Arrays.asList(new AccountSummary(1012121L,LocalDate.now(),10000),
					new AccountSummary(1012115L,LocalDate.now().minusDays(10),3000),
					//new AccountSummary(1012125L,LocalDate.now().minusDays(1),7000),
                    //new AccountSummary(1012126L,LocalDate.now().minusDays(2),8000),
                    //new AccountSummary(1012127L,LocalDate.now().minusDays(12),800),
                    //new AccountSummary(1012128L,LocalDate.now().minusDays(8),90909),
                    new AccountSummary(1012129L,LocalDate.now().minusDays(25),9000)));
@BeforeEach	
public void addAccount() {
	dao =new PassbookDaoImp();
	
	
	
	
}

	

	@Test
	void testAddSomeAccount() {
		assertEquals(0,p.getAccountId());
		

}
}
