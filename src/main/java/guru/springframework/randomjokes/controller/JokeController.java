package guru.springframework.randomjokes.controller;

import guru.springframework.randomjokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokesService jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    private String getRandomJokes(Model model) {
        model.addAttribute("joke", jokesService.getJokes());
        return "index";
    }
}
