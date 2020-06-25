package jp.co.jrqss.admin.building.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ChangeForm {

	@NotBlank(message = "必須項目です")
	private int building_id;

	@NotBlank(message = "必須項目です")
	private String building_name;

	@NotBlank(message = "必須項目です")
	private int building_ninzu;

	@NotBlank(message = "必須項目です")
	private int building_time;

	private boolean building_monday;

	private boolean building_tuesday;

	private boolean building_wednesday;

	private boolean building_thursday;

	private boolean building_friday;

	private boolean building_saturday;

	private boolean building_sunday;

	@NotBlank(message = "必須項目です")
	private int building_ad_number;

	@NotBlank(message = "必須項目です")
	private String building_address;

	@NotBlank(message = "必須項目です")
	private int building_phone_number;

	@Email(message = "メールアドレスを入力してください")
	private String building_mail;

}
