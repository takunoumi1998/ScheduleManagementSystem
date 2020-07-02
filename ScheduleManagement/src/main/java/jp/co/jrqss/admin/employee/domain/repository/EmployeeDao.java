package jp.co.jrqss.admin.employee.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.form.SearchForm;

public interface EmployeeDao {

	//Employeeテーブルの全データを取得
	public List<Employee> selectMany()throws DataAccessException;

	//1件追加
	public int insertOne(Employee employee)throws DataAccessException;

	//1件だけ取得
	public Employee selectOne(int employee_Id)throws DataAccessException;

	//1件更新
	public int updateOne(Employee employee)throws DataAccessException;

	//名前基準で検索
	public List<Employee> findByName(SearchForm searchForm) throws DataAccessException;

	//1件削除
	public int deleteOne(int employee_Id) throws DataAccessException;
}
