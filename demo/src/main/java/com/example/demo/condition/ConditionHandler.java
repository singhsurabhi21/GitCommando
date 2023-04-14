package com.example.demo.condition;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ConditionHandler {
	
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("gender","F");
		return "condition";
		
	}

}
