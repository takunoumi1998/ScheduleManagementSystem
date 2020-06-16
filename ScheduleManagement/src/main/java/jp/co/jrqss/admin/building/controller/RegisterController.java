package jp.co.jrqss.admin.building.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.building.domain.model.RegisterForm;

@Controller
public class RegisterController {

	//private Map<String, String> getCheckBoxItems(){

		Map<String, String> selectMap = new LinkedHashMap<>();

		//return selectMap;
	//}

	/**
     * ビル情報登録画面のGETメソッド用処理.
     */
	@GetMapping("/register")
	public String getRegister(@ModelAttribute RegisterForm form,Model model) {

		// チェックボックスの初期化メソッド呼び出し


		// ビル：register.htmlに画面遷移
		return "admin/building/create/register";
	}

	/**
     * ビル情報登録画面のPOSTメソッド用処理.
     */
    @PostMapping("/register")
    public String postConfirm(@ModelAttribute @Validated RegisterForm form,
    		BindingResult bindingresult,Model model) {


    	// ビル：confirm.htmlに画面遷移
    	return "redirect:/admin/building/create/confirm";
    }

    @PostMapping("/complete")
    public String postComplete(@ModelAttribute RegisterForm form,
    		Model model) {

    	// ビル：complete.htmlに画面遷移
    	return "admin/building/create/complete";
    }

}

