package com.example.demo.formController;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.html.model.Employee;

@Controller
public class ResultController {
	@PostMapping(value = "/processForm", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)

	public String userForm(@RequestParam Map<String, String> user, Model model) {
		System.out.println(user.get("name"));
		System.out.println(user.get("email"));
		 model.addAttribute("name", user.get("name"));
		 model.addAttribute("email", user.get("email"));
		 model.addAttribute("message", user.get("message"));
		 model.addAttribute("condition",Boolean.FALSE);
		 model.addAttribute("role", "manager");
		 model.addAttribute("students", List.of("Surabhi Singh","payal shinde","abc"));
		return "result";
		
		

}
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		 boolean condition = true; // Change this to true or false to see different blocks of content

	        m.addAttribute("condition", condition);

	        return "condition";
		
	}
	@GetMapping("/processForm2")
	public String processform(Model m) {
		 boolean condition = true; // Change this to true or false to see different blocks of content

	        m.addAttribute("condition", condition);

	        return "home";
	    }
	@GetMapping("/items")
	public String getItems(Model model) {
	    List<String> itemList = Arrays.asList("item1", "item2", "item3");
	    model.addAttribute("items", itemList);
	    return "items";
	}
	@GetMapping("/employees")
	public String getEmployees(Model model) {
	    List<Employee> employeeList = Arrays.asList(
	            new Employee("John Smith", "john.smith@example.com", "Sales"),
	            new Employee("Jane Doe", "jane.doe@example.com", "Marketing"),
	            new Employee("Bob Johnson", "bob.johnson@example.com", "HR")
	    );
	    model.addAttribute("employees", employeeList);
	    return "employees";
	}
	@GetMapping("/greeting")
	public String getGreeting(Model model) {
	    LocalTime currentTime = LocalTime.now();
	    String greetingMessage;
	    if (currentTime.getHour() < 12) {
	        greetingMessage = "Good morning!";
	    } else {
	        greetingMessage = "Hello Good Night";
	    }
	    model.addAttribute("greetingMessage", greetingMessage);
	    return "greeting";
	}



}
