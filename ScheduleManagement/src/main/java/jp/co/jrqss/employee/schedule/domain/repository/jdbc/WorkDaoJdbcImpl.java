package jp.co.jrqss.employee.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Repository
public class WorkDaoJdbcImpl implements WorkDao{

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Work> selectMany() throws DataAccessException{

		//workテーブルから出勤日データのみを取得
		List<Map<String,Object>> getList=jdbc.queryForList("SELECT work_date FROM work");

		//結果返却
		List<Work> workList=new ArrayList<>();

		for(Map<String,Object>map:getList) {

			Work work = new Work();

			work.setWorkDate((Date)map.get("work_date"));

			//結果返却用のリストに返却
			workList.add(work);
		}

		return workList;
	}

}
