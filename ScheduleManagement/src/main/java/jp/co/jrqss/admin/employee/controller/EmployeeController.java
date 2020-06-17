package jp.co.jrqss.admin.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.jrqss.admin.employee.domain.model.Employee;
//import jp.co.jrqss.admin.employee.domain.model.Employee;
import jp.co.jrqss.admin.employee.domain.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/admin/employee/list")
	public String getAdminEmployeeList(Model model) {

		List<Employee>employeeList=employeeService.selectMany();

		model.addAttribute("employeeList",employeeList);

		return "admin/employee/list";
	}

	@PostMapping("/admin/employee/create/register")
	public String postAdminEmployeeCreateRegister(Model model) {

		return "admin/employee/create/register";

	}

	@RequestMapping("/admin/employee/create/confirm")
	public String postAdminEmployeeCreateConfirm(
			@RequestParam("employee_Id")int str1,
			@RequestParam("employee_Name")String str2,
			@RequestParam("building_Id")int str3,
			@RequestParam("employee_Ad_Number")String str4,
			@RequestParam("employee_Address")String str5,
			@RequestParam("employee_Phone_Number")String str6,
			@RequestParam("employee_Mail")String str7,
			@RequestParam("desire_Days")int str8,
			@RequestParam(value="desire_monday",required=false)boolean day1,
			@RequestParam(value="desire_tuesday",required=false)boolean day2,
			@RequestParam(value="desire_wednesday",required=false)boolean day3,
			@RequestParam(value="desire_thursday",required=false)boolean day4,
			@RequestParam(value="desire_friday",required=false)boolean day5,
			@RequestParam(value="desire_saturday",required=false)boolean day6,
			@RequestParam(value="desire_sunday",required=false)boolean day7,



			Model model) {

		Employee employee=new Employee();

		employee.setEmployee_Id(str1);
		employee.setEmployee_Name(str2);
		employee.setBuilding_Id(str3);
		employee.setEmployee_Ad_Number(str4);
		employee.setEmployee_Address(str5);
		employee.setEmployee_Phone_Number(str6);
		employee.setEmployee_Mail(str7);
		employee.setDesire_Days(str8);
		employee.setEmployee_Monday(day1);
		employee.setEmployee_Tuesday(day2);
		employee.setEmployee_Wednesday(day3);
		employee.setEmployee_Thursday(day4);
		employee.setEmployee_Friday(day5);
		employee.setEmployee_Saturday(day6);
		employee.setEmployee_Sunday(day7);




		model.addAttribute("employee_Id",str1);
		model.addAttribute("employee_Name",str2);
		model.addAttribute("building_Id",str3);
		model.addAttribute("employee_Ad_Number",str4);
		model.addAttribute("employee_Address",str5);
		model.addAttribute("employee_Phone_Number",str6);
		model.addAttribute("employee_Mail",str7);
		model.addAttribute("desire_Days",str8);
		//確認画面用にbooleanでtrueだったら曜日に変換
		if(day1==true) {
			String monday=String.valueOf(day1);
			monday="月";
		model.addAttribute("monday",monday);
		}
		if(day2==true) {
			String tuesday=String.valueOf(day2);
			tuesday="火";
		model.addAttribute("tuesday",tuesday);
		}
		if(day3==true) {
			String wednesday=String.valueOf(day3);
			wednesday="水";
		model.addAttribute("wednesday",wednesday);
		}
		if(day4==true) {
			String thursday=String.valueOf(day4);
			thursday="木";
		model.addAttribute("thursday",thursday);
		}
		if(day5==true) {
			String friday=String.valueOf(day5);
			friday="金";
		model.addAttribute("friday",friday);
		}
		if(day6==true) {
			String saturday=String.valueOf(day6);
			saturday="土";
		model.addAttribute("saturday",saturday);
		}
		if(day7==true) {
			String sunday=String.valueOf(day7);
			sunday="日";
		model.addAttribute("sunday",sunday);
		}

		return "admin/employee/create/confirm";


	}


	@PostMapping("/admin/employee/create/complete")
	public String postAdminEmployeeCreateComplete(@ModelAttribute Employee employee) {

		//Employee employee=new Employee();
		employee.setEmployee_Id(employee.getEmployee_Id());
		employee.setEmployee_Name(employee.getEmployee_Name());
		employee.setBuilding_Id(employee.getBuilding_Id());
		employee.setEmployee_Ad_Number(employee.getEmployee_Ad_Number());
		employee.setEmployee_Address(employee.getEmployee_Address());
		employee.setEmployee_Phone_Number(employee.getEmployee_Phone_Number());
		employee.setEmployee_Mail(employee.getEmployee_Mail());
		employee.setDesire_Days(employee.getDesire_Days());
		employee.setEmployee_Monday(employee.isEmployee_Monday());
		employee.setEmployee_Tuesday(employee.isEmployee_Tuesday());
		employee.setEmployee_Wednesday(employee.isEmployee_Wednesday());
		employee.setEmployee_Thursday(employee.isEmployee_Thursday());
		employee.setEmployee_Friday(employee.isEmployee_Friday());
		employee.setEmployee_Saturday(employee.isEmployee_Saturday());
		employee.setEmployee_Sunday(employee.isEmployee_Sunday());

		boolean result=employeeService.insert(employee);

		if(result==true) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}


		return "admin/employee/create/complete";
	}

	@PostMapping("/admin/employee/create/backregister")
	public String postAdminEmployeeCreateBackregister(RedirectAttributes redirectAttributes,Model model){

		return "redirect:admin/employee/create/register";
	}

	@PostMapping("/admin/employee/delete/confirm")

	public String postAdminEmployeeDeleteConfirm(Model model) {

		return "admin/employee/delete/confirm";

	}


}
