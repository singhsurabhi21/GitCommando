package com.example.demo.formController;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FormController {

	@GetMapping("/form")
	public ModelAndView form() {
		return new ModelAndView("form.html");
	}
	
//	@PostMapping(value = "/processForm", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//
//	public String userForm(@RequestParam Map<String, String> user, Model model) {
//		System.out.println(user.get("name"));
//		System.out.println(user.get("email"));
//		 model.addAttribute("name", user.get("name"));
//		return "result";
//
//	}   
}
