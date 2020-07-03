package jp.co.jrqss.employee.schedule.controller;

import java.security.Principal;
import java.util.List;

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

		List<Work> workList = workerService.selectMany();

		model.addAttribute("workList",workList);

		return "employee/schedule/top";
	}
//{workDate:.+}
	//勤務詳細取得
	@GetMapping("/employee/schedule/detail")
	public String getEmployeeScheduleDetail(//@ModelAttribute Principal principal,
			@RequestParam("date")String workDate, Model model) {
//		String employeeId = principal.getName();
		//select
		//1件取得の時はListを使わない
		Work work = workerService.selectOne(workDate);

		System.out.println(work);
		model.addAttribute("workDate",work.getWorkDate());
		model.addAttribute("buildingName",work.getBuildingName());
		model.addAttribute("buildingStart",work.getBuildingStart());
		model.addAttribute("buildingEnd",work.getBuildingEnd());
//.getBuildingEnd()
		return "employee/schedule/detail";
	}

	//変更希望依頼をDesireテーブルへ
	@PostMapping("/employee/schedule/detail")
	public String postEmployeeScheduleDetail(@ModelAttribute Model model ) {

		return "redirect:top";
	}
}
