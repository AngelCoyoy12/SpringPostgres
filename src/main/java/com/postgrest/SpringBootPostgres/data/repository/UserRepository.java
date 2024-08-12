package com.postgrest.SpringBootPostgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.postgrest.SpringBootPostgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
