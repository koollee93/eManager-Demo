package net.manager.mvc.response;

import java.util.List;

public class ReservationsResponse {

	private List<ReservationResponse> _reservationResponse;

	public List<ReservationResponse> getReservationResponse() {
		return _reservationResponse;
	}

	public void setReservationResponse(List<ReservationResponse> reservationResponse) {
		_reservationResponse = reservationResponse;
	}
}
