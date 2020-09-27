package com.adonai.dbupdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonai.dbupdate.model.Membership;
import com.adonai.dbupdate.repository.MembershipRepository;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipRepository membershipRepository;

	@Override
	public void save(Membership membership) {
		membershipRepository.save(membership);
	}
}
