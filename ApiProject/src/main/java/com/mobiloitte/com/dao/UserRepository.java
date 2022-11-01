package com.mobiloitte.com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.com.model.ApplicationModel;

public interface UserRepository extends JpaRepository<ApplicationModel, Long>{

Optional<ApplicationModel>findByUserId(long Id);
}
