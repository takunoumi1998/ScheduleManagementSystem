package jp.co.jrqss.admin.building.domain.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RegisterForm {

	// 入力必須
	@NotBlank
	private int buildingId;

	@NotBlank
	private String buildingName;

	@NotBlank
	private int buildingNinzu;

	@NotBlank
	private int buildingTime;

	private boolean buildingMonday;

	private boolean buildingTuesday;

	private boolean buildingWednesday;

	private boolean buildingThursday;

	private boolean buildingFriday;

	private boolean buildingSaturday;

	private boolean buildingSunday;

}
