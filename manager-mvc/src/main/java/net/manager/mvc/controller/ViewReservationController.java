package net.manager.mvc.controller;

import net.manager.model.Reservation;
import net.manager.mvc.request.IdRequest;
import net.manager.mvc.response.ReservationResponse;
import net.manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ViewReservationController {

	@Autowired
	private ReservationService _reservationService;

	@RequestMapping(value = "viewReservation",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ReservationResponse viewReservation(@RequestBody @Valid IdRequest request) {
		Reservation reservation = _reservationService.findById(request.getId()).get();

		ReservationResponse reservationResponse = new ReservationResponse();
		reservationResponse.setAllDay(reservation.getAllDay());
		reservationResponse.setCustomerId(reservation.getCustomerId());
		reservationResponse.setEmployeeId(reservation.getEmployeeId());
		reservationResponse.setServiceId(reservation.getServiceId());
		reservationResponse.setStartDate(reservation.getStartDate());
		reservationResponse.setEndDate(reservation.getEndDate());
		reservationResponse.setNote(reservation.getNote());

		return reservationResponse;
	}
}
