package com.fatihbasol.issuemanagement.repository;

import com.fatihbasol.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByUserName(String name);
}
