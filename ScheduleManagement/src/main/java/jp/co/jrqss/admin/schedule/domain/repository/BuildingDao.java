package jp.co.jrqss.admin.schedule.domain.repository;

import java.util.List;

import jp.co.jrqss.admin.schedule.domain.model.Building;

public interface BuildingDao {
	public List<Building> selectAll();
}
