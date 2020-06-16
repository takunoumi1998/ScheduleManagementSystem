package jp.co.jrqss.admin.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.schedule.domain.model.Building;
import jp.co.jrqss.admin.schedule.domain.repository.BuildingDao;

@Repository
public class BuildingDaoImpl implements BuildingDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Building> selectAll() throws DataAccessException {
		//取得した結果を受け取るためのリスト
		List<Map<String,Object>> getList = null;

		//返却用のworkリスト
		List<Building> buildingList = new ArrayList<>();

		try {
			//SQL発行
			getList = jdbc.queryForList("SELECT * FROM building");

			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				//Workのインスタンス生成（初期化）
				Building building = new Building();
				building.setBuildingId((int)map.get("building_id"));
				building.setBuildingName((String)map.get("building_name"));
				building.setBuildingNinzu((int)map.get("building_ninzu"));
				building.setBuildingTime((int)map.get("building_time"));

				buildingList.add(building);
			}
		}catch(Exception e) {

		}

		return buildingList;
	}


}
