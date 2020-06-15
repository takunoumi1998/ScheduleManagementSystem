package jp.co.jrqss.admin.building.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	private Map<String, String> getCheckBoxItems(){

		Map<String, String> selectMap = new LinkedHashMap<>();

		return selectMap;
	}

	/**
     * ビル情報登録画面のGETメソッド用処理.
     */
	@GetMapping("/register")
	public String getRegister(Model model) {

		// チェックボックスの初期化メソッド呼び出し


		// BuildingRegister.htmlに画面遷移
		return "create/register";
	}

	/**
     * ビル情報登録画面のPOSTメソッド用処理.
     */
    @PostMapping("/register")
    public String postRegister(Model model) {


    	// BuildingRegisterCushon.htmlに画面遷移
    	return "create/confirm";
    }

}

