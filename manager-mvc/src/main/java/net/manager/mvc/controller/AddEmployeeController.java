package net.manager.mvc.controller;

import net.manager.model.Employee;
import net.manager.mvc.request.AddRequest;
import net.manager.service.EmployeeService;
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
public class AddEmployeeController {

    @Autowired
    private EmployeeService _employeeService;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "addEmployee",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody @Valid AddRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getTitle());

        _employeeService.save(employee);
    }
}
