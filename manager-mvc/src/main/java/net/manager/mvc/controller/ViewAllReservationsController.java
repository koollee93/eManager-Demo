package net.manager.mvc.controller;

import net.manager.model.Reservation;
import net.manager.mvc.response.ReservationResponse;
import net.manager.mvc.response.ReservationsResponse;
import net.manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewAllReservationsController {

	@Autowired
	private ReservationService _reservationService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "viewAllReservations",
			method = RequestMethod.GET)
	@ResponseBody
	public ReservationsResponse getAllReservations() {

		List<Reservation> allReservations = _reservationService.getAll();

		List<ReservationResponse> responseList = new ArrayList<>();

		for (Reservation reservation : allReservations) {
			ReservationResponse r = new ReservationResponse();
			r.setNote(reservation.getNote());
			r.setEndDate(reservation.getEndDate());
			r.setStartDate(reservation.getStartDate());
			r.setServiceId(reservation.getServiceId());
			r.setCustomerId(reservation.getCustomerId());
			r.setEmployeeId(reservation.getEmployeeId());
			responseList.add(r);
		}

		ReservationsResponse reservationsResponse = new ReservationsResponse();
		reservationsResponse.setReservationResponse(responseList);

		return reservationsResponse;
	}
}
