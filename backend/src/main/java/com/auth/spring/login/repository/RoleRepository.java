package com.auth.spring.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.spring.login.models.ERole;
import com.auth.spring.login.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
}
