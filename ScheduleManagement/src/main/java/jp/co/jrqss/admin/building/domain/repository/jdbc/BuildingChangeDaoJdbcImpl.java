package jp.co.jrqss.admin.building.domain.repository.jdbc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.building.domain.model.BuildingChange;

@Repository("BuildingChangeDaoJdbcImpl")
public class BuildingChangeDaoJdbcImpl {

	@Autowired
	JdbcTemplate jdbc;

	public BuildingChange selectOne(String Building_id) throws DataAccessException{

		Map<String, Object>map = jdbc.queryForMap("SELECT* FROM building"
				+"WHERE building_id = ?", Building_id);

		BuildingChange buildingChange = new BuildingChange();

		buildingChange.setBuilding_id((Integer)map.get("building_id"));
		buildingChange.setBuilding_name((String)map.get("building_name"));
		buildingChange.setBuilding_ninzu((Integer)map.get("building_ninzu"));
		buildingChange.setBuilding_time((Integer)map.get("building_time"));
		buildingChange.setBuilding_monday((Boolean)map.get("building_monday"));
		buildingChange.setBuilding_tuesday((Boolean)map.get("building_tuesday"));
		buildingChange.setBuilding_wednesday((Boolean)map.get("building_wednesday"));
		buildingChange.setBuilding_thursday((Boolean)map.get("building_thursday"));
		buildingChange.setBuilding_friday((Boolean)map.get("building_friday"));
		buildingChange.setBuilding_saturday((Boolean)map.get("building_saturday"));
		buildingChange.setBuilding_sunday((Boolean)map.get("building_sunday"));
		buildingChange.setBuilding_ad_number((Integer)map.get("building_ad_number"));
		buildingChange.setBuilding_address((String)map.get("building_address"));
		buildingChange.setBuilding_phone_number((Integer)map.get("building_phone_number"));
		buildingChange.setBuilding_mail((String)map.get("building_mail"));

		return buildingChange;

	}

	public int deleteOne(String building_id)throws DataAccessException{

		int rowNumber = jdbc.update("DELETE FROM building WHERE building_id = ?",building_id);

		return rowNumber;
	}
}