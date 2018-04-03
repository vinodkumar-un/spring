package com.bppa.beans;

import com.bppa.valueobjects.EmployeeValueObject;

public abstract class UpdateEmployeeController {
	public void editEmployee(int empNo, String firstName, String lastName,
			float salary) {
		EmployeeValueObject empVO = null;

		empVO = lookupEmployeeVO();
		empVO.setEmpNo(empNo);
		empVO.setFirstName(firstName);
		empVO.setLastName(lastName);
		empVO.setSalary(salary);
		empVO.setCreatedBy("sriman");
		empVO.setLastModifiedBy("sriman");

		// pass it to accessor
		System.out.println("passing value object " + empVO + " to accessor");

	}

	public abstract EmployeeValueObject lookupEmployeeVO();
}
