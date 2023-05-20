package com.example.osisinfobytes_quiz_app.Repository;

import com.example.osisinfobytes_quiz_app.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    @Query(nativeQuery = true,value = "select * from question where id=?1")
    Question findByIdNo(long id);
}

