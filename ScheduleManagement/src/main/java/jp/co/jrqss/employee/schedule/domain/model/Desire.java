package jp.co.jrqss.employee.schedule.domain.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Desire {
	private int building_id;
	private int work_number;
	private Date work_date;
	private int employee_id;
	private Date desire_date;

}
