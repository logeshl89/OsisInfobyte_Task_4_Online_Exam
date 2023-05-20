package com.example.osisinfobytes_quiz_app.ServiceImpl;

import com.example.osisinfobytes_quiz_app.Entity.Question;
import com.example.osisinfobytes_quiz_app.Repository.QuestionRepository;
import com.example.osisinfobytes_quiz_app.Service.QuestionService;
import org.springframework.stereotype.Service;

@Service
public class QustionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    public QustionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findByIdNo(id);
    }

    @Override
    public void InsertTheUserChoice() {
//        userAnswerRepository.save();
    }


}
