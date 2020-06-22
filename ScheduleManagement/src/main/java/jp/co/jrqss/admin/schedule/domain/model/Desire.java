package jp.co.jrqss.admin.schedule.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Desire {
	private int workId;
	private Date desireDate;

	//ビルIDが一致
	private int buildingId;
	//ワークナンバーがビル人数[i]と同じ
	private int workNumber;
	//働いてる日がテーブルの指定日[k]と同じ
	private Date workDate;

	private int employeeId;

}
