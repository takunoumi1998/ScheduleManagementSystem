package jp.co.jrqss.admin.building.domain.model;

import lombok.Data;

@Data
public class Building {

	private int building_id;
	private String building_name;
	private int building_ninzu;
	private String building_time;
	private boolean building_monday;
	private boolean building_tuesday;
	private boolean building_wednesday;
	private boolean building_thursday;
	private boolean building_friday;
	private boolean building_saturday;
	private boolean building_sunday;
	private String employee_name;
	private int building_ad_number;
	private String building_address;
	private int building_phone_number;
	private String building_mail;

}
