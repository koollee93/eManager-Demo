package net.manager.mvc.controller;

import net.manager.model.Reservation;
import net.manager.mvc.request.ReservationRequest;
import net.manager.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class AddReservationController {
	@Autowired
	private ReservationService _reservationService;

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "addReservation",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addReservation(@RequestBody @Valid ReservationRequest request) {
		Reservation reservation = new Reservation();
		reservation.setCustomerId(request.getCustomerId());
		reservation.setEmployeeId(request.getEmployeeId());
		reservation.setAllDay(request.getAllDay());
		reservation.setStartDate(request.getStartDate());
		reservation.setEndDate(request.getEndDate());
		reservation.setServiceId(request.getServiceId());
		reservation.setNote(request.getNote());

		_reservationService.save(reservation);
	}

}
