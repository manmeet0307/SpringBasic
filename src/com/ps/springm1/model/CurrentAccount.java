package com.ps.springm1.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.ps.springm1.Account;
import com.ps.springm1.card;

public class CurrentAccount implements Account {
	
	@Autowired
	private card creditCard;
	public void setCreditCard(card creditCard) {
		this.creditCard = creditCard;
	}

	
	@Override
	public String createAccount() {
		return (" Current account created successfully") ;

	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.creditCard.cardDetails();
	}
	
	public void onInit() {
		System.out.println("oninit");
	}
	
	public void onDestroy() {
		System.out.println("onDestroy");
	}


}
