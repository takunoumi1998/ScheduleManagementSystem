package jp.co.jrqss.admin.employee.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.employee.domain.model.Employee;

public interface EmployeeDao {

	public List<Employee>selectMany()throws DataAccessException;

	//Employeeテーブルの全データを取得
	public int insertOne(Employee employee)throws DataAccessException;

	//1件だけ取得
	public Employee selectOne(int employee_Id)throws DataAccessException;
}
