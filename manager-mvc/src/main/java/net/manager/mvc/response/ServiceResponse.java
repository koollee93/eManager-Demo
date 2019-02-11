package net.manager.mvc.response;

public class ServiceResponse {

	private Long _serviceId;

	private String _serviceTitle;

	public ServiceResponse(Long serviceId, String serviceTitle) {
		_serviceId = serviceId;
		_serviceTitle = serviceTitle;
	}

	public Long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(Long serviceId) {
		_serviceId = serviceId;
	}

	public String getServiceTitle() {
		return _serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		_serviceTitle = serviceTitle;
	}
}
