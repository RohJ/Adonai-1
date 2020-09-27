package com.adonai.dbupdate.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.adonai.dbupdate.model.Membership;
import com.adonai.dbupdate.service.MembershipService;

@Component
public class MembershipValidator implements Validator {

	@Autowired
    private MembershipService membershipService;
	

    @Override
    public boolean supports(Class<?> aClass) {
    	return Membership.class.equals(aClass);
    }


	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
	}
}
