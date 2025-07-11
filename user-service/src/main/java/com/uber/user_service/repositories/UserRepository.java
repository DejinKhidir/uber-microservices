package com.uber.user_service.repositories;

import com.uber.user_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); // useful for login and uniqueness checks

}
