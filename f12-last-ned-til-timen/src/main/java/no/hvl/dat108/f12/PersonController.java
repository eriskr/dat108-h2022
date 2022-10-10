package no.hvl.dat108.f12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

	@GetMapping("/personskjema")
	public String personskjema(Model model) {
		model.addAttribute("person", new Person());
		return "personSkjemaView";
	}

	@PostMapping("/lagrePerson")
	public String lagrePerson(@ModelAttribute("person") Person person) {
		System.err.println(person);
		System.err.println("Lagrer i database...");

		return "personKvitteringView";
	}

	@GetMapping("/registreringok")
	public String registreringok() {
		return "personKvitteringView";
	}

}