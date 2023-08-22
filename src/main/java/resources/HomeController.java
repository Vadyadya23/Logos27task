package resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Homework21_Advanced.Homework21_Advanced.GetMappin;

import java.util.Locale;

@Controlle
public class HomeController {

    private final MessageService messageService;

    public HomeController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMappin("/")
    public String home(Model model, Locale locale) {
        String welcomeMessage = messageService.getMessage("welcome.message", locale);
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "home";
    }
}
