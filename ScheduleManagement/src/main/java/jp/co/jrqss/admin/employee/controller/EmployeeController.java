package jp.co.jrqss.admin.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.jrqss.admin.employee.domain.model.Employee;
//import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.service.EmployeeService;
import jp.co.jrqss.admin.employee.form.SearchForm;


@Controller
public class EmployeeController {

	//@Qualifier("EmployeeServiceEmployee")
	@Autowired
	EmployeeService employeeService;


	/*一覧表示*/
	@GetMapping("/admin/employee/list")
	public String getAdminEmployeeList(Model model) {
		List<Employee>employeeList=employeeService.selectMany();
		model.addAttribute("employeeList",employeeList);
		return "admin/employee/list";
	}


	/**
	 * 従業員情報を名前から検索するメソッド
	 * @param model
	 * @param searchForm 入力値が格納されている
	 * @return 従業員リストのパス
	 */
	@PostMapping("/admin/employee/list")
	public String postAdminEmployeeList(Model model , @ModelAttribute("selectForm")
	SearchForm searchForm) {

		if(!(searchForm.getSearchName().equals(""))) {
			List<Employee> employeeList = employeeService.findByName(searchForm);
			model.addAttribute("employeeList",employeeList);
			return "admin/employee/list";
		}else {
			return getAdminEmployeeList(model);
		}
	}

	/**
	 * 従業員情報を住所から検索
	 * @param model
	 * @return
	 */
	@PostMapping("/admin/employee/address")
	public String postAdminEmployeeAddress(Model model,SearchForm searchForm) {

		if(!(searchForm.getSearchAddress().equals(""))) {
			List<Employee> employeeList = employeeService.findByAddress(searchForm);
			model.addAttribute("employeeList",employeeList);
			return "admin/employee/list";
		}else {
			return getAdminEmployeeList(model);
		}




	}



	/*登録画面へ遷移*/
	@GetMapping("/admin/employee/create/register")
	public String getAdminEmployeeCreateRegister(Model model) {
	return "admin/employee/create/register";

	}

	/*新規登録から確認画面*/
	@PostMapping("/admin/employee/create/confirm")
	public String postAdminEmployeeCreateConfirm(
			//@RequestParam("employee_Id")int str1,
			@RequestParam("employee_Name")String str2,
			@RequestParam("employee_Adana")String str3,
			@RequestParam("employee_Ad_Number")String str4,
			@RequestParam("employee_Address")String str5,
			@RequestParam("employee_Phone_Number")String str6,
			@RequestParam("employee_Mail")String str7,
			@RequestParam("desire_Days")int str8,
			@RequestParam("employee_Bikou")String str9,
			@RequestParam(value="employee_Monday",required=false)boolean day1,
			@RequestParam(value="employee_Tuesday",required=false)boolean day2,
			@RequestParam(value="employee_Wednesday",required=false)boolean day3,
			@RequestParam(value="employee_Thursday",required=false)boolean day4,
			@RequestParam(value="employee_Friday",required=false)boolean day5,
			@RequestParam(value="employee_Saturday",required=false)boolean day6,
			@RequestParam(value="employee_Sunday",required=false)boolean day7,
			Model model){
		//model.addAttribute("employee_Id",str1);
		model.addAttribute("employee_Name",str2);
		model.addAttribute("employee_Adana",str3);
		model.addAttribute("employee_Ad_Number",str4);
		model.addAttribute("employee_Address",str5);
		model.addAttribute("employee_Phone_Number",str6);
		model.addAttribute("employee_Mail",str7);
		model.addAttribute("desire_Days",str8);
		model.addAttribute("employee_Bikou",str9);
		model.addAttribute("employee_Monday",day1);
		model.addAttribute("employee_Tuesday",day2);
		model.addAttribute("employee_Wednesday",day3);
		model.addAttribute("employee_Thursday",day4);
		model.addAttribute("employee_Friday",day5);
		model.addAttribute("employee_Saturday",day6);
		model.addAttribute("employee_Sunday",day7);
		return "admin/employee/create/confirm";
	}

	/*確認画面から完了画面へ*/
	@PostMapping("/admin/employee/create/complete")
	public String postAdminEmployeeCreateComplete(@ModelAttribute Employee employee
		) {

		boolean result=employeeService.insertOne(employee);
		if(result==true) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}
		return "admin/employee/create/complete";
	}

	/*確認画面から登録画面へ　修正*/
	@PostMapping("/admin/employee/create/backregister")
	public String postAdminEmployeeCreateBackregister(

		//@RequestParam("employee_Id")int str1,
		@RequestParam("employee_Name")String str2,
		@RequestParam("employee_Adana")String str3,
		@RequestParam("employee_Ad_Number")String str4,
		@RequestParam("employee_Address")String str5,
		@RequestParam("employee_Phone_Number")String str6,
		@RequestParam("employee_Mail")String str7,
		@RequestParam("desire_Days")int str8,
		@RequestParam("employee_Bikou")String str9,
		@RequestParam(value="employee_Monday",required=false)boolean day1,
		@RequestParam(value="employee_Tuesday",required=false)boolean day2,
		@RequestParam(value="employee_Wednesday",required=false)boolean day3,
		@RequestParam(value="employee_Thursday",required=false)boolean day4,
		@RequestParam(value="employee_Friday",required=false)boolean day5,
		@RequestParam(value="employee_Saturday",required=false)boolean day6,
		@RequestParam(value="employee_Sunday",required=false)boolean day7,
		Model model){
		//model.addAttribute("employee_Id",str1);
		model.addAttribute("employee_Name",str2);
		model.addAttribute("employee_Adana",str3);
		model.addAttribute("employee_Ad_Number",str4);
		model.addAttribute("employee_Address",str5);
		model.addAttribute("employee_Phone_Number",str6);
		model.addAttribute("employee_Mail",str7);
		model.addAttribute("desire_Days",str8);
		model.addAttribute("employee_Bikou",str9);
		model.addAttribute("employee_Monday",day1);
		model.addAttribute("employee_Tuesday",day2);
		model.addAttribute("employee_Wednesday",day3);
		model.addAttribute("employee_Thursday",day4);
		model.addAttribute("employee_Friday",day5);
		model.addAttribute("employee_Saturday",day6);
		model.addAttribute("employee_Sunday",day7);

		return "admin/employee/create/register";
	}


	/*従業員詳細情報取得*/
	@GetMapping("/admin/employee/change/change/{employee_Id:.+}")
	public String getAdminEmployeeChangeChange(
						@PathVariable("employee_Id")int employee_Id,Model model) {

		System.out.println("employee_Id="+employee_Id);

		//employee_Idのチェック
		Employee employee=employeeService.selectOne(employee_Id);

		model.addAttribute("employee_Id",employee.getEmployee_Id());
		model.addAttribute("employee_Name",employee.getEmployee_Name());
		model.addAttribute("employee_Adana",employee.getEmployee_Adana());
		model.addAttribute("employee_Ad_Number",employee.getEmployee_Ad_Number());
		model.addAttribute("employee_Address",employee.getEmployee_Address());
		model.addAttribute("employee_Phone_Number",employee.getEmployee_Phone_Number());
		model.addAttribute("employee_Mail",employee.getEmployee_Mail());
		model.addAttribute("desire_Days",employee.getDesire_Days());
		model.addAttribute("employee_Bikou",employee.getEmployee_Bikou());
		model.addAttribute("employee_Monday",employee.isEmployee_Monday());
		model.addAttribute("employee_Tuesday",employee.isEmployee_Tuesday());
		model.addAttribute("employee_Wednesday",employee.isEmployee_Wednesday());
		model.addAttribute("employee_Thursday",employee.isEmployee_Thursday());
		model.addAttribute("employee_Friday",employee.isEmployee_Friday());
		model.addAttribute("employee_Saturday",employee.isEmployee_Saturday());
		model.addAttribute("employee_Sunday",employee.isEmployee_Sunday());

		return "admin/employee/change/change";
	}


	/*従業員詳細変更から確認*/
	@PostMapping("/admin/employee/change/confirm")
	public String postAdminEmployeeChangeConfirm(
			@RequestParam("employee_Id")int str1,
			@RequestParam("employee_Name")String str2,
			@RequestParam("employee_Adana")String str3,
			@RequestParam("employee_Ad_Number")String str4,
			@RequestParam("employee_Address")String str5,
			@RequestParam("employee_Phone_Number")String str6,
			@RequestParam("employee_Mail")String str7,
			@RequestParam("desire_Days")int str8,
			@RequestParam("employee_Bikou")String str9,
			@RequestParam(value="employee_Monday",required=false)boolean day1,
			@RequestParam(value="employee_Tuesday",required=false)boolean day2,
			@RequestParam(value="employee_Wednesday",required=false)boolean day3,
			@RequestParam(value="employee_Thursday",required=false)boolean day4,
			@RequestParam(value="employee_Friday",required=false)boolean day5,
			@RequestParam(value="employee_Saturday",required=false)boolean day6,
			@RequestParam(value="employee_Sunday",required=false)boolean day7,
			Model model) {
			model.addAttribute("employee_Id",str1);
			model.addAttribute("employee_Name",str2);
			model.addAttribute("employee_Adana",str3);
			model.addAttribute("employee_Ad_Number",str4);
			model.addAttribute("employee_Address",str5);
			model.addAttribute("employee_Phone_Number",str6);
			model.addAttribute("employee_Mail",str7);
			model.addAttribute("desire_Days",str8);
			model.addAttribute("employee_Bikou",str9);
			model.addAttribute("employee_Monday",day1);
			model.addAttribute("employee_Tuesday",day2);
			model.addAttribute("employee_Wednesday",day3);
			model.addAttribute("employee_Thursday",day4);
			model.addAttribute("employee_Friday",day5);
			model.addAttribute("employee_Saturday",day6);
			model.addAttribute("employee_Sunday",day7);



		return "admin/employee/change/confirm";
	}


	/*確認から修正*/
	@PostMapping("/admin/employee/change/backchange")
	public String postAdminEmployeeChangeBackchange(

		@RequestParam("employee_Id")int str1,
		@RequestParam("employee_Name")String str2,
		@RequestParam("employee_Adana")String str3,
		@RequestParam("employee_Ad_Number")String str4,
		@RequestParam("employee_Address")String str5,
		@RequestParam("employee_Phone_Number")String str6,
		@RequestParam("employee_Mail")String str7,
		@RequestParam("desire_Days")int str8,
		@RequestParam("employee_Bikou")String str9,
		@RequestParam(value="employee_Monday",required=false)boolean day1,
		@RequestParam(value="employee_Tuesday",required=false)boolean day2,
		@RequestParam(value="employee_Wednesday",required=false)boolean day3,
		@RequestParam(value="employee_Thursday",required=false)boolean day4,
		@RequestParam(value="employee_Friday",required=false)boolean day5,
		@RequestParam(value="employee_Saturday",required=false)boolean day6,
		@RequestParam(value="employee_Sunday",required=false)boolean day7,
		Model model){

		model.addAttribute("employee_Id",str1);
		model.addAttribute("employee_Name",str2);
		model.addAttribute("employee_Adana",str3);
		model.addAttribute("employee_Ad_Number",str4);
		model.addAttribute("employee_Address",str5);
		model.addAttribute("employee_Phone_Number",str6);
		model.addAttribute("employee_Mail",str7);
		model.addAttribute("desire_Days",str8);
		model.addAttribute("employee_Bikou",str9);
		model.addAttribute("employee_Monday",day1);
		model.addAttribute("employee_Tuesday",day2);
		model.addAttribute("employee_Wednesday",day3);
		model.addAttribute("employee_Thursday",day4);
		model.addAttribute("employee_Friday",day5);
		model.addAttribute("employee_Saturday",day6);
		model.addAttribute("employee_Sunday",day7);
		return "admin/employee/change/change";
	}


	/*登録から完了*/
	@PostMapping("/admin/employee/change/complete")
	public String postAdminEmployeeChangeComplete(@ModelAttribute Employee employee,Model model) {

		boolean result =employeeService.updateOne(employee);
		if(result==true) {
			model.addAttribute("更新成功",result);
		}else {
			model.addAttribute("更新失敗",result);
		}

		System.out.println(model);

		return getAdminEmployeeList(model);
		}

	/*削除画面へ遷移*/
	@GetMapping("/admin/employee/delete/confirm/{employee_Id:.+}")
	public String getAdminEmployeeDeleteConfirm(@PathVariable("employee_Id")int employee_Id,
		Model model) {

		Employee employee=employeeService.selectOne(employee_Id);

		//model.addAttribute("employee_Id",employee.getEmployee_Id());
		model.addAttribute("employee_Name",employee.getEmployee_Name());
		model.addAttribute("employee_Adana",employee.getEmployee_Adana());

		return "admin/employee/delete/confirm";


	}


	/*削除確認から完了*/
	@PostMapping("/admin/employee/delete/complete")
	public String postAdminEmployeeDeleteComplete(@ModelAttribute Employee employee,Model model) {

		boolean result=employeeService.deleteOne(employee.getEmployee_Id());

		if(result==true) {
			model.addAttribute("削除成功",result);
		}else {
			model.addAttribute("削除失敗",result);
		}

		return "admin/employee/delete/complete";
	}
}


