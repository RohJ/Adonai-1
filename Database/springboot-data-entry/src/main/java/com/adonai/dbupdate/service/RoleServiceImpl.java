package com.adonai.dbupdate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonai.dbupdate.model.Role;
import com.adonai.dbupdate.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
    private RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}

}
