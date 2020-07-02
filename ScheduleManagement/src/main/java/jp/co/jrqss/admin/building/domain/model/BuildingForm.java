package jp.co.jrqss.admin.building.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class BuildingForm {

	// 入力必須
		@NotBlank(message = "必須項目です")
		private int buildingId;

		@NotBlank(message = "必須項目です")
		private String buildingName;

		@NotBlank(message = "必須項目です")
		private String EmployeeName;

		@NotBlank(message = "必須項目です")
		private int buildingNinzu;

		@NotBlank(message = "必須項目です")
		private int buildingTime;

		private boolean buildingMonday;

		private boolean buildingTuesday;

		private boolean buildingWednesday;

		private boolean buildingThursday;

		private boolean buildingFriday;

		private boolean buildingSaturday;

		private boolean buildingSunday;

		@NotBlank(message = "必須項目です")
		private String buildingAdNumber;

		@NotBlank(message = "必須項目です")
		private String buildingAddress;

		@NotBlank(message = "必須項目です")
		private String buildingPhoneNumber;

		@Email(message = "メールアドレスを入力してください")
		private String buildingMail;

		private String buildingStart;
		private String buildingEnd;



}
