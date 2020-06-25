package jp.co.jrqss.admin.building.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.building.domain.model.Building;
import jp.co.jrqss.admin.building.domain.model.ResisterForm;
import jp.co.jrqss.admin.building.domain.service.BuildingService;

@Controller
public class ResisterController {

    @Autowired
    private BuildingService buildingService;

    /**
     * ユーザー登録画面のGETメソッド用処理.
     */
    @GetMapping("/admin/building/create/resister")
    public String getResister(@ModelAttribute ResisterForm form, Model model) {

        // signup.htmlに画面遷移
        return "admin/building/create/resister";
    }

    /**
     * ユーザー登録画面のPOSTメソッド用処理.
     */
    @PostMapping("/admin/building/create/resister")
    public String postSignUp(@ModelAttribute @Validated(GroupOrder.class) ResisterForm form,
            BindingResult bindingResult,
            Model model) {

        // 入力チェックに引っかかった場合、ユーザー登録画面に戻る
        if (bindingResult.hasErrors()) {

            // GETリクエスト用のメソッドを呼び出して、ユーザー登録画面に戻ります
            return getResister(form, model);

        }

        // formの中身をコンソールに出して確認します
        System.out.println(form);

        // insert用変数
        Building building = new Building();

        building.setBuildingId(form.getBuildingId()); //ビルID
        building.setBuildingName(form.getBuildingName()); //ビル名称
        building.setBuildingNinzu(form.getBuildingNinzu()); //清掃人員数
        building.setBuildingTime(form.getBuildingTime()); //清掃時間
        building.setBuildingMonday(form.isBuildingMonday()); //月曜希望
        building.setBuildingTuesday(form.isBuildingTuesday()); //火曜希望
        building.setBuildingWednesday(form.isBuildingWednesday()); //水曜希望
        building.setBuildingThursday(form.isBuildingThursday()); //木曜希望
        building.setBuildingFriday(form.isBuildingFriday()); //金曜希望
        building.setBuildingSaturday(form.isBuildingSaturday()); //土曜希望
        building.setBuildingSunday(form.isBuildingSunday()); //日曜希望
        building.setBuildingAdNumber(form.getBuildingAdNumber()); //ビルの郵便番号
        building.setBuildingAddress(form.getBuildingAddress()); //ビル住所
        building.setBuildingPhoneNumber(form.getBuildingPhoneNumber()); //ビル電話
        building.setBuildingMail(form.getBuildingMail()); //ビルメール

        // ユーザー登録処理
        boolean result = buildingService.insert(building);

        // ユーザー登録結果の判定
       if (result == true) {
         System.out.println("insert成功");
        } else {
            System.out.println("insert失敗");
        }

        // login.htmlにリダイレクト
        return "redirect:/admin/top";
    }

}
