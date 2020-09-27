package com.adonai.dbupdate.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.adonai.dbupdate.entity.DBObjects;
import com.adonai.dbupdate.entity.RoleList;
import com.adonai.dbupdate.entity.RoleWrapper;
import com.adonai.dbupdate.entity.UserForm;
import com.adonai.dbupdate.model.Role;
import com.adonai.dbupdate.model.User;
import com.adonai.dbupdate.service.RoleService;
import com.adonai.dbupdate.service.SecurityService;
import com.adonai.dbupdate.service.UserService;
import com.adonai.dbupdate.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@GetMapping("/registration")
	public String registration(Model model) {

		model.addAttribute("userForm", new UserForm());

		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult) {
		
		userValidator.validate(userForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return "registration";
		}
		
		Role role =  roleService.findByName(DBObjects.Roles[1]);
		
		Set<Role> userRoles = new HashSet<>();
		userRoles.add(role);
		
		User user = new User(userForm.getUsername(), userForm.getPassword(), userForm.getPasswordConfirm(), userRoles);
		userService.save(user);

		securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());

		return "redirect:/welcome";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		return "login";
	}

	@GetMapping({"/", "/welcome"})
	public String welcome(Model model) {
		return "welcome";
	}

	@ModelAttribute("roleList")
	public List<String> getRoleList() {

		List<Role> roles =  roleService.findAll();
		
		List<String> roleList = new ArrayList();

		for(int i=0; i<roles.size(); i++) {
			Role r = roles.get(i);
			roleList.add(r.getName());
		}

		return roleList;
	}
}
