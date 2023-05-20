package com.example.osisinfobytes_quiz_app.Repository;

import com.example.osisinfobytes_quiz_app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
