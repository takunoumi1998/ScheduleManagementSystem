package jp.co.jrqss.admin.building.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.building.domain.model.BuildingChange;
import jp.co.jrqss.admin.building.domain.service.BuildingChangeService;

@Controller
public class BuildingChangeController {

	@Autowired
	BuildingChangeService buildingChangeService;

	@PostMapping(value="/building/change/change", params="update")
	public String postBuildingChangeUpdate(@ModelAttribute ChangeForm form,
			Model model) {
		System.out.println("更新ボタンの処理");

		BuildingChange buildingChange = new BuildingChange();

		buildingChange.setBuilding_id(form.getBuilding_id());
		buildingChange.setBuilding_name(form.getBuilding_name());
		buildingChange.setBuilding_ninzu(form.getBuilding_ninzu());
		buildingChange.setBuilding_time(form.getBuilding_time());
		buildingChange.setBuilding_monday(form.isBuilding_monday());
		buildingChange.setBuilding_tuesday(form.isBuilding_tuesday());
		buildingChange.setBuilding_wednesday(form.isBuilding_wednesday());
		buildingChange.setBuilding_thursday(form.isBuilding_thursday());
		buildingChange.setBuilding_friday(form.isBuilding_friday());
		buildingChange.setBuilding_saturday(form.isBuilding_saturday());
		buildingChange.setBuilding_sunday(form.isBuilding_sunday());
		buildingChange.setBuilding_ad_number(form.getBuilding_ad_number());
		buildingChange.setBuilding_address(form.getBuilding_address());
		buildingChange.setBuilding_phone_number(form.getBuilding_phone_number());
		buildingChange.setBuilding_mail(form.getBuilding_mail());

		try {

			boolean result = buildingChangeService.updateOne(buildingChange);

			if(result == true) {
				model.addAttribute("result", "更新成功");
			}else {
				model.addAttribute("result", "更新失敗");
			}
		}catch(DataAccessException e) {

			model.addAttribute("result","更新失敗(トランザクションテスト)");
		}

		return getList(model);

	}

}
