package jp.co.jrqss.admin.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/admin/employee/list")
	public String getAdminEmployeeList(Model model) {

		List<Employee>employeeList=employeeService.selectMany();

		model.addAttribute("employeeList",employeeList);

		return "/admin/employee/list";




	}

}
