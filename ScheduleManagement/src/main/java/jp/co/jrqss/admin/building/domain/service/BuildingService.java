package jp.co.jrqss.admin.building.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.repository.BuildingDao;

@Service
public class BuildingService {

	@Autowired
	BuildingDao buildingdao;

	public List<Building>selectMany(){

		return buildingdao.selectMany();
	}

}
