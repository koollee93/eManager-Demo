package net.manager.mvc.response;

import java.util.Date;

public class ReservationResponse {

	private Long _customerId;
	private Long _employeeId;
	private Long _serviceId;
	private String _note;
	private Date _startDate;
	private Date _endDate;
	private Boolean _allDay;

	public Long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(Long customerId) {
		_customerId = customerId;
	}

	public Long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		_employeeId = employeeId;
	}

	public Long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(Long serviceId) {
		_serviceId = serviceId;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public Boolean getAllDay() {
		return _allDay;
	}

	public void setAllDay(Boolean allDay) {
		_allDay = allDay;
	}
}
