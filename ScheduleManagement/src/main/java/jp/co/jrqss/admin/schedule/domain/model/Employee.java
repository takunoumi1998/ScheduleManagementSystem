package jp.co.jrqss.admin.schedule.domain.model;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private int buildingId;
	private String employeeName;
	private int desireDays;
	private boolean employeeMonday;
	private boolean employeeTuesday;
	private boolean employeeWednesday;
	private boolean employeeThursday;
	private boolean employeeFriday;
	private boolean employeeSaturday;
	private boolean employeeSunday;
}
