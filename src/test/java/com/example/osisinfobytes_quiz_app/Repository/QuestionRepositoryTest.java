package com.example.osisinfobytes_quiz_app.Repository;

import com.example.osisinfobytes_quiz_app.Entity.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QuestionRepositoryTest {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionRepositoryTest(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    @Test
    void Insertdata()
    {
        Question question1 = Question.builder()
                .question("What is the capital of France?")
                .option1("Madrid")
                .option2("Paris")
                .option3("Berlin")
                .option4("London")
                .Answer(2L)
                .build();

        Question question2 = Question.builder()
                .question("Who wrote the Harry Potter series?")
                .option1("Stephen King")
                .option2("J.K. Rowling")
                .option3("J.R.R. Tolkien")
                .option4("George R.R. Martin")
                .Answer(2L)
                .build();

        Question question3 = Question.builder()
                .question("What is the largest planet in our solar system?")
                .option1("Venus")
                .option2("Earth")
                .option3("Jupiter")
                .option4("Saturn")
                .Answer(3L)
                .build();

        Question question4 = Question.builder()
                .question("Which language is used to develop Android apps?")
                .option1("Swift")
                .option2("Java")
                .option3("C++")
                .option4("Python")
                .Answer(2L)
                .build();

        Question question5 = Question.builder()
                .question("Who painted the Mona Lisa?")
                .option1("Vincent van Gogh")
                .option2("Leonardo da Vinci")
                .option3("Pablo Picasso")
                .option4("Michelangelo")
                .Answer(2L)
                .build();
questionRepository.saveAll(List.of(question2, question1, question5, question4, question3));
        System.out.println("finished");
    }
    @Test
    public void GetData()
    {
//        String s = questionRepository.findById(1).toString();
//        System.out.println(s);
    }
}