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
public class BuildingJdbcImpl implements BuildingDao{

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Building>selectMany()throws DataAccessException{
		//employeeテーブルからデータを取得
		List<Map<String,Object>>getList=jdbc.queryForList("select*from building");
		//結果返却用の変数
		List<Building>buildingList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Building building=new Building();

			building.setBuilding_id((int)map.get("building_id"));
			building.setBuilding_name((String)map.get("building_name"));
			building.setBuilding_ninzu((int)map.get("building_ninzu"));
			building.setBuilding_time((String)map.get("building_time"));
			building.setBuilding_monday((boolean)map.get("building_monday"));
			building.setBuilding_tuesday((boolean)map.get("building_tuesday"));
			building.setBuilding_wednesday((boolean)map.get("building_wednesday"));
			building.setBuilding_thursday((boolean)map.get("building_thursday"));
			building.setBuilding_friday((boolean)map.get("building_friday"));
			building.setBuilding_saturday((boolean)map.get("building_saturday"));
			building.setBuilding_sunday((boolean)map.get("building_sunday"));
			building.setEmployee_name((String)map.get("employee_name"));
			building.setBuilding_ad_number((int)map.get("building_ad_number"));
			building.setBuilding_address((String)map.get("building_address"));
			building.setBuilding_phone_number((int)map.get("building_phone_number"));
			building.setBuilding_mail((String)map.get("building_mail"));

			//結果返却用のリストに返却
			buildingList.add(building);
		}

		return buildingList;
	}

	@Override
	public Building selectOne(String buildingId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Building> selectMany1() throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void Building(String buildingId) {
		// TODO 自動生成されたメソッド・スタブ

	}


}