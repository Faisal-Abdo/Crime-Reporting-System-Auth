package com.example.crime_reporting_auth.Repository;

import com.example.crime_reporting_auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
