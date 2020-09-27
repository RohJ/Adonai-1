package com.adonai.dbupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adonai.dbupdate.model.People;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
