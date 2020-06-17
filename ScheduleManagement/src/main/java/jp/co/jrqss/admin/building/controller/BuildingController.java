package jp.co.jrqss.admin.building.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
