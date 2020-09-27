package com.adonai.dbupdate.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adonai.dbupdate.model.Membership;
import com.adonai.dbupdate.service.MembershipService;
import com.adonai.dbupdate.validator.MembershipValidator;

@Controller
@RequestMapping("/membership")
public class MembershipController {

	@Autowired
	private MembershipService membershipService;
	
	@Autowired
	private MembershipValidator membershipValidator;
	
	@GetMapping("/add")
	public String addMembership(Model model) {
		
		model.addAttribute("membership", new Membership());
		
		return "membership";
	}
	
	@PostMapping("/add")
	public String addMembership(@ModelAttribute("membership") Membership membership, BindingResult bindingResult) {
		
		// TODO: To be implemented
		membershipValidator.validate(membership, bindingResult);

		if (bindingResult.hasErrors()) {
			return "membership";
		}
		
		membershipService.save(membership);
		
		return "membership-confirmation";
	}
}
