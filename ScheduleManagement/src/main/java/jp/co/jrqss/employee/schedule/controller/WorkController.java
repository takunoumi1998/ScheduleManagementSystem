package jp.co.jrqss.employee.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//使用テーブルは「work」のみ（DB=workテーブル）

@Controller
public class WorkController {

	/*	ログイン後にカレンダー画面へ遷移
	 * 	employee_idを判別してその人の勤務内容を返す
	 * 	DBから「work_day」を取得し、該当日を着色（ここはJavascriptで追記必須）して表示
	 */

	@GetMapping("/employee/schedule/top")
	public String getEmployeeScheduleTop(Model model) {

		model.addAttribute("contents", "employee/schedule/top :: top_contents");

		return "employee/schedule/top";
	}


	/*	カレンダー画面で日付押下で詳細画面を返す
	 * 	DBの「work_day」「building_id」を取得し表示
	 * 	building_idはシステム作成のために便宜上つけたものなのでbuilding_nameへの変換が必要
	 */

	@PostMapping("/employee/schedule/detail")	//detailは仮です
	public String postEmployrrScheduleDetail(Model model) {

		model.addAttribute("contents", "employee/schedule/detail :: detail_contents");

		return "employee/schedule/detail";
	}


}
