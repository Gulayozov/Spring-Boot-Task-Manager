package com.example.taskmanager.controller;

import com.example.taskmanager.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {

    @Autowired
    private StringService stringService;

    @GetMapping("/reverse")
    public String reverse(@RequestParam String input) {
        return stringService.reverseString(input);
    }

    @GetMapping("/count-vowels")
    public int countVowels(@RequestParam String input) {
        return stringService.countVowels(input);
    }

    @GetMapping("/to-upper")
    public String toUpperCase(@RequestParam String input) {
        return stringService.toUpperCase(input);
    }
}