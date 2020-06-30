package jp.co.jrqss.employee.schedule.domain.repository;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;


public interface AccsessDao {
	//全データの取得
	public List<Map<String,Object>> findAll() throws DataAccessException;

	//データの作成
	public void insert(List<Map<String,Object>> insertDateList) throws DataAccessException;

	//データの更新
	public void update(List<Map<String,Object>> updateDateList) throws DataAccessException;

	//データの削除
	public void delete(List<Map<String,Object>> deleteDateList) throws DataAccessException;
 }
