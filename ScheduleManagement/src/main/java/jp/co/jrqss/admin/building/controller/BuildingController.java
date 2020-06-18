package jp.co.jrqss.admin.building.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.model.BuildingForm;
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

		// ビル一覧の生成
		List<Building>buildingList=buildingService.selectMany();

		// Modelにリストを登録
		model.addAttribute("buildingList",buildingList);

		// データ件数を取得
		int count = buildingService.count();
		model.addAttribute("buildingListCount", count);

		return "admin/building/list";
	}

	/**
     * 新規登録画面のGETメソッド用処理.
     */
	@GetMapping("admin/building/create/register")
	public String getAdminBuildingCreateRegister(Model model) {

		return "admin/building/create/register";
	}


	/**
     * ユーザー詳細画面のGETメソッド用処理.
     */
	@GetMapping("admin/building/change/change")
	public String getAdminBuildingChangeChange(@ModelAttribute BuildingForm form,
			Model model,
			@PathVariable("id") int buildingId) {

		// ビルID確認
		System.out.println("buildingId = " + buildingId);

		// コンテンツ部分にビル詳細を表示するための文字列を登録
		model.addAttribute("contents", "admin/building/change/change ::change_contents");


		// ビル情報を取得
		Building building = buildingService.selectOne(buildingId);

		// ビルクラスをフォームクラスに変換
		form.setBuildingId(building.getBuildingId());
		form.setBuildingName(building.getBuildingName());
		form.setBuildingNinzu(building.getBuildingNinzu());
		form.setBuildingTime(building.getBuildingTime());
		form.setBuildingMonday(building.isBuildingMonday());
		form.setBuildingTuesday(building.isBuildingTuesday());
		form.setBuildingWednesday(building.isBuildingWednesday());
		form.setBuildingTuesday(building.isBuildingTuesday());
		form.setBuildingFriday(building.isBuildingFriday());
		form.setBuildingSaturday(building.isBuildingSaturday());
		form.setBuildingSunday(building.isBuildingSunday());
		form.setBuildingAdNumber(building.getBuildingAdNumber());
		form.setBuildingAddress(building.getBuildingAddress());
		form.setBuildingPhoneNumber(building.getBuildingPhoneNumber());
		form.setBuildingMail(building.getBuildingMail());

		// Modelに登録
		model.addAttribute("buildingForm", form);

		return "admin/building/change/change";
	}



}
