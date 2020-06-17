package jp.co.jrqss.admin.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.schedule.domain.model.Work;
import jp.co.jrqss.admin.schedule.domain.repository.WorkDao;

@Repository
public class WorkDaoImpl implements WorkDao{
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Work> selectAll(){
		List<Work> workList = new ArrayList<Work>();

		List<Map<String,Object>> getList = null;

		try {
			//SQL発行
			getList = jdbc.queryForList("SELECT * FROM work");

			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				//Workのインスタンス生成（初期化）
				Work work = new Work();
				work.setWorkId((int)map.get("work_id"));
				work.setBuildingId((int)map.get("building_id"));
				work.setEmployeeId((int)map.get("employee_id"));
				work.setWorkNumber((int)map.get("work_number"));
				work.setWorkDay((int)map.get("work_day"));
				work.setWorkDate((Date)map.get("work_date"));

				workList.add(work);
			}
		}catch(Exception e) {

		}

		return workList;
	}
}
