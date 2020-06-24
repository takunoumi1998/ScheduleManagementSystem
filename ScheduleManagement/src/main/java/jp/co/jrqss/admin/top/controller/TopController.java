package jp.co.jrqss.admin.top.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
	@GetMapping("admin/top")
	public String getAdminBuildingList(Model model) {
		return "admin/top";
	}
}
