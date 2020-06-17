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
	public int count() throws DataAccessException {

		int count=jdbc.queryForObject("select count(*) from building,Integer.class");

		return count;
	}

	@Override
	public int insertOne(Building building) throws DataAccessException {

		// 1件登録
		int rowNumber = jdbc.update("INSERT INTO m_user(building_id,"
                + " building_name,"
                + " employee_name,"
                + " building_ninzu,"
                + " building_time,"
                + " building_monday,"
                + " building_tuesday,"
                + " building_wednesday,"
                + " building_thursday,"
                + " building_friday,"
                + " building_saturday,"
                + " building_sunday,"
                + " building_ad_number,"
                + " building_address,"
                + " building_phone_number,"
                + " building_mail,"
                + " VALUES(?, ?, ?, ?, ?, ?, ?)",
                building.getBuildingId(),
                building.getBuildingName(),
                building.getEmployeeName(),
                building.getBuildingNinzu(),
                building.getBuildingTime(),
                building.getbuildingMonday(),
                building.getBuildingTuesday(),
                building.getBuildingWednesday(),
                building.getBuildingThursday(),
                building.getBuildingFriday(),
                building.getBuildingSaturday(),
                building.getBuildingSunday(),
                building.getBuildingAdNumber(),
                building.getBuildingAddress(),
                building.getBuildingPhoneNumber(),
                building.getBuildingMail());

        return rowNumber;
    }

	@Override
	public List<Building>selectMany() throws DataAccessException {

		// buildingテーブルからデータを全件取得
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
