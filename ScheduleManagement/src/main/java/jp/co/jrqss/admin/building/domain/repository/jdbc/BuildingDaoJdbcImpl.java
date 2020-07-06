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
import jp.co.jrqss.admin.employee.form.SearchForm;

@Repository
public class BuildingDaoJdbcImpl implements BuildingDao {

	@Autowired
	JdbcTemplate jdbc;



	@Override
	public List<Building> findByName(SearchForm searchForm) {
		/// buildingテーブルからデータを全件取得
		List<Map<String,Object>>getList=jdbc.queryForList("select * from building where building_name like ?","%"+searchForm.getSearchName()+"%");

		// 結果返却用の変数
		List<Building>buildingList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Building building = new Building();

			building.setBuildingId((int)map.get("building_id"));
			building.setBuildingName((String)map.get("building_name"));
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
			building.setBuildingStart((String)map.get("buildingStart"));
			building.setBuildingEnd((String)map.get("building_end"));


			// 結果返却用リストに返却
			buildingList.add(building);
		}

		return buildingList;
	}


	@Override
	public List<Building> findByAddress(SearchForm searchForm) {
		/// buildingテーブルからデータを全件取得
		List<Map<String,Object>>getList=jdbc.queryForList("select * from building where building_address like ?","%"+searchForm.getSearchAddress()+"%");

		// 結果返却用の変数
		List<Building>buildingList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Building building = new Building();

			building.setBuildingId((int)map.get("building_id"));
			building.setBuildingName((String)map.get("building_name"));
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
			building.setBuildingStart((String)map.get("buildingStart"));
			building.setBuildingEnd((String)map.get("building_end"));


			// 結果返却用リストに返却
			buildingList.add(building);
		}

		return buildingList;
	}

	// テーブルの件数を取得
	@Override
	public int count() throws DataAccessException {

		// 全件取得してカウント
		int count = jdbc.queryForObject("select count(*) from building", Integer.class);

		return count;
	}

	// データを1件insert
	@Override
	public int insertOne(Building building)throws DataAccessException{

		int rowNumber=jdbc.update("insert into building(building_name,"
				+"building_ninzu,"
				+"building_time,"
				+"building_monday,"
				+"building_tuesday,"
				+"building_wednesday,"
				+"building_thursday,"
				+"building_friday,"
				+"building_saturday,"
				+"building_sunday,"
				+"building_ad_number,"
				+"building_address,"
				+"building_phone_number,"
				+"building_mail,"
				+"building_start,"
				+"building_end)"
				+"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
				//,building.getBuildingId()
				,building.getBuildingName()
				,building.getBuildingNinzu()
				,building.getBuildingTime()
				,building.isBuildingMonday()
				,building.isBuildingTuesday()
				,building.isBuildingWednesday()
				,building.isBuildingThursday()
				,building.isBuildingFriday()
				,building.isBuildingSaturday()
				,building.isBuildingSunday()
				,building.getBuildingAdNumber()
				,building.getBuildingAddress()
				,building.getBuildingPhoneNumber()
				,building.getBuildingMail()
				,building.getBuildingStart()
				,building.getBuildingEnd()
				);


		return rowNumber;
	}

	// データを1件取得・・queryForMap
	@Override
	public Building selectOne(int buildingId) throws DataAccessException {

		// 1件取得
		Map<String, Object> map = jdbc.queryForMap("select * from building where building_id = ?" ,buildingId);

		// 結果返却用の変数
		Building building = new Building();

		// 取得したデータを結果返却用の変数にセット・・1件なのでリストは使わない
		building.setBuildingId((int) map.get("building_id"));
		building.setBuildingName((String) map.get("building_name"));
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
		building.setBuildingStart((String)map.get("building_start"));
		building.setBuildingEnd((String)map.get("building_end"));



		return building;
	}

	// 全データ取得
	@Override
	public List<Building>selectMany() throws DataAccessException {

		// buildingテーブルからデータを全件取得
		List<Map<String,Object>>getList=jdbc.queryForList("select * from building");

		// 結果返却用の変数
		List<Building>buildingList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			System.out.println("start time : "+(String)map.get("building_start"));

			Building building = new Building();

			building.setBuildingId((int)map.get("building_id"));
			building.setBuildingName((String)map.get("building_name"));
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
			building.setBuildingStart((String)map.get("building_start"));
			building.setBuildingEnd((String)map.get("building_end"));



			// 結果返却用リストに返却
			buildingList.add(building);
			System.out.println(buildingList);
		}

		return buildingList;

	}

	// 1件更新
	@Override
	public int updateOne(Building building)throws DataAccessException{

		int rowNumber=jdbc.update("update building"
				+" set "
				+" building_name=?, "
				+"building_ninzu=?,"
				+"building_time=?,"
				+"building_monday=?,"
				+"building_tuesday=?,"
				+"building_wednesday=?,"
				+"building_thursday=?,"
				+"building_friday=?,"
				+"building_saturday=?,"
				+"building_sunday=?,"
				+"building_ad_number=?,"
				+"building_address=?,"
				+"building_phone_number=?,"
				+"building_mail=?,"
				+"building_start=?,"
				+"building_end=?"
				+" where building_id=?"
				,building.getBuildingName()
				,building.getBuildingNinzu()
				,building.getBuildingTime()
				,building.isBuildingMonday()
				,building.isBuildingTuesday()
				,building.isBuildingWednesday()
				,building.isBuildingThursday()
				,building.isBuildingFriday()
				,building.isBuildingSaturday()
				,building.isBuildingSunday()
				,building.getBuildingAdNumber()
				,building.getBuildingAddress()
				,building.getBuildingPhoneNumber()
				,building.getBuildingMail()
				,building.getBuildingStart()
				,building.getBuildingEnd()
				,building.getBuildingId()
				);

		return rowNumber;
	}


	@Override
	//SQL取得結果をサーバーにCSVで保存する
	public void buildingCsvOut() throws DataAccessException {

	}

	//1件削除
	@Override
	public int deleteOne(int buildingId)throws DataAccessException{

		int rowNumber=jdbc.update("delete from work where building_id=?",buildingId);
		rowNumber=jdbc.update("delete from desire where building_id=?",buildingId);
		rowNumber=jdbc.update("delete from building where building_id=?",buildingId);
		return rowNumber;
	}
}
