package de.teamwaldstadt.fupg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class FupgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FupgApplication.class, args);
	}

	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("date", System.currentTimeMillis());
		return "index";
	}
}
