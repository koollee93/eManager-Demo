package net.manager.model;


import org.hibernate.annotations.BatchSize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "reservation")
@BatchSize(size = 100)
public class Reservation implements Identifiable {

	private Long reservationId;

	@Column(name = "reservation_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	private Long _customerId;
	private Long _employeeId;
	private Long _serviceId;
	private String _note;
	private Date _startDate;
	private Date _endDate;
	private Boolean _allDay;

	@Column(name = "all_day", nullable = false)
	public Boolean getAllDay() {
		return _allDay;
	}

	public void setAllDay(Boolean allDay) {
		_allDay = allDay;
	}

	@Transient
	@Override
	public Long getIdentifier() {
		return reservationId;
	}


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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Reservation that = (Reservation) o;
		return Objects.equals(reservationId, that.reservationId) &&
				Objects.equals(_customerId, that._customerId) &&
				Objects.equals(_employeeId, that._employeeId) &&
				Objects.equals(_serviceId, that._serviceId) &&
				Objects.equals(_note, that._note) &&
				Objects.equals(_startDate, that._startDate) &&
				Objects.equals(_endDate, that._endDate) &&
				Objects.equals(_allDay, that._allDay);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reservationId, _customerId, _employeeId, _serviceId, _note, _startDate, _endDate, _allDay);
	}

	public Long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(Long serviceId) {
		_serviceId = serviceId;
	}

	@Column(name = "note", nullable = true)
	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	@Column(name = "start_date", nullable = false)
	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@Column(name = "end_date", nullable = false)
	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}
}
