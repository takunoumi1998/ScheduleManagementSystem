package jp.co.jrqss.admin.building.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class BuildingForm {


		@NotBlank(message = "{require_check}")  // 入力必須
		@Pattern(regexp = "^[0-9]+$", message = "{pattern_check}")  // 半角数字のみ
		private int buildingId;

		@NotBlank(message = "{require_check}")
		private String buildingName;

		@NotBlank(message = "{require_check}")
		@Pattern(regexp = "^[0-9]+$", message = "{pattern_check}")
		private int buildingNinzu;

		@NotBlank(message = "{require_check}")
		@Pattern(regexp = "^[0-9]+$", message = "{pattern_check}")
		private int buildingTime;

		private boolean buildingMonday;

		private boolean buildingTuesday;

		private boolean buildingWednesday;

		private boolean buildingThursday;

		private boolean buildingFriday;

		private boolean buildingSaturday;

		private boolean buildingSunday;

		@NotBlank(message = "{require_check}")
		@Pattern(regexp = "^[0-9]+$", message = "{pattern_check}")
		@Length(min = 4,max = 7, message = "{length_check}")
		private String buildingAdNumber;

		@NotBlank(message = "{require_check}")
		private String buildingAddress;

		@NotBlank(message = "{require_check}")
		@Pattern(regexp = "^[0-9]+$", message = "{pattern_check}")
		@Length(min = 10,max = 11, message = "{length_check}")  // 長さ10から11桁まで
		private String buildingPhoneNumber;

		@Email(message = "{email_check}")
		private String buildingMail;


}
