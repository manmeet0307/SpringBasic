package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.card;

public class SavingAccount implements Account {
	
	private card atmCard;
	
	public SavingAccount(card card) {
		atmCard = card;
	}
	
	@Override
	public String createAccount() {
		return ("saving account created successfully") ;
	}
	@Override
	public String cardDetails( ) {
		return atmCard.cardDetails();
	}

}
