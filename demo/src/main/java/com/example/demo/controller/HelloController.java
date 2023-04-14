package com.example.demo.controller;
//

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//	@RequestMapping(value = "Hello",method = RequestMethod.GET)
////	 @GetMapping("/")
//	public String getGreetingMassage() {
//		return "Hello from spring application";
//	}
//
//}

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.util.StreamUtils;
import java.nio.charset.Charset;
import java.io.IOException;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public ModelAndView viewResolver() {

		return new ModelAndView("hello2.html");

	}

	

}
