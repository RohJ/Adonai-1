package com.adonai.dbupdate.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.adonai.dbupdate.model.People;
import com.adonai.dbupdate.service.PeopleService;

@Component
public class PeopleValidator implements Validator {

	@Autowired
    private PeopleService peopleService;
	

    @Override
    public boolean supports(Class<?> aClass) {
    	return People.class.equals(aClass);
    }


	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
	}
}
