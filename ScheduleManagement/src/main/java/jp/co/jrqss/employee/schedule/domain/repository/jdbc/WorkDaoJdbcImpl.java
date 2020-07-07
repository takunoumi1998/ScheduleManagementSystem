package jp.co.jrqss.employee.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.employee.schedule.domain.model.DesireForm;
import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.repository.WorkDao;

@Repository
public class WorkDaoJdbcImpl implements WorkDao{

	@Autowired
	JdbcTemplate jdbc;


	//全件取得メソッド
	@Override
	public List<Work> selectMany(int employeeId) throws DataAccessException{

		List<Work> workList = new ArrayList<Work>();

		List<Map<String,Object>> getList = jdbc.queryForList("select * from work where employee_id=?",employeeId );

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

	//1件（詳細）取得
	@Override
	public Work selectOne(String workDate)throws DataAccessException{
		try {
			Map<String,Object>  map = jdbc.queryForMap("SELECT * FROM work,building WHERE building.building_id = work.building_id AND work_date = ?" ,workDate);

			Work work = new Work();

			work.setWorkDate((Date)map.get("work_date"));
			work.setBuildingName((String)map.get("building_name"));
			work.setBuildingStart((String)map.get("building_start"));
			work.setBuildingEnd((String)map.get("building_end"));
			work.setBuildingId((Integer)map.get("building_id"));
			work.setWorkNumber((Integer)map.get("work_number"));
			work.setEmployeeId((Integer)map.get("employee_id"));

			return work;

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//1件insert
	@Override
	public int insertOne(DesireForm form) throws DataAccessException{
		int rowNumber = 0;

		try {
		rowNumber = jdbc.update("insert into desire values(?,?,?,?,?)"
				,form.getBuildingId()
				,form.getWorkNumber()
				,form.getWorkDate()
				,form.getEmployeeId()
				,form.getDesireDate()
				);
		}catch(Exception e) {
		}
		return rowNumber;
	}

}
