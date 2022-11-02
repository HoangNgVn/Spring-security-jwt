package com.example.springsecurityintroduction.repository;

import java.util.Optional;

import com.example.springsecurityintroduction.entity.ERole;
import com.example.springsecurityintroduction.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
