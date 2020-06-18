package jp.co.jrqss.admin.building.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	public String getAdminBuildingCreateRegister(@ModelAttribute BuildingForm form,Model model) {

		return "admin/building/create/register";
	}

	/**
     * 新規登録画面のPOSTメソッド用処理.
     */
	@PostMapping("admin/building/create/register")
	public String postAdminBuildingCreateRegister(@ModelAttribute BuildingForm form,Model model) {


	// 登録用変数
			Building building = new Building();

			building.setBuildingId(form.getBuildingId());
			building.setBuildingName(form.getBuildingName());
			building.setBuildingNinzu(form.getBuildingNinzu());
			building.setBuildingTime(form.getBuildingTime());
			building.setBuildingMonday(form.isBuildingMonday());
			building.setBuildingTuesday(form.isBuildingTuesday());
			building.setBuildingWednesday(form.isBuildingWednesday());
			building.setBuildingTuesday(form.isBuildingTuesday());
			building.setBuildingFriday(form.isBuildingFriday());
			building.setBuildingSaturday(form.isBuildingSaturday());
			building.setBuildingSunday(form.isBuildingSunday());
			building.setBuildingAdNumber(form.getBuildingAdNumber());
			building.setBuildingAddress(form.getBuildingAddress());
			building.setBuildingPhoneNumber(form.getBuildingPhoneNumber());
			building.setBuildingMail(form.getBuildingMail());

			// ビル登録処理
			boolean result = buildingService.insert(building);

			// 登録結果の判定
			if (result == true) {
	            System.out.println("insert成功");
	        } else {
	            System.out.println("insert失敗");
	        }

			return "redirect:/list";

	}


	/**
     * ユーザー詳細画面のGETメソッド用処理.
     */
	@GetMapping("admin/building/change/change/{id:.+}")
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

	/**
     * 更新用処理.
     */
	@PostMapping(value = "admin/building/change/change", params = "update")
	public String postBuildingChangeChangeUpdate(@ModelAttribute BuildingForm form,
			Model model) {

		System.out.println("更新ボタンの処理");

		// インスタンスの生成
		Building building = new Building();

		// フォームクラスをBuildingクラスに変換
		building.setBuildingId(form.getBuildingId());

		try {

		// 更新実行
		boolean result = buildingService.updateOne(building);

				if(result == true) {
					model.addAttribute("result", "更新成功");
				} else {
					model.addAttribute("result", "更新失敗");
				}

		}catch (DataAccessException e) {

					model.addAttribute("result", "更新失敗(トランザクションテスト)");

				}

				// 一覧画面
				return getAdminBuildingList(model);

}



	/**
     * ユーザー一覧のCSV出力用処理.
     */
    @GetMapping("admin/building/list/csv")
    public String getAdminBuildingListCsv(Model model) {

    	return getAdminBuildingList(model);

    }



}
