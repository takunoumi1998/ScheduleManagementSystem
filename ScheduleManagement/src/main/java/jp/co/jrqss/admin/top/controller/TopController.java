package jp.co.jrqss.admin.top.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

	@Autowired
	JdbcTemplate jdbc;

	@GetMapping("admin/top")
	public String getAdminBuildingList(Model model , Principal principal) {
		return "admin/top";
	}

	@GetMapping("/top")
	public String getTop(Model model , Principal principal) {
		String id = principal.getName();

		System.out.println(id);
		String role = "";
		String url = "employee/schedule/top";
		try {
			List<Map<String,Object>> findList = jdbc.queryForList("select * from employee where employee_id = ?" , id);
			for(Map map : findList) {
				role = (String)map.get("employee_role");
			}

			System.out.println(role);

			if(role.equals("ROLE_ADMIN")) {
				url = "admin/top";
			}
		}catch(Exception e) {
		}
		return url;
	}
}
