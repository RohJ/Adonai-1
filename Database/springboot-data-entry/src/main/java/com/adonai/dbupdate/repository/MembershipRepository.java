package com.adonai.dbupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adonai.dbupdate.model.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {

}
