package jp.co.jrqss.admin.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("accessdeniedpage")
	public String postAccessdeniedpage() {
		return "employee/error";
	}

	@PostMapping("/logout")
	public String postLogout() {
		return getLogin();
	}

	@GetMapping("/login")
	public String getLogin() {
		return "admin/login/login";
	}

	@PostMapping("/login")
	public String postLogin() {
		return "admin/login/login";
	}
}
