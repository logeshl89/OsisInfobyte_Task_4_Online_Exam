package com.example.osisinfobytes_quiz_app.Service;

import com.example.osisinfobytes_quiz_app.Entity.Question;

public interface QuestionService {

    Question getQuestionById(Long id);
    void InsertTheUserChoice();
}
