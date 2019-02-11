package net.manager.mvc.response;

public class CustomerResponse {

	private Long _customerId;

	private String _customerName;

	public CustomerResponse(Long customerId, String customerName) {
		_customerId = customerId;
		_customerName = customerName;
	}

	public Long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(Long customerId) {
		_customerId = customerId;
	}

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String customerName) {
		_customerName = customerName;
	}
}
