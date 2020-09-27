package com.adonai.dbupdate.service;

import java.util.List;

import com.adonai.dbupdate.model.Role;

public interface RoleService {

	List<Role> findAll();
	
	Role findByName(String name);
}
