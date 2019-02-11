package net.manager.mvc.controller;

import net.manager.model.Service;
import net.manager.mvc.request.IdRequest;
import net.manager.mvc.response.TitleResponse;
import net.manager.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ViewServiceContoller {

	@Autowired
	private ServiceService _serviceService;

	@RequestMapping(value = "viewService",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public TitleResponse viewService(@RequestBody @Valid IdRequest request) {
		Optional<Service> customer = _serviceService.findById(request.getId());

		TitleResponse titleResponse = new TitleResponse();
		titleResponse.setTitle(customer.get().getName());

		return titleResponse;
	}
}
