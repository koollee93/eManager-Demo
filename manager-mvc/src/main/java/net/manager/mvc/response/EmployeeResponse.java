package net.manager.mvc.response;

public class EmployeeResponse {

	private Long _employeeId;

	private String _employeeName;

	public EmployeeResponse(Long employeeId, String employeeName) {
		_employeeId = employeeId;
		_employeeName = employeeName;
	}

	public Long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		_employeeId = employeeId;
	}

	public String getEmployeeName() {
		return _employeeName;
	}

	public void setEmployeeName(String employeeName) {
		_employeeName = employeeName;
	}
}
