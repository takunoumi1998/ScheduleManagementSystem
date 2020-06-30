package jp.co.jrqss.admin.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	JdbcTemplate jdbc;

	@GetMapping("/admin/login")
	public String getLogin() {
		String yubin = "123-1234";
		String jusho = "福岡市";
		String phone = "0120117117";
		String mail = "abcd@co.jp";
		String bikou = "備考";
		String password = "password";
		String role = "ROLE_ADMIN";

		jdbc.update("DELETE FROM employee");

		for(int i = 1001; i <= 1100; i++) {
			try {
				jdbc.update("INSERT INTO employee VALUES(?"	//ID
						+ ",?"	//name
						+ ",?"	//呼び名
						+ ",10"	//勤務希望日数
						+ ",0"	//月
						+ ",0"	//火
						+ ",0"	//水
						+ ",0"	//木
						+ ",0"	//金
						+ ",0"	//土
						+ ",0"	//日
						+ ",?"	//郵便番号
						+ ",?"	//住所
						+ ",?"	//携帯電話番号
						+ ",?"	//メールアドレス
						+ ",?"	//備考
						+ ",?"	//パスワード
						+ ",?)"	//権限
				,i,i+"氏",i+"さん",yubin,jusho,phone,mail,bikou,password,role);
			}catch(Exception e) {
				System.out.println("失敗");
			}
		}
		return "admin/login/login";
	}

	@PostMapping("/admin/login")
	public String postLogin() {
		return "admin/login/login";
	}
}
