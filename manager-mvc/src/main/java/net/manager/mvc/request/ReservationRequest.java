package net.manager.mvc.request;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.SafeHtml;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class ReservationRequest {

	private Long _customerId;
	private Long _employeeId;
	private Long _serviceId;
	private String _note;
	private Date _startDate;
	private Date _endDate;
	private Boolean _allDay;

	@NotNull
	public Long getCustomerId() {
		return _customerId;
	}


	public void setCustomerId(Long customerId) {
		_customerId = customerId;
	}

	@NotNull
	public Long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		_employeeId = employeeId;
	}

	@NotNull
	public Long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(Long serviceId) {
		_serviceId = serviceId;
	}

	@SafeHtml
	@Length(max = 255)
	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	@NotNull
	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@NotNull
	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	@NotNull
	public Boolean getAllDay() {
		return _allDay;
	}

	public void setAllDay(Boolean allDay) {
		_allDay = allDay;
	}
}


