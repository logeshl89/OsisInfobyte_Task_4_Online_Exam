package com.example.osisinfobytes_quiz_app.Controller;

import com.example.osisinfobytes_quiz_app.DTO.LoginRequestDto;
import com.example.osisinfobytes_quiz_app.Entity.User;
import com.example.osisinfobytes_quiz_app.ServiceImpl.LoginServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    String GetTheDefault() {
        return "Login";
    }

    private final LoginServiceImpl loginService;
    static long id;

    public LoginController(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @GetMapping("api/login")
    public String GetTheLogin() {
        return "Login";
    }

    @PostMapping("api/login")
    public String Login(@ModelAttribute("user") LoginRequestDto loginRequestDto, Model model) {

        User loggedInUser = loginService.login(loginRequestDto.getUsername(), loginRequestDto.getPassword());
        if (loggedInUser == null) {
            model.addAttribute("error", "Invalid username or password");
            return "Login";
        } else {
            id = loggedInUser.getId();
            System.out.println("User Id : "+id);
            System.out.println("Session Created");
            return "Instrruction";
        }
    }
}
