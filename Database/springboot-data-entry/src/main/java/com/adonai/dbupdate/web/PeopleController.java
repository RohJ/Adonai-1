package com.adonai.dbupdate.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adonai.dbupdate.model.People;
import com.adonai.dbupdate.service.PeopleService;
import com.adonai.dbupdate.validator.PeopleValidator;

@Controller
@RequestMapping("/people")
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	
	@Autowired
	private PeopleValidator peopleValidator;
	
	@GetMapping("/add")
	public String addPeople(Model model) {
		
		model.addAttribute("peopleForm", new People());
		
		return "people";
	}
	
	@PostMapping("/add")
	public String addPeople(@ModelAttribute("peopleForm") People people, BindingResult bindingResult) {
		
		System.out.println(people.getDob());
		
		// TODO: To be implemented
		peopleValidator.validate(people, bindingResult);

		if (bindingResult.hasErrors()) {
			return "people";
		}
		
		peopleService.save(people);
		
		return "people-confirmation";
	}
	
}
