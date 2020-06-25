package jp.co.jrqss.employee.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeSchedule {
	@GetMapping("/employee/schedule/detail")
	public String getEmployeeSchedule(Model model) {
		return "employee/schedule/detail";
	}
}
