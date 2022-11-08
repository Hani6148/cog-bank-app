package com.learning.cogbankapp.serviceValidation;

import com.learning.cogbankapp.dto.CustomerRequest;
import com.learning.cogbankapp.model.Customer;

public interface CustomerServiceValidation {

	public Customer save(CustomerRequest c);
	
}
