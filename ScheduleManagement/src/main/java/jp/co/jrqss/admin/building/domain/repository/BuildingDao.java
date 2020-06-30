package jp.co.jrqss.admin.building.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.employee.form.SearchForm;

	public interface BuildingDao {

		// テーブルの件数を取得
		public int count() throws DataAccessException;

		// データを1件insert.
	    public int insertOne(Building building) throws DataAccessException;

	    // データを１件取得
	    public Building selectOne(int buildingId) throws DataAccessException;

	    // 全データを取得
		public List<Building>selectMany()throws DataAccessException;

		// １件更新.
	    public int updateOne(Building building) throws DataAccessException;

	    // １件削除.
	    //public int deleteOne(String buildingId) throws DataAccessException;

	    //SQL取得結果をサーバーにCSVで保存する
	    public void buildingCsvOut() throws DataAccessException;

	    //1件削除
		public int deleteOne(int buildingId) throws DataAccessException;

		public List<Building> findByName(SearchForm searchForm);
}
