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

	@GetMapping("admin/building/list")
	public String getAdminBuildingList(Model midel) {

		List<Building>buildingList=buildingService.selectMany();

		model.addAtribute("buildingList",buildingList);

		return "/admin/building/list";
	}

}
