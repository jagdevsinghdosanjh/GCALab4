package com.greatlearning.emapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.emapi.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
    Optional<Role> findByName(String name);
}