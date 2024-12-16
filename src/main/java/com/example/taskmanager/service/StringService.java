package com.example.taskmanager.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
}
