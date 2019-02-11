package net.manager.mvc.controller;

import net.manager.model.Reservation;
import net.manager.mvc.request.IdRequest;
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
import java.util.Optional;

@Controller
public class DeleteReservationController {

	@Autowired
	private ReservationService _reservationService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "deleteReservation",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createAccount(@RequestBody @Valid IdRequest request) {

		Optional<Reservation> reservation = _reservationService.findById(request.getId());

		reservation.ifPresent(r -> _reservationService.delete(r));
	}
}
