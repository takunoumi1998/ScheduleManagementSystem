package jp.co.jrqss.employee.schedule.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.jrqss.admin.top.controller.TopController;
import jp.co.jrqss.employee.schedule.domain.model.DesireForm;
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

		List<Work> workList = workerService.selectMany(Integer.parseInt(employeeId));

		model.addAttribute("workList",workList);

		return "employee/schedule/top";
	}

	//勤務詳細取得
	@GetMapping("/employee/schedule/detail")
	public String getEmployeeScheduleDetail(@RequestParam("date")String workDate, Model model,Principal principal) {
		//1件取得の時はListを使わない
		Work work = workerService.selectOne(workDate,principal.getName());

		System.out.println(work);

		model.addAttribute("work", work);

		return "employee/schedule/detail";
	}

	//変更希望依頼をDesireテーブルへ
	@PostMapping("/employee/schedule/top")
	public String postEmployeeScheduleTop( DesireForm form,Model model ) {

		boolean result = workerService.insert(form);
		if(result == true) {
			System.out.println("insert成功");
		}else {
			System.out.println("しっぱい");
		}

		System.out.println(form);

		return "redirect:/top";
	}
}
