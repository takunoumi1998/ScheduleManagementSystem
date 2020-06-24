package jp.co.jrqss.admin.schedule.domain.repository;

import java.util.List;

import jp.co.jrqss.admin.schedule.domain.model.Employee;

public interface EmployeeDao {
	public List<Employee> selectAll();
}
