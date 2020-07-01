package jp.co.jrqss.employee.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.service.WorkerService;

@Controller
public class EmployeeSchedule {

	@Autowired
	WorkerService workerService;

	@GetMapping("/employee/schedule/top")
	public String getEmployeeSchedule(Model model) {

		List<Work> workList = workerService.selectMany();

		model.addAttribute("workList", workList);

		return "employee/schedule/top";
	}

	@PostMapping("/employee/schedule/detail")
	public String postEmployeeSchedule(Model model , @ModelAttribute("work") Work work) {

		model.addAttribute("work",work);
		return "employee/shcedule/detail;";
	}
}
