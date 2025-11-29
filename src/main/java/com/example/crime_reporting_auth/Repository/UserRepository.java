package com.example.crime_reporting_auth.Repository;

import com.example.crime_reporting_auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
