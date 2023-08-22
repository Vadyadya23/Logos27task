package Homework21_Advanced.Homework21_Advanced;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controll
public class AuthController {
    @GetMap("/login")
    public String login() {
        return "login"; // Return the name of the login.jsp file
    }

    @GetMappin("/register")
    public String register() {
        return "register"; // Return the name of the register.jsp file
    }

    @GetMapp("/dashboard")
    public String dashboard() {
        return "dashboard"; // Return the name of the dashboard.jsp file
    }
}

