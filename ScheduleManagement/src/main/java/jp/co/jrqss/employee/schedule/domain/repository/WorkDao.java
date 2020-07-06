package jp.co.jrqss.employee.schedule.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.employee.schedule.domain.model.Desire;
import jp.co.jrqss.employee.schedule.domain.model.Work;

public interface WorkDao {

	//workテーブルの日付データを取得
	public List<Work> selectMany() throws DataAccessException;

	//1件取得
	public Work selectOne(String workDate) throws DataAccessException;

	//データを1件insert
	public int insertOne(Desire desire)throws DataAccessException;

}
