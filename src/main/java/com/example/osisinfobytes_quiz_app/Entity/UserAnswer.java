package com.example.osisinfobytes_quiz_app.Entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_answers")
@Builder
public class UserAnswer {
    @Id
    @SequenceGenerator(name = "TableId",sequenceName = "tableId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tableId")
    private int id;


    private long UserId;

    private Long QuestionId;

    @Column(name = "user_answer")
    private Long userAnswer;
}

