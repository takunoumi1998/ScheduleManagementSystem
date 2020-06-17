package jp.co.jrqss.admin.building.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.repository.BuildingDao;

@Repository
public class BuildingDaoJdbcImpl implements BuildingDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Building>selectMany() throws DataAccessException {

		// buildingテーブルからデータを取得
		List<Map<String,Object>>getList=jdbc.queryForList("select * from building");
//														   "select * from building"
		// 結果返却用の変数
		List<Building>buildingList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Building building = new Building();

			building.setBuildingId((int)map.get("building_id"));
			building.setBuildingName((String)map.get("building_name"));
			building.setEmployeeName((String)map.get("employee_name"));
			building.setBuildingNinzu((int)map.get("building_ninzu"));
			building.setBuildingTime((int)map.get("building_time"));
			building.setBuildingMonday((boolean)map.get("building_monday"));
			building.setBuildingTuesday((boolean)map.get("building_tuesday"));
			building.setBuildingWednesday((boolean)map.get("building_wednesday"));
			building.setBuildingThursday((boolean)map.get("building_thursday"));
			building.setBuildingFriday((boolean)map.get("building_friday"));
			building.setBuildingSaturday((boolean)map.get("building_saturday"));
			building.setBuildingSunday((boolean)map.get("building_sunday"));
			building.setBuildingAdNumber((String)map.get("building_ad_number"));
			building.setBuildingAddress((String)map.get("building_address"));
			building.setBuildingPhoneNumber((String)map.get("building_phone_number"));
			building.setBuildingMail((String)map.get("building_mail"));

			// 結果返却用リストに返却
			buildingList.add(building);
		}

		return buildingList;

	}

}
