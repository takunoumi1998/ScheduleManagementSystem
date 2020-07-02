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

		List<Work> workList = new ArrayList<Work>();

		List<Map<String,Object>> getList = jdbc.queryForList("select * from work where employee_id = ?" );

		for(Map map : getList) {
			Work work = new Work();
			work.setBuildingId((int)map.get("building_id"));
			work.setEmployeeId((int)map.get("employee_id"));
			work.setWorkDate((Date)map.get("work_date"));
			work.setWorkDay((int)map.get("work_day"));
			work.setWorkNumber((int)map.get("work_number"));
			work.setWorkWeek((int)map.get("work_week"));
			workList.add(work);

			workList.add(work);
		}

		return workList;

	}

}
