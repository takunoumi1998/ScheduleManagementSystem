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
		String yubin = "123-1234";
		String jusho = "福岡県福岡市博多区吉塚本町１３−７９";
		String phone = "0120117117";
		String mail = "abcd@co.jp";
		String bikou = "備考";
		String password = "password";
		String role = "ROLE_USER";
		String startTime = "17:00";
		String endTime = "21:00";

		password = passwordEncoder.encode(password);

//		try {
//			jdbc.update("DELETE FROM employee");
//			jdbc.update("DELETE FROM building");
//		}catch(Exception e) {
//
//		}
		for(int i = 1000; i <= 1003; i++) {
			if(i == 1000) {
				role = "ROLE_ADMIN";
			}else {
				role = "ROLE_USER";
			}
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

				System.out.println(role);

				if(i <= 1000) {
					jdbc.update("INSERT INTO building VALUES("
							+ "?" //ID
							+ ",?"	//名前
							+ ",2"	//人数
							+ ",120"	//勤務時間（分）
							+ ",1"	//月
							+ ",0"	//火
							+ ",1"	//水
							+ ",0"	//木
							+ ",1"	//金
							+ ",0"	//土
							+ ",0"	//日
							+ ",?"	//郵便番号
							+ ",?"	//住所
							+ ",?"	//電話番号
							+ ",?"	//メールアドレス
							+ ",?"	//開始時間
							+ ",?)"	//終了時間
							,i,"JRQSS本社",yubin,jusho,phone,mail,startTime,endTime);
				}
			}catch(Exception e) {
			}
		}
		return "admin/login/login";
	}

	@PostMapping("/login")
	public String postLogin() {
		return "admin/login/login";
	}
}
