package jp.co.jrqss.admin.building.domain.repository;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.building.domain.model.Building;

public interface BuildingChangeDao {

	public Building selectOne(String building_id) throws DataAccessException;

	public int updateOne(Building building) throws DataAccessException;

}
