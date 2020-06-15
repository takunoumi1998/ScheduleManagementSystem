package jp.co.jrqss.admin.employee.domain.model;

import lombok.Data;

@Data
public class Employee {

	private int employee_Id;
	private int building_Id;
	private String employee_Name;
	private int desire_Days;
	private boolean employee_Monday;
	private boolean employee_Tuesday;
	private boolean employee_Wednesday;
	private boolean employee_Thursday;
	private boolean employee_Friday;
	private boolean employee_Saturday;
	private boolean employee_Sunday;
	private String employee_Ad_Number;
	private String employee_Phone_Number;
	private String employee_Mail;

}
