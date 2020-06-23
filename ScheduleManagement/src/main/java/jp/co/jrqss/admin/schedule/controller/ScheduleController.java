package jp.co.jrqss.admin.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.schedule.Form.SelectForm;
import jp.co.jrqss.admin.schedule.domain.model.Building;
import jp.co.jrqss.admin.schedule.domain.model.Desire;
import jp.co.jrqss.admin.schedule.domain.model.Employee;
import jp.co.jrqss.admin.schedule.domain.model.Work;
import jp.co.jrqss.admin.schedule.domain.repository.jdbc.WorkDaoImpl;
import jp.co.jrqss.admin.schedule.domain.service.BuildingService;
import jp.co.jrqss.admin.schedule.domain.service.DesireService;
import jp.co.jrqss.admin.schedule.domain.service.EmployeeService;
import jp.co.jrqss.admin.schedule.domain.service.WorkService;

@Controller
public class ScheduleController {

	@Autowired
	WorkService workService;

	@Autowired
	BuildingService buildingService;

	@Autowired
	EmployeeService employeeService;

	@Autowired
	DesireService desireService;

	@Autowired
	WorkDaoImpl workDaoImpl;

	@GetMapping("/admin/schedule/create")
	public String getSchedule(Model model) {
		List<Work> workList = workService.getWorkInfo();
		List<Building> buildingList = buildingService.getBuildingInfo();
		List<Employee> employeeList = employeeService.getEmployeeInfo();
		List<Desire> desireList = desireService.getDesireInfo();

		model.addAttribute("workList",workList);
		model.addAttribute("buildingList",buildingList);
		model.addAttribute("employeeList",employeeList);
		model.addAttribute("desireList",desireList);

		return "admin/schedule/list";
	}

	@PostMapping("/admin/schedule/create")
	public String postSchedule(Model model , @ModelAttribute("selectForm") SelectForm selectForm) {

		workDaoImpl.insert(selectForm);

		return getSchedule(model);
	}
}
