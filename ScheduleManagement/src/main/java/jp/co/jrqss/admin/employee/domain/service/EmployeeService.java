package jp.co.jrqss.admin.employee.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.repository.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeedao;

	public List<Employee>selectMany(){

		return employeedao.selectMany();
	}

}
