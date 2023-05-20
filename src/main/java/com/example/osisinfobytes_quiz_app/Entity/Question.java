package com.example.osisinfobytes_quiz_app.Entity;

import lombok.*;

import jakarta.persistence.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Question {
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", Answer=" + Answer +
                '}';
    }

    @Id
    @SequenceGenerator(allocationSize = 1,name = "TableIdQuestion",sequenceName = "TableIdQuestion")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TableIdQuestion")
    private int id;
    @Column(unique = true)
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private Long Answer;
}

