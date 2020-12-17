package com.capgemini.employeepayrollapp.exceptions;

public class EmployeePayrollException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmployeePayrollException(String message) {
		super(message);
	}
}