package jp.co.jrqss.employee.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.employee.schedule.domain.model.Work;

@Controller
public class EmployeeSchedule {

	@GetMapping("/employee/schedule/detail")
	public String getEmployeeSchedule(Model model) {
		return "employee/schedule/detail";
	}

	@PostMapping("/employee/schedule/list")
	public String postEmployeeSchedule(Model model , @ModelAttribute("work") Work work) {

		model.addAttribute("work",work);
		return "employee/shcedule/list;";
	}
}
