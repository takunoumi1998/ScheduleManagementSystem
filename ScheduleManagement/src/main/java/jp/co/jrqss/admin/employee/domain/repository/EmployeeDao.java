package jp.co.jrqss.admin.employee.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.employee.domain.model.Employee;

public interface EmployeeDao {

	public List<Employee>selectMany()throws DataAccessException;


	public int insertOne(Employee employee)throws DataAccessException;
}
