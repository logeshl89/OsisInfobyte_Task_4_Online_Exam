package com.example.osisinfobytes_quiz_app.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @SequenceGenerator(name = "User_Id",allocationSize = 1,sequenceName = "User_Id")
    @GeneratedValue(generator ="User_Id",strategy = GenerationType.SEQUENCE)
    private long id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }

    @Column(unique = true)
    private String username;
    @Column(length = 100)
    private String password;
    private String gender;
    @Column(columnDefinition = "integer default 0")
    private int score;
}

