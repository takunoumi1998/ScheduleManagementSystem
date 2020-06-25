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

@Repository("BuildingDaoJdbcImpl")
public class BuildingDaoJdbcImpl implements BuildingDao{

	@Autowired
	JdbcTemplate jdbc;

/*	//buildingテーブルの件数を取得
	@Override
	public int count() throws DataAccessException{

		int count = jdbc.queryForObject("SELECT COUNT(*) FROM building", Integer.class);

		return count;
	}
*/
	//buildingテーブルにデータを1件insertする
	@Override
	public int insertOne(Building building) throws DataAccessException{

		int rowNumber = jdbc.update("INSERT INTO building(building_id,"
				+"building_name,"
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
				+"building_mail)"
				+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
				,building.getBuildingId()
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
				,building.getBuildingMail());

		return rowNumber;
	}

	//buildingテーブルのデータを1件取得
	@Override
	public Building selectOne(int buildingId) throws DataAccessException{

		//1件取得する
		Map<String, Object>map = jdbc.queryForMap("SELECT * FROM building"
				+"WHERE building_id=?",buildingId);

		//結果返却用変数
		Building building = new Building();

		//取得したデータを結果返却用変数にセット
		building.setBuildingId((Integer)map.get("building_id"));//ビルid
		building.setBuildingName((String)map.get("building_name"));//ビル名称
		building.setBuildingNinzu((Integer)map.get("building_ninzu"));//清掃人員数
		building.setBuildingTime((Integer)map.get("building_time"));//清掃時間
		building.setBuildingMonday((boolean)map.get("building_monday"));//月曜希望
		building.setBuildingTuesday((boolean)map.get("building_tuesday"));//火曜希望
		building.setBuildingWednesday((boolean)map.get("building_wednesday"));//水曜希望
		building.setBuildingThursday((boolean)map.get("building_thursday"));//木曜希望
		building.setBuildingFriday((boolean)map.get("building_friday"));//金曜希望
		building.setBuildingSaturday((boolean)map.get("building_saturday"));//土曜希望
		building.setBuildingSunday((boolean)map.get("building_sunday"));//日曜希望
		building.setBuildingAdNumber((Integer)map.get("building_ad_number"));//ビルの郵便番号
		building.setBuildingAddress((String)map.get("building_address"));//ビルの住所
		building.setBuildingPhoneNumber((Integer)map.get("building_phone_number"));//ビルの電話番号
		building.setBuildingMail((String)map.get("building_mail"));//ビルのメールアドレス

		return building;
	}

	//buildingテーブルの全データを取得
	@Override
	public List<Building> selectMany() throws DataAccessException{

		//buildingテーブルのデータを全件取得
		List<Map<String, Object>>getList = jdbc.queryForList("SELECT * FROM building");

		//結果返却用変数
		List<Building> buildingList = new ArrayList<>();

		//取得データ→結果返却用Listへ格納
		for(Map<String, Object> map:getList) {

			//buildingインスタンスの生成
			Building building = new Building();

			//buildingインスタンスに取得データのセット
			building.setBuildingId((Integer)map.get("building_id"));
			building.setBuildingName((String)map.get("building_name"));
			building.setBuildingNinzu((Integer)map.get("building_ninzu"));
			building.setBuildingTime((Integer)map.get("building_time"));
			building.setBuildingMonday((boolean)map.get("building_monday"));
			building.setBuildingTuesday((boolean)map.get("building_tuesday"));
			building.setBuildingWednesday((boolean)map.get("building_wednesday"));
			building.setBuildingThursday((boolean)map.get("building_thursday"));
			building.setBuildingFriday((boolean)map.get("building_friday"));
			building.setBuildingSaturday((boolean)map.get("building_saturday"));
			building.setBuildingSunday((boolean)map.get("building_sunday"));
			building.setBuildingAdNumber((Integer)map.get("building_ad_number"));
			building.setBuildingAddress((String)map.get("building_address"));
			building.setBuildingPhoneNumber((Integer)map.get("building_phone_number"));
			building.setBuildingMail((String)map.get("building_mail"));

			buildingList.add(building);
		}
		return buildingList;
	}

	//Buildingテーブルを1件更新
	@Override
	public int updateOne(Building building) throws DataAccessException{

		int rowNumber = jdbc.update("UPDATE BUILDING"
				+"SET"
				+"building_name=?,"
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
				+"WHERE building_id=?"
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
				,building.getBuildingMail());

		return rowNumber;
	}

	//buildingテーブルを1件削除
	@Override
	public int deleteOne(int buildingId) throws DataAccessException{

		int rowNumber=jdbc.update("DELETE FROM building WHERE building_id=?",buildingId);

		return rowNumber;
	}


}
