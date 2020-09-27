package com.adonai.dbupdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonai.dbupdate.model.People;
import com.adonai.dbupdate.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
    private PeopleRepository peopleRepository;

	@Override
	public void save(People people) {
		peopleRepository.save(people);
	}
}
