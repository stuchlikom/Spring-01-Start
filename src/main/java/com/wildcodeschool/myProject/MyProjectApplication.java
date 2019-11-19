package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		//return "Greetings from <a href='https://spring.io/projects/spring-boot'>Spring Boot!</a>";
		return "<ul>" +
			"<li><a href='/doctor/1'>Doctor 1</a></li>" +
			"<li><a href='/doctor/4'>Doctor 4</a></li>" +
			"<li><a href='/doctor/10'>Doctor 10</a></li>" +
			"<li><a href='/doctor/13'>Doctor 13</a></li>" +
			"</ul>";
	}

	@GetMapping("/doctor/1")
	@ResponseBody
	public String Doctor1() {
		return "William Hartnell";
	}

	@GetMapping("/doctor/4")
	@ResponseBody
	public String Doctor4() {
		return "Tom Baker";
	}

	@GetMapping("/doctor/10")
	@ResponseBody
	public String Doctor10() {
		return "David Tennant";
	}

	@GetMapping("/doctor/13")
	@ResponseBody
	public String Doctor13() {
		return "Jodie Whittaker";
	}

//	@GetMapping("/greeting")
//	@ResponseBody
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		model.addAttribute("name", name);
//		return "Hello " + name;
//	}

}


