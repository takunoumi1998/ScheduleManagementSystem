package jp.co.jrqss.admin.building.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.building.domain.model.Building;

public interface BuildingDao {
/*
	//buildingテーブルの件数を取得
	public int count() throws DataAccessException;
*/
	//buildingテーブルにデータ1件insert
	public int insertOne(Building building) throws DataAccessException;

	//buildingテーブルのデータを１件取得
	public Building selectOne(int buildingId)throws DataAccessException;

	//buildingテーブルのデータを全件取得
	public List<Building> selectMany() throws DataAccessException;

	//buildingテーブルを１件更新
	public int updateOne(Building building) throws DataAccessException;

	//buildingテーブルを１件削除
	public int deleteOne(int buildingId) throws DataAccessException;


}