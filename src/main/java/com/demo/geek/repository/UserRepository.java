package com.demo.geek.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.geek.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}