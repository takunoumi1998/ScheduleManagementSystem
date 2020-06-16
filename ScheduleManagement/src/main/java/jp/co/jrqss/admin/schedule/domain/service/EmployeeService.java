package jp.co.jrqss.admin.schedule.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.schedule.domain.model.Employee;
import jp.co.jrqss.admin.schedule.domain.repository.jdbc.EmployeeDaoImpl;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;

	public List<Employee> getEmployeeInfo(){
		return employeeDaoImpl.selectAll();
	}
}
