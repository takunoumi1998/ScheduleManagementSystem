package jp.co.jrqss.admin.building.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.building.domain.model.Building;

public interface BuildingDao {

	public List<Building>selectMany1()throws DataAccessException;

	Building selectOne(String buildingId);

	<T> List<Building> selectMany();

}