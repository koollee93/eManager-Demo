package net.manager.mvc.controller;

import net.manager.model.Service;
import net.manager.mvc.response.ServiceResponse;
import net.manager.mvc.response.ServicesResponse;
import net.manager.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewAllServicesController {

	@Autowired
	private ServiceService _serviceService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "viewAllServices",
			method = RequestMethod.GET)
	@ResponseBody
	public ServicesResponse getAllServices() {

		List<Service> allServices = _serviceService.getAll();

		List<ServiceResponse> responseList = new ArrayList<>();

		for (Service service : allServices) {
			responseList.add(new ServiceResponse(service.getServiceId(), service.getName()));
		}

		ServicesResponse servicesResponse = new ServicesResponse();
		servicesResponse.setServicesResponse(responseList);

		return servicesResponse;
	}
}
