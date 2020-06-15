package jp.co.jrqss.admin.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("admin/login")
	public String getLogin() {
		return "admin/login/login";
	}

	@PostMapping("/home")
	public String postLogin() {
		return "admin/login/login";
	}
}