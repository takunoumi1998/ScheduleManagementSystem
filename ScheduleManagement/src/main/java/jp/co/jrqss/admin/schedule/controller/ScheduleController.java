package jp.co.jrqss.admin.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScheduleController {
	@GetMapping("/admin/schedule")
	public String getSchedule() {
		return "admin/schedule/list";
	}

	@PostMapping("/admin/schedule")
	public String postSchedule() {
		return "admin/schedule/list";
	}
}
