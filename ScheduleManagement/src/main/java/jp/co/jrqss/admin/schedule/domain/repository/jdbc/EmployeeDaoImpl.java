package jp.co.jrqss.admin.schedule.domain.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.jrqss.admin.schedule.domain.model.Employee;
import jp.co.jrqss.admin.schedule.domain.repository.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Employee> selectAll() throws DataAccessException {
		//取得した結果を受け取るためのリスト
		List<Map<String,Object>> getList = null;

		//返却用のworkリスト
		List<Employee> employeeList = new ArrayList<>();

		try {
			//SQL発行
			getList = jdbc.queryForList("SELECT * FROM employee");

			//取得したカラム数だけ繰り返し処理を行う
			for(Map<String,Object> map : getList) {
				//Workのインスタンス生成（初期化）
				Employee employee = new Employee();
				employee.setEmployeeId((int)map.get("employee_id"));
				//employee.setBuildingId((int)map.get("building_id"));
				employee.setEmployeeName((String)map.get("employee_name"));
				employee.setDesireDays((int)map.get("desire_days"));

				employeeList.add(employee);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}


}
