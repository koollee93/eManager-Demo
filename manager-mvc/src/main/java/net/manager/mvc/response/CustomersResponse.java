package net.manager.mvc.response;

import java.util.List;

public class CustomersResponse {

	List<CustomerResponse> _customerResponses;

	public List<CustomerResponse> getCustomerResponses() {
		return _customerResponses;
	}

	public void setCustomerResponses(List<CustomerResponse> customerResponses) {
		_customerResponses = customerResponses;
	}
}
