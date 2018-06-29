package com.example3.ChuckNorrisQuotes.controllers;

import com.example3.ChuckNorrisQuotes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String tellAJoke(Model model){

        model.addAttribute("joke", jokeService.joke());
        return "chucknorris";
    }

}