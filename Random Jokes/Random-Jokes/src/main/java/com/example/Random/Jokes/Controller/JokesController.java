package com.example.Random.Jokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {

    static  ArrayList<String> jokesList = new ArrayList<>();

    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String jokes){
        jokesList.add(jokes);

        return "jokes saved";
    }

    @GetMapping(value = "jokes")
    public  String getJokes(){
//        ArrayList<String> jokesList = new ArrayList<>();
//        jokesList.add("Its show time");
//        jokesList.add("What is happening to jokes");
//        jokesList.add("Its my time");
//        jokesList.add("Its your time");

        int randomNumber = (int) (Math.random() * ((jokesList.size()-1) + 1));

        return jokesList.get(randomNumber);



    }


}
