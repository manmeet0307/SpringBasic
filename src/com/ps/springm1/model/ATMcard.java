package com.ps.springm1.model;

import com.ps.springm1.card;

public class ATMcard implements card {
    @Override
	public String cardDetails() {
		
		return "ATM Card has been issued Successfully";
	}

}
