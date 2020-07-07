package jp.co.jrqss.employee.schedule.domain.model;

import lombok.Data;

@Data
public class DesireForm {

	private int buildingId;
	private int workNumber;
	private String workDate;
	private int employeeId;
	private String desireDate;

}
