package net.manager.mvc.request;

public class EditReservationRequest extends ReservationRequest {

	private Long _reservationId;

	public Long getReservationId() {
		return _reservationId;
	}

	public void setReservationId(Long reservationId) {
		_reservationId = reservationId;
	}
}
