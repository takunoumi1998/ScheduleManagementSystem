package jp.co.jrqss.admin.employee.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.repository.EmployeeDao;

@Service("EmployeeServiceEmployee")
public class EmployeeService {

	@Autowired
	EmployeeDao employeedao;

	public List<Employee>selectMany(){

		return employeedao.selectMany();
	}

	//insert用　一件登録
	public boolean insert(Employee employee) {

		int rowNumber=employeedao.insertOne(employee);
		boolean result=false;

		if(rowNumber>0) {

			result=true;
		}

		return result;

	}


	public Employee selectOne(int employee_Id) {

		return employeedao.selectOne(employee_Id);

	}




	public boolean updateOne(Employee employee) {

		int rowNumber=employeedao.updateOne(employee);
		boolean result=false;

		if(rowNumber>0) {

			result=true;
		}

		return result;


	}

	public boolean deleteOne(int employee_Id) {

		int rowNumber=employeedao.deleteOne(employee_Id);
		boolean result=false;

		if(rowNumber>0) {

			result=true;
		}

		return result;


	}


}
