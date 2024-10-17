package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    @EntityGraph( attributePaths = "roles")
    User findByUsername(String username);
}
