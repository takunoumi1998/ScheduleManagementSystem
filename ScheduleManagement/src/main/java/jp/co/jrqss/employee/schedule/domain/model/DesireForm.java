package jp.co.jrqss.employee.schedule.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class DesireForm {

	private int buildingId;
	private int workNumber;
	private Date workDate;
	private int employeeId;
	private Date desireDate;

}
