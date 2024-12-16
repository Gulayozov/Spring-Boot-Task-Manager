package com.example.taskmanager.controller;

import com.example.taskmanager.model.MathResult;
import com.example.taskmanager.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/add")
    public MathResult add(@RequestParam double a, @RequestParam double b) {
        return new MathResult(mathService.add(a, b));
    }

    @GetMapping("/subtract")
    public MathResult subtract(@RequestParam double a, @RequestParam double b) {
        return new MathResult(mathService.subtract(a, b));
    }

    @GetMapping("/multiply")
    public MathResult multiply(@RequestParam double a, @RequestParam double b) {
        return new MathResult(mathService.multiply(a, b));
    }

    @GetMapping("/divide")
    public MathResult divide(@RequestParam double a, @RequestParam double b) {
        return new MathResult(mathService.divide(a, b));
    }
}
