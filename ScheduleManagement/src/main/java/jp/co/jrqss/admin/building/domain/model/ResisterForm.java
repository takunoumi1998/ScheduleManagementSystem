package jp.co.jrqss.admin.building.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ResisterForm {

	@NotBlank(message="数字を入力")
	private int building_id;

	@NotBlank
	private String building_name;

	@NotBlank
	private int building_ninzu;

	@NotBlank
	private String building_time;

	@NotBlank
	private boolean building_monday;

	@NotBlank
	private boolean building_tuesday;

	@NotBlank
	private boolean building_wednesday;

	@NotBlank
	private boolean building_thursday;

	@NotBlank
	private boolean building_friday;

	@NotBlank
	private boolean building_saturday;

	@NotBlank
	private boolean building_sunday;

	@NotBlank
	private String employee_name;

	@NotBlank
	private int building_ad_number;

	@NotBlank
	private String building_address;

	@NotBlank
	private int building_phone_number;

	@Email
	private String building_mail;

}
