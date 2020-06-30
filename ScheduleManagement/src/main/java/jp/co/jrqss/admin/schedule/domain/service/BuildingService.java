package jp.co.jrqss.admin.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.schedule.domain.model.Building;
import jp.co.jrqss.admin.schedule.domain.repository.jdbc.BuildingDaoImpl;

@Service
public class BuildingService {

	@Autowired
	BuildingDaoImpl buildingDaoImpl;

	public List<Building> getBuildingInfo() {
		return buildingDaoImpl.selectAll();
	}
}
