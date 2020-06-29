package jp.co.jrqss.employee.schedule.domain.repository.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Repository
public class WorkDaoJdbcImpl implements WorkDao{

	@Override
	public Work selectOne(int workDate) throws DataAccessException{
		List<Map<String,Object>> getList = jdbc.queryForList("SELECT building_name FROM work,building"
				+"WHERE work.building_id = building.building_id")
	}

}
