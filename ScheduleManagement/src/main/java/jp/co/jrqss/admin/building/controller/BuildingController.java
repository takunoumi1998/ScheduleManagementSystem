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
import jp.co.jrqss.admin.building.domain.model.ResisterForm;
import jp.co.jrqss.admin.building.domain.service.BuildingService;

@Controller
public class BuildingController {

	@Autowired
	BuildingService buildingService;

	//ビル一覧を取得
    @GetMapping("/admin/building/list")
    public String getBuildingList(Model model) {

        //ユーザー一覧の生成
        List<Building> buildingList = buildingService.selectMany();

        //Modelにビル一覧を登録
        model.addAttribute("buildingList", buildingList);

        return "admin/building/list";
    }

    //新規登録画面へ遷移
    @GetMapping("/admin/building/create/resister")
    public String postAdminBuildingCreateResister(Model model) {
    	return "admin/building/create/resister";
    }

    //ビル詳細取得
    @GetMapping("/admin/building/change/change/{buildingId:.+}")
    public String getAdminBuildingChangeChange(@ModelAttribute ResisterForm form,
            Model model,
            @PathVariable("buildingId") int buildingId) {

        // ビルID確認（デバッグ）
 //       System.out.println("buildingId = " + buildingId);

        // コンテンツ部分にビル詳細を表示するための文字列を登録
        model.addAttribute("contents", "/admin/building/change/change :: change_contents");


        // ビルIDのチェック
        if (buildingId != 0 && buildingId > 0) {

            // ビル情報を取得
            Building building = buildingService.selectOne(buildingId);

            // Buildingクラスをフォームクラスに変換
            form.setBuildingId(building.getBuildingId()); //ビルID
            form.setBuildingName(building.getBuildingName()); //ビル名称
            form.setBuildingNinzu(building.getBuildingNinzu()); //清掃人員数
            form.setBuildingTime(building.getBuildingTime()); //清掃時間
            form.setBuildingMonday(building.isBuildingMonday()); //月曜日チェック欄
            form.setBuildingTuesday(building.isBuildingTuesday()); //火曜日チェック欄
            form.setBuildingWednesday(building.isBuildingWednesday()); //水曜日チェック欄
            form.setBuildingThursday(building.isBuildingThursday()); //木曜日チェック欄
            form.setBuildingFriday(building.isBuildingFriday()); //金曜日チェック欄
            form.setBuildingSaturday(building.isBuildingSaturday()); //土曜日チェック欄
            form.setBuildingSunday(building.isBuildingSunday()); //日曜日チェック欄
            form.setBuildingAdNumber(building.getBuildingAdNumber()); //ビル郵便番号
            form.setBuildingAddress(building.getBuildingAddress()); //ビル住所
            form.setBuildingPhoneNumber(building.getBuildingPhoneNumber()); //ビル連絡先
            form.setBuildingMail(building.getBuildingMail()); //ビルメール

            // Modelに登録
            model.addAttribute("resisterForm", form);
        }

        return "/admin/building/change/change";
    }

    //情報変更
    @PostMapping(value = "/admin/building/change/change", params = "update")
    public String postChangeUpdate(@ModelAttribute ResisterForm form,
            Model model) {

        System.out.println("更新ボタンの処理");

        //Buildingインスタンスの生成
        Building building = new Building();

        //フォームクラスをBuildingクラスに変換
        building.setBuildingId(form.getBuildingId()); //ビルID
        building.setBuildingName(form.getBuildingName()); //ビル名称
        building.setBuildingNinzu(form.getBuildingNinzu()); //清掃人員数
        building.setBuildingTime(form.getBuildingTime()); //清掃時間
        building.setBuildingMonday(form.isBuildingMonday()); //月曜日チェック欄
        building.setBuildingTuesday(form.isBuildingTuesday()); //火曜日チェック欄
        building.setBuildingWednesday(form.isBuildingWednesday()); //水曜日チェック欄
        building.setBuildingThursday(form.isBuildingThursday()); //木曜日チェック欄
        building.setBuildingFriday(form.isBuildingFriday()); //金曜日チェック欄
        building.setBuildingSaturday(form.isBuildingSaturday()); //土曜日チェック欄
        building.setBuildingSunday(form.isBuildingSunday()); //日曜日チェック欄
        building.setBuildingAdNumber(form.getBuildingAdNumber()); //ビル郵便番号
        building.setBuildingAddress(form.getBuildingAddress()); //ビル住所
        building.setBuildingPhoneNumber(form.getBuildingPhoneNumber()); //ビル連絡先
        building.setBuildingMail(form.getBuildingMail()); //ビルメール

        try {

            //更新実行
            boolean result = buildingService.updateOne(building);

            if (result == true) {
                model.addAttribute("result", "更新成功");
            } else {
                model.addAttribute("result", "更新失敗");
            }

        } catch (DataAccessException e) {

            model.addAttribute("result", "更新失敗(トランザクションテスト)");

        }

        //ユーザー一覧画面を表示
        return "/admin/building/list";
    }

    //削除
    @PostMapping("/admin/building/change/change")
    public String postAdminBuildingChangeChange(@ModelAttribute ResisterForm form,
            Model model) {

        System.out.println("削除ボタンの処理");

        //削除実行
        boolean result = buildingService.deleteOne(form.getBuildingId());

        if (result == true) {

            model.addAttribute("result", "削除成功");

        } else {

            model.addAttribute("result", "削除失敗");

        }

        //ユーザー一覧画面を表示
        return "/admin/building/list";
    }

}