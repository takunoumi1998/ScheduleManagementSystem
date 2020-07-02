package jp.co.jrqss.employee.schedule.domain.model;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

@Data
public class Work {
	private int buildingId;
	private int employeeId;
	private int workNumber;
	private int workWeek;
	private int workDay;
	private Date workDate;

	private String buildingName;
	private Time buildingStart;
	private Time buildingEnd;
}

