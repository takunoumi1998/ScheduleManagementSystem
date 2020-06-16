package jp.co.jrqss.admin.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

		return "admin/employee/list";
	}

	@PostMapping("/admin/employee/create/register")
	public String postAdminEmployeeCreateRegister(Model model) {

		return "admin/employee/create/register";

	}

	@RequestMapping("/admin/employee/create/confirm")
	public String postAdminEmployeeCreateConfirm(
			@RequestParam("employee_Id")String str1,
			@RequestParam("employee_Name")String str2,
			@RequestParam("building_Id")String str3,
			@RequestParam("employee_Post_Number")String str4,
			@RequestParam("employee_Ad_Number")String str5,
			@RequestParam("employee_Phone_Number")String str6,
			@RequestParam("employee_Mail")String str7,
			@RequestParam("desire_Days")String str8,
			Model model)

			{
		model.addAttribute("employee_Id",str1);
		model.addAttribute("employee_Name",str2);
		model.addAttribute("building_Id",str3);
		model.addAttribute("employee_Post_Number",str4);
		model.addAttribute("employee_Ad_Number",str5);
		model.addAttribute("employee_Phone_Number",str6);
		model.addAttribute("employee_Mail",str7);
		model.addAttribute("desire_Days",str8);



		return "admin/employee/create/confirm";


	}

}
