package com.example.zadanie2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/")
public class Endpoint {

    @GetMapping("upper/{input}")
    public ResponseEntity<String> upper(@PathVariable String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return new ResponseEntity<>("Zawiera duże litery", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Nie zawiera dużych liter", HttpStatus.OK);
    }

    @GetMapping("lower/{input}")
    public ResponseEntity<String> lower(@PathVariable String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                return new ResponseEntity<>("Zawiera małe litery", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Nie zawiera małych liter", HttpStatus.OK);
    }

    @GetMapping("digit/{input}")
    public ResponseEntity<String> digit(@PathVariable String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return new ResponseEntity<>("Zawiera cyfry", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Nie zawiera cyfr", HttpStatus.OK);
    }

    @GetMapping("special/{input}")
    public ResponseEntity<String> special(@PathVariable String input) {


        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(input);
        boolean hasSpecial = matcher.find();

        if (hasSpecial) {
            return new ResponseEntity<>("Zawiera znaki specjalne", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Nie zawiera znaków specjanych", HttpStatus.OK);
        }
    }
}
