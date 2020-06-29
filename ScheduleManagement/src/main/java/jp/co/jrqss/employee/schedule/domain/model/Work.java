package jp.co.jrqss.employee.schedule.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Work {

	private int employee_id;
	private Date work_day;

}
