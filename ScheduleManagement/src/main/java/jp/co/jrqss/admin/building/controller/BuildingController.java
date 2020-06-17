package jp.co.jrqss.admin.building.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.service.BuildingService;

@Controller
public class BuildingController {

	@Autowired
	BuildingService buildingService;

	/**
	 * ビル情報一覧画面を表示
	 * @param model Model
	 * @return ビル情報一覧画面
	 */
	@GetMapping("admin/building/list")
	public String getAdminBuildingList(Model model) {

		List<Building>buildingList=buildingService.selectMany();

		model.addAttribute("buildingList",buildingList);

		return "admin/building/list";
	}

	@PostMapping("admin/building/create/register")
	public String postAdminBuildingCreateRegister(Model model) {

		return "admin/building/create/register";
	}

	@PostMapping("admin/building/change/change")
	public String postAdminBuildingChangeChange(Model model) {

		return "admin/building/change/change";
	}

	@RequestMapping("admin/buiiding/create/confirm")
	public String postAdminBuildingCreateConfirm(
		@RequestParam("buildingId")String str1,
		@RequestParam("buildingName")String str2,
		@RequestParam("employeeName")String str3,
		@RequestParam("buildingNinzu")String str4,
		@RequestParam("buildingTime")String str5,
		@RequestParam("buildingAdNumber")String str6,
		@RequestParam("buildingAddress")String str7,
		@RequestParam("buildingPhoneNumber")String str8,
		@RequestParam("buildingMail")String str9,
		@RequestParam("buildingDesireDays")String str10,
		Model model) {

		model.addAttribute("buildingId",str1);
		model.addAttribute("buildingName",str2);
		model.addAttribute("employee",str3);
		model.addAttribute("buildingNinzu",str4);
		model.addAttribute("buildingTime",str5);
		model.addAttribute("buildingAdNumber",str6);
		model.addAttribute("buildingAddress",str7);
		model.addAttribute("buildingPhoneNumber",str8);
		model.addAttribute("buildingMail",str9);
		model.addAttribute("buildingDesireDays",str10);

		return "admin/building/create/confirm";



	}

}
