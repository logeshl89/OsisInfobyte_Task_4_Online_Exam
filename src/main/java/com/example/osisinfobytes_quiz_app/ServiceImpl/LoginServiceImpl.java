package com.example.osisinfobytes_quiz_app.ServiceImpl;

import com.example.osisinfobytes_quiz_app.Entity.User;
import com.example.osisinfobytes_quiz_app.Repository.UserRepository;
import com.example.osisinfobytes_quiz_app.Service.LoginService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;


    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            return null;
        }

        if (passwordEncoder().matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
