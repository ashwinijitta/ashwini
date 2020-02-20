package com.capgemini.pecuniafinance.ui;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.service.PassBookServiceImp;

public class PassBook {
	static PassBookServiceImp passbookService = new PassBookServiceImp();
	static Scanner sc = new Scanner(System.in);
	
	
	public PassBook(long l, float f, long m, String string, List<AccountSummary> list) {
		
	}

	public static void main(String[] args) {
		for(;;) {
			int choice;
			System.out.println("Enter your choice:");
			System.out.println("1-Get PassBook info");
			System.out.println("2-AccountSummary");
			System.out.println("3-Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				getPassbookInfo();
				
				break;
			case 2:
				accountSummary();
				break;
			case 3:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		

	}

	private static void accountSummary() {
		System.out.println("Enter Account id:");
		long id = sc.nextLong();
		int d1,d2;
		int m1,m2;
		int y1,y2;
		System.out.println("please enter after date");
		d1 = sc.nextInt();
		m1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("please enter before date:");
		d2 = sc.nextInt();
		m2 = sc.nextInt();
		y2 = sc.nextInt();
		PassBook acc = passbookService.getPassbookById(id);
		if(acc!=null) {
			System.out.println("Account id: "+acc.getAccountId());
			System.out.println("Current balance : "+acc.getBalance());
			
		
		}
		else {
			System.out.println("Account not valid");
		}
		
		
	}


	private String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void getPassbookInfo() {
		System.out.println("Enter Account id");
		long id = sc.nextLong();
		PassBook acc = passbookService.getPassbookById(id);
		if(acc!=null) {
			System.out.println("Account id: "+acc.getAccountId());
			System.out.println("Current balance : "+acc.getBalance());
			
		
		}
		else {
			System.out.println("Account not found");
		}
		
		
		
		
		
	}

	public Long getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBalance(float balance) {
		// TODO Auto-generated method stub
		
	}

	
}