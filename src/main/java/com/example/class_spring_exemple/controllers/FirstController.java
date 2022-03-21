package com.example.class_spring_exemple.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/greeting")
    public String greeting() {
        return "Your name, with an very creative greeting text!";
    }

    @GetMapping("/greeting/{name}")
    public String greetingToYou(@PathVariable String name){
        return name + " with an very creative greeting text!";
    }

    @RequestMapping(value = "/palindrome", method = RequestMethod.GET)
    public String isPalindrome(@RequestParam("query") String word){
        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord.reverse();
        if(reverseWord.toString().equals(word) == true){
            return word + " is a palindrome!";
        }else {
            return word + " isn't a palindrome!";
        }
    }
}
