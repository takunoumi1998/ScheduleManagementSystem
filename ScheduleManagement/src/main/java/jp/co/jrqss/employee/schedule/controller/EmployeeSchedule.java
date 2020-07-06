package jp.co.jrqss.employee.schedule.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.jrqss.admin.top.controller.TopController;
import jp.co.jrqss.employee.schedule.domain.model.Work;
import jp.co.jrqss.employee.schedule.domain.service.WorkerService;

@Controller
public class EmployeeSchedule {

	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	WorkerService workerService;

	@Autowired
	TopController topController;

	@GetMapping("/employee/schedule/top")
	public String getEmployeeSchedule(Model model , Principal principal) {
		String employeeId = principal.getName();

		List<Work> workList = new ArrayList<Work>();
		List<Map<String,Object>> getList = jdbc.queryForList("select * from work where employee_id = ?" , employeeId);

		for(Map map : getList) {
			Work work = new Work();
			work.setBuildingId((int)map.get("building_id"));
			work.setEmployeeId((int)map.get("employee_id"));
			work.setWorkDate((Date)map.get("work_date"));
			work.setWorkDay((int)map.get("work_day"));
			work.setWorkNumber((int)map.get("work_number"));
			work.setWorkWeek((int)map.get("work_week"));
			workList.add(work);
		}

		model.addAttribute("workList",workList);

		System.out.println(workList);

		return "employee/schedule/top";
	}

	@GetMapping("/employee/schedule/detail")
	public String getEmployeeSchedule(@RequestParam("date")String date,Principal principal) {
//		String employeeId = principal.getName();
//		//select
//		List<Work> workList = new ArrayList<Work>();
//		List<Map<String,Object>> getList = jdbc.queryForList("SELECT work_date,building_name,building_start,building_end FROM building,work WHERE building.building_id = work.building_id" , employeeId);
//
//		for(Map map : getList) {
//			Work work = new Work();
//			work.setWorkDate((Date)map.get("work_date"));
//			work.setBuildingName((String)map.get("building_name"));
//			work.setBuildingStart((Time)map.get("building_start"));
//			work.setBuildingEnd((Time)map.get("building_end"));
//
//			workList.add(work);
//
//		}
		return "employee/schedule/detail";
	}

	@PostMapping("/employee/schedule/detail")
	public String postEmployeeSchedule(Model model , @ModelAttribute("work") Work work ,Principal principal) {

		//insert
		model.addAttribute("work",work);

		return "redirect:/top";
	}
}
