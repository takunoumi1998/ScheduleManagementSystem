package jp.co.jrqss.admin.schedule.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Work {
	private int workId;
	private int buildingId;
	private int employeeId;
	private int workNumber;
	private int workWeek;
	private int workDay;
	private Date workDate;
}
