package jp.co.jrqss.admin.building.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.repository.BuildingDao;

@Transactional
@Service
public class BuildingService {

	@Autowired
	@Qualifier("BuildingDaoJdbcImpl")
	BuildingDao buildingdao;

	//insertメソッド
	public boolean insert(Building building) {

		int rowNumber = buildingdao.insertOne(building);

		boolean result = false;

		if(rowNumber>0) {
			result=true;
		}

		return result;

	}
/*
	//カウント
	public int count() {
		return buildingdao.count();
	}
*/
	//全件取得用メソッド
	public List<Building> selectMany(){
		//全件取得
		return buildingdao.selectMany();
	}

	public Building selectOne(int buildingId) {
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

    /**
     * １件削除用メソッド.
     */
    public boolean deleteOne(int buildingId) {

        // １件削除
        int rowNumber = buildingdao.deleteOne(buildingId);

        // 判定用変数
        boolean result = false;

        if (rowNumber > 0) {
            // delete成功
            result = true;
        }
        return result;
    }

}