package jp.co.jrqss.admin.building.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.jrqss.admin.building.domain.model.ResisterForm;

@Controller
public class ResisterController {

	@GetMapping("/resister")
	public String getResister(@ModelAttribute ResisterForm form, Model model) {

		return "/admin/building/create/resister";
	}

	@PostMapping("/resister")
	public String postResister(@ModelAttribute @Validated
			ResisterForm form,
			BindingResult bindingResult,
			Model model) {

		return "redirect:/admin/building/create/confirm";
	}
}