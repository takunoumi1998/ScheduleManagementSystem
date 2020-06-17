package jp.co.jrqss.admin.building.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.repository.BuildingChangeDao;

@Transactional
@Service
public class BuildingChangeService {

	@Autowired
	@Qualifier("BuildingChangeDaoJdbcImpl")
	BuildingChangeDao dao;

	public boolean updateOne(Building building) {
		boolean result = false;
		int rowNumber = dao.updateOne(building);
		if(rowNumber > 0) {
			result=true;
		}
		return result;
	}

}
