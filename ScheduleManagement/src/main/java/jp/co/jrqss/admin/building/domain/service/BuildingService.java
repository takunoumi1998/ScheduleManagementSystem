package jp.co.jrqss.admin.building.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.repository.BuildingDao;

@Service
public class BuildingService {

	@Autowired
//	@Qualifier("BuildingDaoJdbcImpl")
	BuildingDao buildingdao;

	/**
     * insert用メソッド.
     */
	public boolean insert(Building building) {

		// insert実行
		int rowNumber = buildingdao.insertOne(building);

		// 判定用変数
		boolean result = false;

		if (rowNumber > 0) {
			// insert成功
			result = true;
		}

		return result;
	}

	/**
     * カウント用メソッド.
     */
    public int count() {
        return buildingdao.count();
    }

	/**
     * 全件取得用メソッド.
     */
	public List<Building>selectMany(){

		// 全件取得
		return buildingdao.selectMany();
	}

	// 1件取得
	public Building selectOne(int buildingId) {
		// selectOne実行
		return buildingdao.selectOne(buildingId);
	}

	/**
     * １件更新用メソッド.
     */
    public boolean updateOne(Building building) {

        // 判定用変数
        boolean result = false;

        // １件更新
        int rowNumber = buildingdao.updateOne(building);

        if (rowNumber > 0) {
            // update成功
            result = true;
        }

        return result;
    }
}
