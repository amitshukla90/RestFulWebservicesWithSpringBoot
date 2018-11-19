package com.springboot.rest.RestWebservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Employee_Rest")
public class Employee extends BaseModel<String>{

		@Id
	    private Long empId;

	    @NotBlank
	    private String empFirstName;

	    @NotBlank
	    private String empLastNameVal;
	    
	    @NotNull
	    private int age;
	    
	    @NotBlank
	    private String salary;

		public Long getEmpId() {
			return empId;
		}

		public String getEmpFirstName() {
			return empFirstName;
		}

		public String getEmpLastNameVal() {
			return empLastNameVal;
		}

		public int getAge() {
			return age;
		}

		public String getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastNameVal=" + empLastNameVal
					+ ", age=" + age + ", salary=" + salary + "]";
		}
	    




}
