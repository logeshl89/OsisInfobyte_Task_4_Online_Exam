package com.example.osisinfobytes_quiz_app.Repository;

import com.example.osisinfobytes_quiz_app.Entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAnserRepository extends JpaRepository<UserAnswer,Long> {
}
