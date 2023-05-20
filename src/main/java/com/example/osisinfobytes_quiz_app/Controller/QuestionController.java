package com.example.osisinfobytes_quiz_app.Controller;

import com.example.osisinfobytes_quiz_app.Entity.Question;
import com.example.osisinfobytes_quiz_app.Entity.UserAnswer;
import com.example.osisinfobytes_quiz_app.Service.QuestionService;
import com.example.osisinfobytes_quiz_app.ServiceImpl.InsertTheUserAnswer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    private HttpServletRequest request;

    public QuestionController(HttpServletRequest request, QuestionService questionService, InsertTheUserAnswer insertTheUserAnswer) {
        this.request = request;
        this.questionService = questionService;
        this.insertTheUserAnswer = insertTheUserAnswer;
    }

    private final QuestionService questionService;

    private final InsertTheUserAnswer insertTheUserAnswer;


    @GetMapping("/api/questions/{id}")
    public String getQuestionById(@PathVariable Long id, Model model) {
        Question question = questionService.getQuestionById(id);
        if (question == null) {
            System.out.println("Session closed");
            return "Thanks";
        }
        model.addAttribute("question", question);
        return "Quiz";
    }
    @GetMapping("/Result")
    String GetLogin()
    {
        return "Login";
    }

    @GetMapping("/questions/{questionId}/submit/{answer}")
    public String submitAnswer(@PathVariable Long questionId, @PathVariable long answer) {


        UserAnswer userAnswer = UserAnswer.builder().
                userAnswer(answer).QuestionId(questionId).UserId(
                        LoginController.id
                ).build();

        insertTheUserAnswer.InsertTheUserChoice(userAnswer);
        return "redirect:/api/questions/" + (++questionId);
    }

}
