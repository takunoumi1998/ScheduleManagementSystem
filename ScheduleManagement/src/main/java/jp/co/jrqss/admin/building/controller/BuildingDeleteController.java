package jp.co.jrqss.admin.building.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.building.domain.service.BuildingChangeService;
import jp.co.jrqss.admin.building.domain.service.BuildingService;

@Controller
public class BuildingDeleteController {

	@Autowired
	BuildingChangeService buildingChangeService;

	@PostMapping(value="/list", params="delete")
	public String postListDelete(@ModelAttribute ChangeForm form,
			Model model) {
		System.out.println("削除ボタンの処理");

		boolean result = BuildingService.deleteOne(form.getBuilding_id());

		if(result == true) {
			model.addAttribute("result", "削除成功");

		}else {
			model.addAttribute("result", "削除失敗");
		}

		return getList(model);
	}

}
