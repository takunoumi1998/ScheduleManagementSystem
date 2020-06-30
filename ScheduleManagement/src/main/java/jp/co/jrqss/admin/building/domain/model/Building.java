package jp.co.jrqss.admin.building.domain.model;

import lombok.Data;

@Data
public class Building {

	private int buildingId;
	private String buildingName;
	private int buildingNinzu;
	private int buildingTime;
	private boolean buildingMonday;
	private boolean buildingTuesday;
	private boolean buildingWednesday;
	private boolean buildingThursday;
	private boolean buildingFriday;
	private boolean buildingSaturday;
	private boolean buildingSunday;
	private String buildingAdNumber;
	private String buildingAddress;
	private String buildingPhoneNumber;
	private String buildingMail;
	private String buildingStart;
	private String buildingEnd;
}
