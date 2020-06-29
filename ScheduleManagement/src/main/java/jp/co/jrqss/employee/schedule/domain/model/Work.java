package jp.co.jrqss.employee.schedule.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Work {
	private int buildingId;
	private int workNumber;
	private Date workDate;
	private int employee_id;
	private Date desireDate;
}
