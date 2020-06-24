package jp.co.jrqss.admin.schedule.domain.model;

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
}
