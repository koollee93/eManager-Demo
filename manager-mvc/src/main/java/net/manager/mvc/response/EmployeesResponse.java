package net.manager.mvc.response;

import java.util.List;

public class EmployeesResponse {

	private List<EmployeeResponse> _employeeResponses;


		public List<EmployeeResponse> getEmployeeResponses() {
			return _employeeResponses;
		}

		public void setEmployeeResponses(List<EmployeeResponse> employeeResponses) {
			_employeeResponses = employeeResponses;
		}
}
