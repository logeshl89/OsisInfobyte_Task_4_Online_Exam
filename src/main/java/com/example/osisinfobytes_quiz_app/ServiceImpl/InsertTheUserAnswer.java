package com.example.osisinfobytes_quiz_app.ServiceImpl;

import com.example.osisinfobytes_quiz_app.Entity.UserAnswer;
import com.example.osisinfobytes_quiz_app.Repository.UserAnserRepository;
import org.springframework.stereotype.Service;

@Service
public class InsertTheUserAnswer {
    private final UserAnserRepository userAnserRepository;

    public InsertTheUserAnswer(UserAnserRepository userAnserRepository) {
        this.userAnserRepository = userAnserRepository;
    }
    public  void InsertTheUserChoice(UserAnswer userAnswer)
    {
        userAnserRepository.save(userAnswer);
    }
}
