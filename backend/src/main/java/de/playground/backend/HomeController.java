package de.playground.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping()
    public String forward() {
        return "forward:/index.html";
    }
}