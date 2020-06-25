package jp.co.jrqss.admin.building.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.model.BuildingForm;
import jp.co.jrqss.admin.building.domain.service.BuildingService;
import jp.co.jrqss.admin.employee.form.SearchForm;

@Controller
public class BuildingController {

	@Qualifier("BuildingServiceBuilding")
	@Autowired
	BuildingService buildingService;

	/**
	 * 【ビル情報一覧】
	 */
	@GetMapping("admin/building/list")
	public String getAdminBuildingList(Model model) {

		// ビル一覧の生成
		List<Building>buildingList=buildingService.selectMany();

		// Modelにリストを登録
		model.addAttribute("buildingList",buildingList);

		/** データ件数を取得
		* int count = buildingService.count();
		* model.addAttribute("buildingListCount", count); */

		return "admin/building/list";
	}

	/**
	 * ビル名を元にビルを検索するメソッド
	 * @param model
	 * @param searchForm 入力値が格納されている
	 * @return パス
	 */
	@PostMapping("admin/building/list")
	public String postAdminBuildingList(Model model , @ModelAttribute("SearchForm") SearchForm searchForm) {
		if(!(searchForm.getSearchName().equals(""))) {
			List<Building> buildingList = buildingService.findByName(searchForm);
			model.addAttribute("buildingList",buildingList);
			return "admin/building/list";
		}else {
			return getAdminBuildingList(model);
		}
	}

	/**
     * 【新規登録】
     */
	@GetMapping("admin/building/create/register")
	public String getAdminBuildingCreateRegister(@ModelAttribute BuildingForm form,Model model) {

		return "admin/building/create/register";
	}


	/**
     * 【確認】
     */
	@PostMapping("admin/building/create/confirm")
	public String postAdminBuildingCreateConfirm(@RequestParam("buildingId")int str1,
			@RequestParam("buildingName")String str2,
			@RequestParam("buildingNinzu")int str3,
			@RequestParam("buildingTime")int str4,
			@RequestParam(value="buildingMonday",required=false)boolean day1,
			@RequestParam(value="buildingTuesday",required=false)boolean day2,
			@RequestParam(value="buildingWednesday",required=false)boolean day3,
			@RequestParam(value="buildingThursday",required=false)boolean day4,
			@RequestParam(value="buildingFriday",required=false)boolean day5,
			@RequestParam(value="buildingSaturday",required=false)boolean day6,
			@RequestParam(value="buildingSunday",required=false)boolean day7,
			@RequestParam("buildingAdNumber")String str5,
			@RequestParam("buildingAddress")String str6,
			@RequestParam("buildingPhoneNumber")String str7,
			@RequestParam("buildingMail")String str8,
			Model model) {

		model.addAttribute("buildingId",str1);
		model.addAttribute("buildingName",str2);
		model.addAttribute("buildingNinzu",str3);
		model.addAttribute("buildingTime",str4);
		model.addAttribute("buildingMonday",day1);
		model.addAttribute("buildingTuesday",day2);
		model.addAttribute("buildingWednesday",day3);
		model.addAttribute("buildingThursday",day4);
		model.addAttribute("buildingFriday",day5);
		model.addAttribute("buildingSaturday",day6);
		model.addAttribute("buildingSunday",day7);
		model.addAttribute("buildingAdNumber",str5);
		model.addAttribute("buildingAddress",str6);
		model.addAttribute("buildingPhoneNumber",str7);
		model.addAttribute("buildingMail",str8);

			return "admin/building/create/confirm";
	}

	/**
     * 【完了】
     */
	@PostMapping("admin/building/create/complete")
	public String postAdminBuildingCreateComplete(@ModelAttribute BuildingForm form,
			Model model) {

		// formの中身をコンソールに出して確認
				System.out.println(form);

			// insert用変数
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

					return "admin/building/create/complete";
	}

	/**
     * 【登録】確認 → 修正
     */
	@PostMapping("admin/building/create/backregister")
	public String postAdminBuildingCreateBackregister(@RequestParam("buildingId")int str1,
			@RequestParam("buildingName")String str2,
			@RequestParam("buildingNinzu")int str3,
			@RequestParam("buildingTime")int str4,
			@RequestParam(value="buildingMonday",required=false)boolean day1,
			@RequestParam(value="buildingTuesday",required=false)boolean day2,
			@RequestParam(value="buildingWednesday",required=false)boolean day3,
			@RequestParam(value="buildingThursday",required=false)boolean day4,
			@RequestParam(value="buildingFriday",required=false)boolean day5,
			@RequestParam(value="buildingSaturday",required=false)boolean day6,
			@RequestParam(value="buildingSunday",required=false)boolean day7,
			@RequestParam("buildingAdNumber")String str5,
			@RequestParam("buildingAddress")String str6,
			@RequestParam("buildingPhoneNumber")String str7,
			@RequestParam("buildingMail")String str8,
			Model model) {

		model.addAttribute("buildingId",str1);
		model.addAttribute("buildingName",str2);
		model.addAttribute("buildingNinzu",str3);
		model.addAttribute("buildingTime",str4);
		model.addAttribute("buildingMonday",day1);
		model.addAttribute("buildingTuesday",day2);
		model.addAttribute("buildingWednesday",day3);
		model.addAttribute("buildingThursday",day4);
		model.addAttribute("buildingFriday",day5);
		model.addAttribute("buildingSaturday",day6);
		model.addAttribute("buildingSunday",day7);
		model.addAttribute("buildingAdNumber",str5);
		model.addAttribute("buildingAddress",str6);
		model.addAttribute("buildingPhoneNumber",str7);
		model.addAttribute("buildingMail",str8);

		return "admin/building/create/register";

	}

	/**
     * 【ユーザー詳細】
     */
	@GetMapping("admin/building/change/change/{buildingId:.+}")
	public String getAdminBuildingChangeChange(@ModelAttribute BuildingForm form,
			Model model,
			@PathVariable("buildingId") int buildingId) {

		// ビルID確認
		System.out.println("buildingId = " + buildingId);

		// コンテンツ部分にビル詳細を表示するための文字列を登録
		model.addAttribute("contents", "admin/building/change/change ::change_contents");


		// buildingIdを取得
		Building building = buildingService.selectOne(buildingId);

		// ビルクラスをフォームクラスに変換
/*		form.setBuildingId(building.getBuildingId());
		form.setBuildingName(building.getBuildingName());
		form.setBuildingNinzu(building.getBuildingNinzu());
		form.setBuildingTime(building.getBuildingTime());
		form.setBuildingMonday(building.isBuildingMonday());
		form.setBuildingTuesday(building.isBuildingTuesday());
		form.setBuildingWednesday(building.isBuildingWednesday());
		form.setBuildingThursday(building.isBuildingThursday());
		form.setBuildingFriday(building.isBuildingFriday());
		form.setBuildingSaturday(building.isBuildingSaturday());
		form.setBuildingSunday(building.isBuildingSunday());
		form.setBuildingAdNumber(building.getBuildingAdNumber());
		form.setBuildingAddress(building.getBuildingAddress());
		form.setBuildingPhoneNumber(building.getBuildingPhoneNumber());
		form.setBuildingMail(building.getBuildingMail());
*/

//System.out.println("form.BN="+form.getBuildingName());


		model.addAttribute("buildingId",building.getBuildingId());
		model.addAttribute("buildingName",building.getBuildingName());
		model.addAttribute("buildingNinzu",building.getBuildingNinzu());
		model.addAttribute("buildingTime",building.getBuildingTime());
		model.addAttribute("buildingMonday",building.isBuildingMonday());
		model.addAttribute("buildingTuesday",building.isBuildingTuesday());
		model.addAttribute("buildingWednesday",building.isBuildingWednesday());
		model.addAttribute("buildingThursday",building.isBuildingThursday());
		model.addAttribute("buildingFriday",building.isBuildingFriday());
		model.addAttribute("buildingSaturday",building.isBuildingSaturday());
		model.addAttribute("buildingSunday",building.isBuildingSunday());
		model.addAttribute("buildingAdNumber",building.getBuildingAdNumber());
		model.addAttribute("buildingAddress",building.getBuildingAddress());
		model.addAttribute("buildingPhoneNumber",building.getBuildingPhoneNumber());
		model.addAttribute("buildingMail",building.getBuildingMail());

		// Modelに登録
/*		model.addAttribute("buildingForm", form);
*/
		return "admin/building/change/change";
	}

	/**
     * 【変更 → 確認】
     */
	@PostMapping("admin/building/change/confirm")
	public String postAdminBuildingChangeeConfirm(@RequestParam("buildingId")int str1,
			@RequestParam("buildingName")String str2,
			@RequestParam("buildingNinzu")int str3,
			@RequestParam("buildingTime")int str4,
			@RequestParam(value="buildingMonday",required=false)boolean day1,
			@RequestParam(value="buildingTuesday",required=false)boolean day2,
			@RequestParam(value="buildingWednesday",required=false)boolean day3,
			@RequestParam(value="buildingThursday",required=false)boolean day4,
			@RequestParam(value="buildingFriday",required=false)boolean day5,
			@RequestParam(value="buildingSaturday",required=false)boolean day6,
			@RequestParam(value="buildingSunday",required=false)boolean day7,
			@RequestParam("buildingAdNumber")String str5,
			@RequestParam("buildingAddress")String str6,
			@RequestParam("buildingPhoneNumber")String str7,
			@RequestParam("buildingMail")String str8,
			Model model) {

		Building building = new Building();

		building.setBuildingId(str1);
		building.setBuildingName(str2);
		building.setBuildingNinzu(str3);
		building.setBuildingTime(str4);
		building.setBuildingMonday(day1);
		building.setBuildingTuesday(day2);
		building.setBuildingWednesday(day3);
		building.setBuildingThursday(day4);
		building.setBuildingFriday(day5);
		building.setBuildingSaturday(day6);
		building.setBuildingSunday(day7);
		building.setBuildingAdNumber(str5);
		building.setBuildingAddress(str6);
		building.setBuildingPhoneNumber(str7);
		building.setBuildingMail(str8);

		model.addAttribute("buildingId",str1);
		model.addAttribute("buildingName",str2);
		model.addAttribute("buildingNinzu",str3);
		model.addAttribute("buildingTime",str4);
		model.addAttribute("buildingMonday",day1);
		model.addAttribute("buildingTuesday",day2);
		model.addAttribute("buildingWednesday",day3);
		model.addAttribute("buildingThursday",day4);
		model.addAttribute("buildingFriday",day5);
		model.addAttribute("buildingSaturday",day6);
		model.addAttribute("buildingSunday",day7);
		model.addAttribute("buildingAdNumber",str5);
		model.addAttribute("buildingAddress",str6);
		model.addAttribute("buildingPhoneNumber",str7);
		model.addAttribute("buildingMail",str8);

			return "admin/building/change/confirm";
	}

	/**
     * 【変更】確認 → 修正
     */
	@PostMapping("admin/building/change/backchange")
	public String postAdminBuildingChangeBackchange(@RequestParam("buildingId")int str1,
			@RequestParam("buildingName")String str2,
			@RequestParam("buildingNinzu")int str3,
			@RequestParam("buildingTime")int str4,
			@RequestParam(value="buildingMonday",required=false)boolean day1,
			@RequestParam(value="buildingTuesday",required=false)boolean day2,
			@RequestParam(value="buildingWednesday",required=false)boolean day3,
			@RequestParam(value="buildingThursday",required=false)boolean day4,
			@RequestParam(value="buildingFriday",required=false)boolean day5,
			@RequestParam(value="buildingSaturday",required=false)boolean day6,
			@RequestParam(value="buildingSunday",required=false)boolean day7,
			@RequestParam("buildingAdNumber")String str5,
			@RequestParam("buildingAddress")String str6,
			@RequestParam("buildingPhoneNumber")String str7,
			@RequestParam("buildingMail")String str8,
			Model model) {

		model.addAttribute("buildingId",str1);
		model.addAttribute("buildingName",str2);
		model.addAttribute("buildingNinzu",str3);
		model.addAttribute("buildingTime",str4);
		model.addAttribute("buildingMonday",day1);
		model.addAttribute("buildingTuesday",day2);
		model.addAttribute("buildingWednesday",day3);
		model.addAttribute("buildingThursday",day4);
		model.addAttribute("buildingFriday",day5);
		model.addAttribute("buildingSaturday",day6);
		model.addAttribute("buildingSunday",day7);
		model.addAttribute("buildingAdNumber",str5);
		model.addAttribute("buildingAddress",str6);
		model.addAttribute("buildingPhoneNumber",str7);
		model.addAttribute("buildingMail",str8);

		return "admin/building/change/change";
	}


	/**
     * 【完了】更新用処理
     */
	@PostMapping("admin/building/change/complete")
	public String postAdminBuildingChangeComplete(@ModelAttribute Building building,
			Model model) {

		System.out.println("更新ボタンの処理");


		// 更新実行
		boolean result = buildingService.updateOne(building);

				if(result == true) {
					model.addAttribute("result", "更新成功");
				} else {
					model.addAttribute("result", "更新失敗");
				}

				return "admin/building/change/complete";

}



	/**
     * ユーザー一覧のCSV出力用処理.
     */
    @GetMapping("admin/building/list/csv")
    public String getAdminBuildingListCsv(Model model) {

    	return getAdminBuildingList(model);

    }



}
