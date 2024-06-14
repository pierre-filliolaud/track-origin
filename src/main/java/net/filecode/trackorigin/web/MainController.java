package net.filecode.trackorigin.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String handleRequest(HttpServletRequest request) {
        return "redirect:https://www.google.com";
    }
}
